package Programacion.Ahorcadoo.Version_1;



public class Jugador {
	private int fallos = 6;
	private int tiradas;
	/**
	 * 
	 */
	public Jugador() {
		super();
	}
	/**
	 * 
	 * @return
	 */
	//String intentoUsuario () {
		//String palabraIntroducida = JOptionPane.showInputDialog("introduce un caracter o una palabra");
		//return palabraIntroducida;
	//}
	/**
	 * 
	 * @param fallos
	 * @param tiradas
	 */

	public Jugador(int fallos, int tiradas) {
		super();
		this.fallos = fallos;
		this.tiradas = tiradas;
	}
	/**
	 * 
	 * @return
	 */
	public int getFallos() {
		return fallos;
	}

	public void setFallos(int fallos) {
		this.fallos = fallos;
	}

	public int getTiradas() {
		return tiradas;
	}

	public void setTiradas(int tiradas) {
		this.tiradas = tiradas;
	}

	@Override
	public String toString() {
		return "Jugador [fallos=" + fallos + ", tiradas=" + tiradas + "]";
	}
	
	
	

}
