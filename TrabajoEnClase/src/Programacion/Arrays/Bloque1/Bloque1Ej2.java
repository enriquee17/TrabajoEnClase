package Programacion.Arrays.Bloque1;

import javax.swing.JOptionPane;

public class Bloque1Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeros [] = new int [150];
		
		int aleatorio = 0;
		int i = 0;
		
		for (i = 149; i > -1; i--) {
			aleatorio=aleatorio*0;
			
			while (aleatorio <= 0) {
				aleatorio= (int) Math.round(Math.random()*100); 
			}
			
			numeros [i] = aleatorio;
			System.out.println("[" +i+ "] : " +aleatorio);
			
		}


	}

}
