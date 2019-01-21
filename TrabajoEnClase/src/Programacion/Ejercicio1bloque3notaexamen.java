package Programacion;

import javax.swing.JOptionPane;

public class Ejercicio1bloque3notaexamen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota: "));
		String mensaje = "";

		switch (num) {
		case 0:
		case 1:
			mensaje = "Muy deficiente";
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			mensaje = "Suficiente";
			break;
		case 6:
			mensaje = "Bien";
			break;
		case 7:
		case 8:
			mensaje = "Notable";
			break;
		case 9:
		case 10:
			mensaje = "Sobresaliente";
			break;
		}
		JOptionPane.showMessageDialog(null, "Su nota es " + mensaje);

	}

}
