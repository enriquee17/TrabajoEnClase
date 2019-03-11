package Programacion.list.Bloque_ejercicios_5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercicio_2 {
	
	private static List<String> supermercado = new ArrayList<String>();
	public static void main(String[] args) {
		añadir();

	}
	
	
	private static void añadir() {
		supermercado.add(JOptionPane.showInputDialog("Introduce un numero de clientes"));
		System.out.println(supermercado);
		
	}
	
	private static void eliminar() {
		
	}

}
