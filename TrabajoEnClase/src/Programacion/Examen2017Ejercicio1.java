package Programacion;

import javax.swing.JOptionPane;

public class Examen2017Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mensaje = "";
		int num1, num2, opcion;
		boolean salir = false;
		String menu = "MENU\n" + "1.- Area de un triangulo\n" + "2.- Perimetro de una circunferencia\n"
				+ "3.- Numeros al azar hasta que salga 47\n" + "0.- Fin";

		opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

		while (!salir) {
			switch (opcion) {

			// Area de un triangulo
			case 1:
				float base = Float.parseFloat(JOptionPane.showInputDialog("Intoduzca base"));
				float altura = Float.parseFloat(JOptionPane.showInputDialog("Introduzca altura"));
				mensaje = "Resultado: " + (base * altura / 2);
				break;
			// Perimetro de una circunferencia
			case 2:
				float radio = Float.parseFloat(JOptionPane.showInputDialog("Intoduzca radio"));
				mensaje = "Resultado: " + (2 * Math.PI * radio);
				break;
			// Numeros al azar
			case 3:
				int num = 0;
				do {
					num = (int) Math.round(Math.random() * 100);
					mensaje = "Numeros generados correctamente";
					System.out.print(num);
					System.out.print(" ");
				} while (num != 47);

				break;
			case 4:
				salir = true;
				break;

			default:
				mensaje = "Opci�n incorrecta, elija bien";
			}

		}
		// Saca la informaci�n al usuario
		JOptionPane.showMessageDialog(null, mensaje);

	}

}
