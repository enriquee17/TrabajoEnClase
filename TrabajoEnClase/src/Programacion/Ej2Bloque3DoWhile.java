package Programacion;

import javax.swing.JOptionPane;

public class Ej2Bloque3DoWhile {

	public static void main(String[] args) {
		int num=1, suma=0, contador=0;
		do {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			contador++;
			suma+=num;
			  
		}
		while (num!=0);
		JOptionPane.showMessageDialog(null, "La media es: "+((float)suma/(contador-1)));
	}

}
