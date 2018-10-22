package Programacion.Arrays.Bloque1;

import javax.swing.JOptionPane;

public class Bloque1ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros [] = new int [150];
		int maximo=Integer.parseInt(JOptionPane.showInputDialog("Introduce un maximo"));
		int minimo=Integer.parseInt(JOptionPane.showInputDialog("Introduce un minimo"));
		int aleatorio = 0;
		int i = 0;
		
		for (i = 0; i < 150; i++) {
			aleatorio=aleatorio*0;
			
			while (aleatorio <= minimo) {
				aleatorio= (int) Math.round(Math.random()*maximo); 
			}
			
			numeros [i] = aleatorio;
			System.out.println("[" +i+ "] : " +aleatorio);
			
		}

	}

}
