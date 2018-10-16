package Programacion;

import javax.swing.JOptionPane;

public class Ejercicio3bloque3 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		// Declaraci�n de todas la variables necesarias
				String mensaje;		
				int num1, num2, opcion;
				String menu = "MENU\n"
						+ "1.- Hipotenusa de tri�ngulo rect�ngulo\n"
						+ "2.- C�lculo de la superficie de un c�rculo\n"
						+ "3.- C�lculo del per�metro de una circunferencia\n"
						+ "4.- C�lculo del �rea de un rect�ngulo\n"
						+ "5.- C�lculo del �rea de un tri�ngulo\n"
						+ "0.- Salir\n";
				
				opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
						
				// Resoluci�n de la operaci�n seg�n el tipo de operaci�n pedido por el usuario
				switch (opcion) {
				case 1: // Hipotenusa de tri�ngulo rect�ngulo
					// Petici�n de los dos valores, en todos los casos se piden DOS valores
					float cateto1 = Float.parseFloat(JOptionPane.showInputDialog("Intoduzca primer cateto"));
					float cateto2 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca segundo cateto"));
					mensaje = "Resultado: " + (Math.sqrt(cateto1*cateto1 + Math.pow(cateto2, 2)));
					break;
				case 2: // C�lculo de la superficie de un c�rculo
					float radio = Float.parseFloat(JOptionPane.showInputDialog("Intoduzca radio"));
					mensaje = "Resultado: " + (Math.PI * Math.pow(radio, 2));
					break;
				case 3: // C�lculo del per�metro de una circunferencia
					radio = Float.parseFloat(JOptionPane.showInputDialog("Intoduzca radio"));
					mensaje = "Resultado: " + (2 * Math.PI * radio);
					break;
				case 4: // C�lculo del �rea de un rect�ngulo
					float base = Float.parseFloat(JOptionPane.showInputDialog("Intoduzca base"));
					float altura = Float.parseFloat(JOptionPane.showInputDialog("Introduzca altura"));
					mensaje = "Resultado: " + (base * altura);
					break;
				case 5: // C�lculo del �rea de un tri�ngulo
					base = Float.parseFloat(JOptionPane.showInputDialog("Intoduzca base"));
					altura = Float.parseFloat(JOptionPane.showInputDialog("Introduzca altura"));
					mensaje = "Resultado: " + (base * altura / 2);
					break;
				case 6: // Potencia de dos n�meros
					mensaje = "Resultado: ";
					break;
				case 7: // ra�z n-�sima de un n�mero
					mensaje = "Resultado: ";
					break;
				default:
					mensaje = "Opci�n incorrecta, elija bien";
				}  
				
				// Saca la informaci�n al usuario
				JOptionPane.showMessageDialog(null, mensaje);
	}

}
