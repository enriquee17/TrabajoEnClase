package Programacion.Arrays;

import javax.swing.JOptionPane;

public class Bloque2Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [] = new int [10];
		int numeropedido;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*100);
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		numeropedido=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i]*numeropedido;
			System.out.print(array[i]+"  ");
		}
	}

}
