package Programacion.list.Bloque_ejercicios_4;

public class Ejercicio_4 {

	public static void main(String[] args) {
		int matriz[][]= crearMatriz();
		imprimeMatriz(matriz);
		System.out.println("Simétrica: " + matrizSimetrica(matriz));
		System.out.println("Matriz Positiva: " + comprobarMatrizPositiva(matriz));
		System.out.println("Matriz Diagonal: " + comprobarMatrizDiagonal(matriz));
		System.out.println("Matriz Triangular: " + comprobarMatrizTriangular(matriz));
		
		

	}
	/**
	 */
	private static int[][] crearMatriz(){
		/*int matriz[][] = new int[5][5];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int) Math.round(Math.random()*100);
			}
		}*/
	
		// Otra forma
		int matriz[][] = new int[][] {
			{1,	   0, 	 0,    0, 	0},
			{0,    1, 	 0,	   0,	0},
			{0,    0, 	 1,    0, 	0},
			{0,    0, 	 0,    1,   0},
			{0,    0, 	 0,    0, 	1}
		};
		
		return matriz;
		
	}
	/**
	 * 
	 */
	private static boolean comprobarMatrizPositiva(int matriz[][]) {
		boolean matrizPositiva = true;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] < 0) 
					matrizPositiva = false;
				
			}
		}
		return matrizPositiva;
		
	}
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	
	private static boolean comprobarMatrizDiagonal (int matriz[][]) {
		boolean diagonal = true;
		int sumDiag =0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(!(i==j)) {
					sumDiag+=matriz[i][j];
				}
				else if (matriz[i][j]<1) {
					diagonal = false;
				}
			}
		}
		
		if(sumDiag!=0) {
			diagonal = false;
		}
		
		return diagonal;
		
	}
	/**
	 * 
	 */
	private static boolean comprobarMatrizTriangular (int matriz[][]) {
		boolean triangular = true;
		int sumTriang=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i>j) {
					sumTriang+=matriz[i][j];
					
					
				}
				else if(i<j && matriz[i][j]<1){
					triangular=false;
				}
				
			}
		}
		if (sumTriang!=0) {
			triangular=false;
		}
		return triangular;
		
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
