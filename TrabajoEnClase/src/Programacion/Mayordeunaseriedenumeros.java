package Programacion;

import javax.swing.JOptionPane;

public class Mayordeunaseriedenumeros {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		int numero = 1, mayor = 0;
		String mensaje = "Introduzca n�mero (0 -> Terminar)";
		
		for (int i = 0; numero != 0; i++) {
			if (i == 0) { // Primera iteraci�n
				mayor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				numero = mayor; 
			}
			else { // Resto de iteraciones
				numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
				if (numero > mayor && numero != 0) {
					mayor = numero;
				}
			}	
		}
		
		JOptionPane.showMessageDialog(null, "Mayor: " + mayor);

	}

}
