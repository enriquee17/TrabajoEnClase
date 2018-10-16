package Programacion;

import javax.swing.JOptionPane;

public class Ejercicio4bloque4 {
	public static void main(String[] args) {
		// Declaraci�n de todas la variables necesarias
		int precioArticulo, unidadesEntregadas, cambioAEntregar;
		
		// Petici�n de valores al usuario
		precioArticulo = Integer.parseInt(JOptionPane.showInputDialog(
				"Introduzca precio del art�culo"));
		unidadesEntregadas = Integer.parseInt(JOptionPane.showInputDialog(
				"Introduzca unidades entregadas"));
		
		// C�lculo del cambio a entregar
		cambioAEntregar = unidadesEntregadas - precioArticulo;
		
		// Algoritmo de devoluci�n de monedas
		
		// Monedas de 100 unidades
		JOptionPane.showMessageDialog(null, 
				(cambioAEntregar / 100) + " monedas de 100");
		// cambioAEntregar = cambioAEntregar % 100;
		cambioAEntregar %= 100;
		
		// Monedas de 50 unidades
		JOptionPane.showMessageDialog(null, 
				(cambioAEntregar / 50) + " monedas de 50");
		cambioAEntregar %= 50;
		
		// Monedas de 25 unidades
		JOptionPane.showMessageDialog(null, 
				(cambioAEntregar / 25) + " monedas de 25");
		cambioAEntregar %= 25;
		
		// Monedas de 5 unidades
		JOptionPane.showMessageDialog(null, 
				(cambioAEntregar / 5) + " monedas de 5");
		cambioAEntregar %= 5;
		
		// Monedas de 1 unidad
		JOptionPane.showMessageDialog(null, 
				cambioAEntregar + " monedas de 1");
		
		
		// Saca la informaci�n al usuario
	}

}
