package Programacion.orientacionAObjetos.bloque_1;

public class Utils {
	public float numero;
	public int numeropedido;
	
	
	/**
	 * 
	 * @param valor1
	 * @param valor2
	 * @param valor3
	 * @param valor4
	 */
	public Utils (int valor1, int valor2, int valor3, float valor4) {
		numero = (valor1 + valor2 + valor3 + valor4) / 4;
		
		
	}
	/**
	 * 
	 */
	public void miNumero () {
		System.out.println("La media de los valores es : " +numero);
	}
	/*
	 * 
	 */

}
