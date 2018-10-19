package Programacion.Arrays;

public class Bloque2Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array [] = new int [15];
		
		
		for (int i = 0; i < array.length; i++) {			
			
			array[i]= (int) Math.round(Math.random()* (100- (-100))) + (-100);
				
			}
		
		
		
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
			
			}
		
		
		
		for (int i = 0; i < array.length; i++) {
			if ((array[i] & 1) == 0) {
				array[i] = 0 - array[i];
			}
		}
		
		
		
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
			}
		
		}

	}

