package Programacion.list.Bloque_ejercicios_4;

public class Ejercicio_2 {

	public static void main(String[] args) {
		int array[] = crearArray();
		imprimeArray(array);
		comprobarPorcentaje(array);
	}
	/**
	 * 
	 * @return
	 */
	private static float contAprobados=0;
	private static float contSuspensos=0;
	
	private static int [] crearArray() {
		int array[] = new int[21];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*10);
		}
		
		return array;
	}
	/**
	 * 
	 * @param array
	 */
	private static void comprobarPorcentaje(int array[]) {
		for (int i = 0; i < array.length; i++) {
			if (array[i]>=5) {
				contAprobados++;
			}
			else {
				contSuspensos++;
			}
		}
		System.out.println();
		System.out.println("El porcentaje de aprobados es: " +contAprobados*100/array.length+"%");
		System.out.println("El porcentaje de suspensos es: " +contSuspensos*100/array.length+"%");
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

}
