package Programacion.list.Bloque_ejercicios_4;

public class Ejercicio_3 {

	public static void main(String[] args) {
		float array[] = crearArray();
		imprimeArray(array);
		comprobarDecimales(array);
		

	}
	/**
	 * 
	 */
	
	private static int numAleatorioEntero=0;
	private static float numAleatorioDecimal=0;
	private static float sumaNumeroEnteroyAleatorio=0;
	private static int contDecimal=0;
	private static float resta=0;
	
	
	private static float [] crearArray() {
		float array[] = new float[20];
		
		for (int i = 0; i < array.length; i++) {
			numAleatorioEntero = (int)Math.round(Math.random()*100);
			numAleatorioDecimal = (float)Math.round(Math.random()*99)/100;
			sumaNumeroEnteroyAleatorio = numAleatorioEntero+numAleatorioDecimal;
			array[i] = sumaNumeroEnteroyAleatorio;
			
	
			
		}
		
		return array;
	}
	/**
	 * 
	 */
	private static void imprimeArray(float array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]+" ");
		}
	}
	/**
	 * º																											
	 */
	private static void comprobarDecimales(float array[]) {
		for (int i = 0; i < array.length; i++) {
			int numero = (int) array[i];
			float numero2 = (float) (array[i] - numero)*100;
			
			if (numero2< 50) {
				contDecimal++;
			}
		
			
			
		}	
		System.out.println("Cantidad de numeros entre 0.00 y 0.49: "+contDecimal);
		
	}
	

}
