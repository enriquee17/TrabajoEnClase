package Programacion;

import javax.swing.JOptionPane;

public class Mediadeunacantidaddenumeros {

	public static void main(String[] args) {
	
		
		int cantidadnumeros= 0;
		int suma=0;
		
		cantidadnumeros=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad de numeros que desee "));
		
		for (int i = 0; i < cantidadnumeros; i++) {
		
			int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero" ));
		
			suma=suma+numero;
		
		
		
		}
	
		JOptionPane.showMessageDialog(null, "La media de los numeros introducidos es: " + ((float) suma/cantidadnumeros));
	}

}
