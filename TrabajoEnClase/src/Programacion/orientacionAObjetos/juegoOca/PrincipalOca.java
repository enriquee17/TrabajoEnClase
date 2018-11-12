package Programacion.orientacionAObjetos.juegoOca;



public class PrincipalOca {

	public static void main (String args []) {
		//Inicializacion e impresion de tablero
		Tablero tablero = new Tablero();
		tablero.imprimeTablero();
		
		Jugador jugador = new Jugador("Rojo");
		do {
			jugador.tirarDado();
			jugador.imprimir();
		} while(jugador.getPosicion() < 62);
	}
	
}
