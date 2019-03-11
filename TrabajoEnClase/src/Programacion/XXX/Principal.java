package Programacion.XXX;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	static List<PalabraEspecialIntroducidaListener> palabraIntroducidaListener = 
			new ArrayList<PalabraEspecialIntroducidaListener>();

	/**
	 * 
	 * @param listener
	 */
	public static void addPalabraImparIntroducidaListener (PalabraEspecialIntroducidaListener listener) {
		palabraIntroducidaListener.add(listener);
	}
	
	/**
	 * 
	 * @param listener
	 */
	public static void removePalabraImparIntroducidaListener (PalabraEspecialIntroducidaListener listener) {
		palabraIntroducidaListener.remove(listener);
	}

	/**
	 * 
	 * @param e
	 */
	public static void firePalabraEspecialIntroducidaListener (PalabraEspecialIntroducidaEvent e) {
		for (PalabraEspecialIntroducidaListener listener : palabraIntroducidaListener) {
			listener.palabraIntroducida(e);
		}
	}

	/**
	 * 
	 * @param e
	 */
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Carlos carlos = new Carlos();
		Fran fran = new Fran();
		addPalabraImparIntroducidaListener(fran);
		
		
		
		while (true) {
			String palabraIntroducida =JOptionPane.showInputDialog("Introduzca n�mero: ");
			System.out.println("N�mero introducido: " + palabraIntroducida);
			
			// Notifico a los listeners
			if (palabraIntroducida.equals("avioneta")) {
				PalabraEspecialIntroducida event = new PalabraEspecialIntroducida(palabraIntroducida);
				firePalabraEspecialIntroducida(event);
			}
			
			// Notifico n�mero primo
			boolean esPrimo =true;
			for (int i = 2; i == palabraIntroducida - 1; i++) {
				if (palabraIntroducida % i == 0) {
					esPrimo = false;
				}
			}
			if (esPrimo) fireNumeroPrimoIntroducidoListener(new PalabraEspecialIntroducida(palabraIntroducida));
			
		}

	}

}
