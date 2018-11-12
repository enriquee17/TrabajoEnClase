package Programacion.orientacionAObjetos.juegoOca;

public class Jugador {
	private int posicion = 0;
	private String nombre;
	/**
	 * 
	 */
	public Jugador() {
		super();
	}
/**
 * 
 * @param posicion
 * @param nombre
 */
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void tirarDado () {
		
		int dado = (int)Math.round(Math.random()*(6-1)+1);
		System.out.println("dado:" +dado);
		this.posicion += dado;
	
		if (this.posicion > 62) {
			this.posicion = 62 - (this.posicion - 62);
		}
	}
	/**
	 * 
	 */
	
	public void imprimir() {
		System.out.println(this.nombre + " - pos: " + this.posicion);
	}
	/**
	 * 
	 * @return
	 */
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
