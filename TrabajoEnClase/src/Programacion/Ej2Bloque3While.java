package Programacion;

import javax.swing.JOptionPane;

public class Ej2Bloque3While {

	public static void main(String[] args) {
		
		int num=1, suma=0, contador=0;
		
		while (num !=0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));
			suma+=num;
			contador++;
			
		}
			JOptionPane.showMessageDialog(null, "La media es: " +((float)suma/(contador-1)));
	}

}
