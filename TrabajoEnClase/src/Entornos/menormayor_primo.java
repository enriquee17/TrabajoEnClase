package Entornos;

import javax.swing.JOptionPane;

public class menormayor_primo {

	public static void main(String[] args) {

		// Numeros Primos

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
		int array[] = primos(numero);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			System.out.println();
		}

		// Numero mayor y menor de 3 numeros
		int num1 = (int) Math.round(Math.random() * 100);
		int num2 = (int) Math.round(Math.random() * 100);
		int num3 = (int) Math.round(Math.random() * 100);

		int menormayor[] = mayor(num1, num2, num3);

		System.out.print("El número mayor es: " + menormayor[0] + "\n El número menor es: " + menormayor[1]);
		
	}

	// Numeros Primos

	public static int[] primos(int numeroElegido) {
		int numerosPrimos[] = new int[3];
		int cont = 0;
		for (int i = numeroElegido; i > 0; i--) {
			if (i % 2 != 0 && i % 3 != 0 && i % 3 != 0 && i % 5 != 0 && cont <= 2) {
				numerosPrimos[cont] = i;
				cont++;

			}
		}

		return numerosPrimos;
	}

	// Numero mayor y menor de 3 numeros
	
	public static int[] mayor(int num1, int num2, int num3) {
		int array[] = new int[2];

		if (num1 > num2 && num1 > num3) {
			array[0] = num1;
		}
		if (num2 > num3 && num2 > num1) {
			array[0] = num2;
		}
		if (num3 > num2 && num3 > num1) {
			array[0] = num3;
		}
		if (num1 < num2 && num1 < num3) {
			array[1] = num1;
		}
		if (num2 < num1 && num2 < num3) {
			array[1] = num2;
		}
		if (num3 < num2 && num3 < num1) {
			array[1] = num3;
		}
		return array;
	}

}
