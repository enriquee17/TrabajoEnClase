package Programacion.list.Bloque_ejercicios_5;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ejercicio_1 {

	public static void main(String[] args) {
		List<String> editor = new ArrayList<String>();
		List<String> portapapeles = new ArrayList<String>();
		
		int opcion;
		int pregunta;
		String aux;
		int pregunta2;
		do {
			String menu= "Menu\n"
					+ "1- Añadir linea de texto\n"
					+ "2- Insertar linea en cualquier posicion\n"
					+ "3- Editar una línea (reescribir su contenido)\n"
					+ "4- Borrar una línea\n"
					+ "5- Cortar un conjunto de líneas, (marcadas por su posición inicial y final)\n"
					+ "6- Pegar un conjunto de líneas cortadas en una determinada posición\n"
					+ "7- Imprimir el texto. Cada línea aparecerá numerada\n"
					+ "8- salir";
			
			
					opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
					
					switch (opcion){
					case 1: //Añadir linea de texto
						editor.add(JOptionPane.showInputDialog("Introduce una linea de texto"));
						System.out.println(editor);
						break;
					case 2: //Insertar linea en cualquier posicion
						pregunta = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion en la que quieres modificar"));
					    editor.add(pregunta, JOptionPane.showInputDialog("Introduce texto"));
					    System.out.println(editor);
						break;
					case 3: //Editar una linea
						pregunta = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion en la que quieres modificar"));
						editor.set(pregunta, JOptionPane.showInputDialog("Introduce texto"));
						System.out.println(editor);
						 break;
					case 4: //Borrar una línea
						pregunta = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion en la que quieres modificar"));
						editor.remove(pregunta);
						System.out.println(editor);
						break;
					case 5: //Cortar un conjunto de líneas, (marcadas por su posición inicial y final)
						pregunta = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer intervalo en el que quieres cortar"));
						pregunta2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo intervalo en el que quieres cortar"));
						portapapeles=editor.subList(pregunta, pregunta2);
						aux=editor.get(pregunta2);
						portapapeles.add(aux);
						editor.removeAll(portapapeles);
						
						System.out.println(editor);
						
						break;
						
					case 6: //Pegar un conjunto de líneas cortadas en una determinada posición
						pregunta = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion en la que quieres pegar"));
						editor.addAll(pregunta, portapapeles);
						System.out.println(editor);
						break;
					}
					
					
					
		}while(opcion!=8);
		

	}
	
	
	
	

}
