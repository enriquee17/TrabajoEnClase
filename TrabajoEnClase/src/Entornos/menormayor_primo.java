package Entornos;

public class menormayor_primo {

	public static void main(String[] args) {
		int ultimos[] = getTresUltimosPrimos(50);
		for (int num : ultimos) {
			System.out.println(num);
		}
	}

	private static int[] getTresUltimosPrimos(int limiteSuperior) {
		int ultimosPrimos[] = new int[3];
		int contador = 0;
		for (int i = limiteSuperior; i > 0; i--) {
			if (esPrimo(i)) {
				ultimosPrimos[contador] = i;
				contador++;

				if (contador == 3) {
					return ultimosPrimos;
				}
			}

		}
		return ultimosPrimos;
	}

	private static boolean esPrimo(int numero) {

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

}
