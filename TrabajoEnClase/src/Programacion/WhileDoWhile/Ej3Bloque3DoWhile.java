package Programacion.WhileDoWhile;

import javax.swing.JOptionPane;

public class Ej3Bloque3DoWhile {

	public static void main(String[] args) {
		int num=-1, mayor=0;
		
		do  {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			if (num!=0 && num>mayor) {
				mayor=num;
			}
		}
		
		while (num!=0);
		JOptionPane.showMessageDialog(null, "El mayor es: " +mayor);
	}

}
