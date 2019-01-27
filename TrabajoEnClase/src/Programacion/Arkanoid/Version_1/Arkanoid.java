package Programacion.Arkanoid.Version_1;
/**
 * Curso Básico de desarrollo de Juegos en Java - Invaders

 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducción
 * 
 * http://www.planetalia.com
 * 
 */


import java.awt.Canvas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Arkanoid extends Canvas implements Stage, KeyListener {
	
	private BufferStrategy strategy;
	private long usedTime;
	
	private SpriteCache spriteCache;
	private ArrayList actors; 
	private Nave player;
	private BufferedImage imgFondo;
	private int t;
	
	public Arkanoid() {
		spriteCache = new SpriteCache();
		
	
		JFrame ventana = new JFrame("Arkanoid");
		JPanel panel = (JPanel)ventana.getContentPane();
		setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		panel.setPreferredSize(new Dimension(Stage.WIDTH,Stage.HEIGHT));
		panel.setLayout(null);
		panel.add(this);
		ventana.setBounds(0,0,Stage.WIDTH,Stage.HEIGHT);
		ventana.setVisible(true);
		ventana.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		ventana.setResizable(false);
		createBufferStrategy(2);
		strategy = getBufferStrategy();
		requestFocus();
		addKeyListener(this);
	}
	
	
	
	public void initWorld() {
    actors = new ArrayList();
    for (int i = 0; i < 1; i++){
      Pelota m = new Pelota(this);
      
      
      actors.add(m);
    }
    
    player = new Nave(this);
    player.setX(Stage.WIDTH -350);
    player.setY(Stage.HEIGHT-64);
	}
	

	
	public void updateWorld() {
		for (int i = 0; i < actors.size(); i++) {
			Objetos m = (Objetos)actors.get(i);
			m.act();
		}
		player.act();
	}
	
	public void paintWorld() {
		
		Graphics2D g = (Graphics2D)strategy.getDrawGraphics();
		imgFondo = spriteCache.getSprite("fondo.jpg");
		g.setPaint(new TexturePaint(imgFondo, new Rectangle(0,t,imgFondo.getWidth(),imgFondo.getHeight())));
		g.fillRect(0,0,getWidth(),getHeight());
		for (int i = 0; i < actors.size(); i++) {
			Objetos m = (Objetos)actors.get(i);
			m.paint(g);
		}
		Font fuente=new Font("Monospaced", Font.BOLD, 20);
		
		g.setColor(Color.white);
		g.setFont(fuente);
		g.drawString("ARKANOID", 263, 50);
		player.paint(g);
		g.setColor(Color.white);
		if (usedTime > 0)
		  g.drawString(String.valueOf(1000/usedTime)+" fps",0,Stage.HEIGHT-50);
  	else
	  	g.drawString("--- fps",0,Stage.HEIGHT-50);
		strategy.show();
	}
	
	public SpriteCache getSpriteCache() {
		return spriteCache;
	}
	
	public void keyPressed(KeyEvent e) {
		player.keyPressed(e);
	}
	
	public void keyReleased(KeyEvent e) {
		player.keyReleased(e);
	}
	public void keyTyped(KeyEvent e) {}
	
	public void game() {
		usedTime=1000;
		initWorld();
		while (isVisible()) {
			long startTime = System.currentTimeMillis();
			updateWorld();
			paintWorld();
			usedTime = System.currentTimeMillis()-startTime;
			try { 
				 Thread.sleep(SPEED);
			} catch (InterruptedException e) {}
		}
	}
	
	public static void main(String[] args) {
		Arkanoid inv = new Arkanoid();
		inv.game();
	}
}
