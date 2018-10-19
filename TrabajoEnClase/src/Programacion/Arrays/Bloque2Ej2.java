package Programacion.Arrays;

public class Bloque2Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longitudarray=15;
		int array [] = new int [longitudarray];
		int array2 [] = new int [longitudarray];
		int array3 [] = new int [longitudarray];
		
		for (int i = 0; i < array.length; i++) {
			
			array [i] = (int)Math.round(Math.random()*100);
			System.out.print(+array[i]);
			System.out.print("  ");
			
		}
		System.out.println();

		for (int i = 0; i < array2.length; i++) {
			
			array2 [i] = (int)Math.round(Math.random()*100);
			System.out.print(+array2[i]);
			System.out.print("  ");
			
		}
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				array3[i] = array2[i];
				
			}
			else {
				array3[i] = array[i];
			}
		}
		System.out.println();
		for (int i = 0; i < array3.length; i++) {
			
			System.out.print(+array3[i]);
			System.out.print("  ");
			
		}
		
		
	}

}
