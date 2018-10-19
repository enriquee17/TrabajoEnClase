package Programacion.Arrays;

import javax.swing.JOptionPane;

public class Bloque2Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array [] = new int [5];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*100);
			System.out.print(array[i]+ "  ");
		}
		System.out.println();
	
		int cantidaddesplazamientos=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para desplazar: "));
		int numero = array [array.length - 1];
		for (int i = (array.length - 1); i > 0; i--){
			array[i] = array[i-1];
		}
		
		
		array[0]=numero;
		System.out.println();
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ "  ");
		}

	}

}
