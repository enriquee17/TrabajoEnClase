package Programacion.list.Bloque_ejercicios_4;

public class Ejercicio_4 {

	public static void main(String[] args) {
		int matriz[][]= crearMatriz();
		imprimeMatriz(matriz);
		System.out.println("Simétrica: " + matrizSimetrica(matriz));
		

	}
	/**
	 */
	private static int[][] crearMatriz(){
		int matriz[][] = new int[5][5];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) Math.round(Math.random()*100);
			}
		}
		
		// Otra forma
	/*	int matriz[][] = new int[][] {
			{1,		6, 		11, 	16, 	21},
			{6, 	7, 		12,		17,		22},
			{11, 	12, 	13, 	18, 	23},
			{16, 	17, 	18, 	19, 	24},
			{21, 	22, 	23, 	24, 	25}
		};
		
		*/return matriz;
		
	}
	/**
	 * 
	 */
	private static void comprobarMatrizPositiva(int matriz[][]) {
		
	}
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	private static boolean matrizSimetrica (int matriz[][]) {
		boolean simetrica = true;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] != matriz[j][i])
					simetrica = false;
			}
		}
		return simetrica;
	}
	/**
	 * 
	 */
	private static void imprimeMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
