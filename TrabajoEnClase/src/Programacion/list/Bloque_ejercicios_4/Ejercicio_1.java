package Programacion.list.Bloque_ejercicios_4;

public class Ejercicio_1 {

	public static void main(String[] args) {
		int array[] = crearArray();
		imprimeArray(array);
		comprobarSiLongitudEsImpar(array);

	}
	/**
	 * 
	 * @return
	 */
	
	private static int [] crearArray() {
		int array[] = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*100);
		}
		
		return array;
	}
	/**
	 * 
	 * @param array
	 */
	
	private static void imprimeArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	/**
	 * 
	 */
	private static void comprobarSiLongitudEsImpar(int array[]) {
		
			if (array.length % 2 == 1) {
				int numeroMedio=array.length/2;
				System.out.println();
				System.out.println("El numero que se encuentra en el medio del array es: "+array[numeroMedio]);
			}
			else {
				System.out.println();
				System.out.println("Longitud del array par: -1");
			}
		
		
	}

}
