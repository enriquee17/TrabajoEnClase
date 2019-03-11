package Programacion.Juego_Arkanoid.Version_1;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import Programacion.Arkanoid;
import Programacion.Arkanoid.Ball;
import Programacion.Arkanoid.Brick;
import Programacion.Arkanoid.Paddle;
import Programacion.Arkanoid.ScoreBoard;

public class Arkanoid extends JFrame implements KeyListener {
	
	private static final long serialVersionUID = 1L;
	
	/* CONSTANTS */

	public static final int SCREEN_WIDTH = 800;
	public static final int SCREEN_HEIGHT = 600;

	public static final double BALL_RADIUS = 10.0;
	public static final double BALL_VELOCITY = 0.7;

	public static final double PADDLE_WIDTH = 60.0;
	public static final double PADDLE_HEIGHT = 20.0;
	public static final double PADDLE_VELOCITY = 0.6;

	public static final double BLOCK_WIDTH = 60.0;
	public static final double BLOCK_HEIGHT = 20.0;

	public static final int COUNT_BLOCKS_X = 11;
	public static final int COUNT_BLOCKS_Y = 4;

	public static final int PLAYER_LIVES = 5;

	public static final double FT_SLICE = 1.0;
	public static final double FT_STEP = 1.0;

	private static final String FONT = "Courier New";
	
	/* GAME VARIABLES */

	private boolean tryAgain = false;
	private boolean running = false;

	private Paleta paleta = new Paleta(SCREEN_WIDTH / 2, SCREEN_HEIGHT - 50);
	private Pelota pelota = new Pelota(SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);
	private List<Ladrillo> ladrillos = new ArrayList<Arkanoid.Ladrillo>();
	private ScoreBoard scoreboard = new ScoreBoard();

	private double lastFt;
	private double currentSlice;


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
