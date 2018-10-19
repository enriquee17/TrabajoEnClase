package Programacion;

import javax.swing.JOptionPane;

public class Ejercicio2bloque3Calculadora {
 
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		// Declaraci�n de todas la variables necesarias
				String mensaje = "";		
				int num1, num2, opcion;
				String menu = "MENU\n"
						+ "1.- Suma de dos n�meros\n"
						+ "2.- Resta de dos n�meros\n"
						+ "3.- Multiplicaci�n de dos n�meros\n"
						+ "4.- Divisi�n\n"
						+ "5.- M�dulo de la divisi�n entera\n"
						+ "6.- Potencia de dos n�meros\n"
						+ "7.- Ra�z n-esima de un n�mero";
				
				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
				
				// Petici�n de los dos valores, en todos los casos se piden DOS valores
				num1 = Integer.parseInt(JOptionPane.showInputDialog("Intoduzca primer n�mero"));
				num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca segundo n�mero"));
				
				// Resoluci�n de la operaci�n seg�n el tipo de operaci�n pedido por el usuario
				switch (opcion) {
				case 1: // Suma de dos n�meros
					mensaje = "Resultado: " + (num1 + num2);
					break;
				case 2: // Resta de dos n�meros
					mensaje = "Resultado: " + (num1 - num2);
					break;
				case 3: // Multiplicaci�n de dos n�meros
					mensaje = "Resultado: " + (num1 * num2);
					break;
				case 4: // Divisi�n de dos n�meros
					mensaje = "Resultado: " + ((float) num1 / num2);
					break;
				case 5: // M�dulo de la Divisi�n de dos n�meros
					mensaje = "Resultado: " + (num1 % num2);
					break;
				case 6: // Potencia de dos n�meros
					mensaje = "Resultado: " + Math.pow(num1, num2);
					break;
				case 7: // ra�z n-�sima de un n�mero
					mensaje = "Resultado: " + Math.pow(num2, (float) 1 / num1);
					break;
				}  
				
				// Saca la informaci�n al usuario
				JOptionPane.showMessageDialog(null, mensaje);
	}

}
