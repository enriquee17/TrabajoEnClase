package Programacion.WhileDoWhile;

import javax.swing.JOptionPane;

public class Ej3Bloque3While {

	public static void main(String[] args) {
		int num=-1, mayor=0;
		
		while (num != 0) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introdue un numero: "));
		
			if (num>mayor && num!=0) {
				mayor=num;
			}
			
			
		}
		JOptionPane.showMessageDialog(null, "El mayor es: " +mayor);
	}

}
