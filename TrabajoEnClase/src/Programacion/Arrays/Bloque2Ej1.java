package Programacion.Arrays;

public class Bloque2Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array [] = new int [150];
		int aleatorio=0;
		int i=0;
		
		for (i = 0; i < array.length; i++) {
			aleatorio=aleatorio*0;
			
			
			aleatorio = (int) Math.round(Math.random()*(100-(-100)))-100;
				
			array [i] = aleatorio;
			System.out.println("[" +i+ "] : " +aleatorio);
		}

	}

}
