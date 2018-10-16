package Programacion;

import javax.swing.JOptionPane;

public class ejercicio1bucles {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		// Declaraci�n de las variables
				int i, acumuladorNumerosMayoresDiez = 0;
				int cantidadNumerosAPedir = 0;
				
				// Petici�n al usuario de la cantidad de n�meros
				cantidadNumerosAPedir = Integer.parseInt(
						JOptionPane.showInputDialog("Introduzca cu�ntos n�meros desea"));
				
				// Bucle for que se ejecuta n veces
				for (i = 0; i < cantidadNumerosAPedir; i++) {
					// Petici�n del n�mero al usuario
					int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero " + (i+1)));
					
					// Si el n�mero no es mayor a 10 no lo tenemos en cuenta
					if (numero > 10) {
						// Si el n�mero es mayor a 10 entramos al condicional
						// y se acumula el valor
						acumuladorNumerosMayoresDiez += numero;
					}
				}
				
				// Sacamos el mensaje final con el valor acumulado
				JOptionPane.showMessageDialog(null, "Total acumulado " + acumuladorNumerosMayoresDiez);

	}

}
