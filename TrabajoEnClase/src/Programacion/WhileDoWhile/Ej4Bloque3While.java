package Programacion.WhileDoWhile;

import javax.swing.JOptionPane;

public class Ej4Bloque3While {

	public static void main(String[] args) {
		int num=-1, menor=0;
		
		while (num != 0) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introdue un numero: "));
		
			if (num < menor && num!=0) {
				menor=num;
			}
			
			
		}
		JOptionPane.showMessageDialog(null, "El menor es: " +menor);

	}

}
