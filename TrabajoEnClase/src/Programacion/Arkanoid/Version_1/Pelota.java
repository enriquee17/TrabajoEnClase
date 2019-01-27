/**
 * Curso Básico de desarrollo de Juegos en Java - Invaders
 * 
 * (c) 2004 Planetalia S.L. - Todos los derechos reservados. Prohibida su reproducción
 * 
 * http://www.planetalia.com
 * 
 */
package Programacion.Arkanoid.Version_1;

public class Pelota extends Objetos {
	protected int vx=2;
	protected int vy=3;

	public Pelota(Stage stage) {
		super(stage);
		setSpriteNames( new String[] {"Pelota.gif"});
		setFrameSpeed(35);
	}
	
	public void act() {
		super.act();
		x+=vx;
		if (x < 0 || x > Stage.WIDTH -32)
		  vx = -vx;
		y+=vy;
		if (y < 0 || y > Stage.HEIGHT -48)
		  vy = -vy;
		
	}

	public int getVx() { return vx; }
	public void setVx(int i) {vx = i;	}
}
