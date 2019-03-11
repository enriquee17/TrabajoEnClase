package Programacion.Cap_6.Bloque_01;

import java.util.HashMap;

import javax.swing.JOptionPane;


public class Ej_1 {
	public static String menu = "Escoja una opcion\n"
			+ "1.Insertar Articulo\n"
			+ "2.Imprimir Articulos\n"
			+ "3. Eliminar Articulo\n"
			+ "4. Actualizar Estante\n"
			+ "0. Salir";
	public static int opcion;
	public static String codBarras;
	public static String estante;
	public static String descripcion;
	public static String Articulos;
	public static HashMap<String, Articulo> hm = new HashMap<String, Articulo>();
	public static void main(String[] args) {
	
		menu();

	}
	
	public static void menu() {
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			Articulos="";
			if (opcion == 1) {
				codBarras = JOptionPane.showInputDialog("Introduce codigo de barras");
				estante = JOptionPane.showInputDialog("Introduce estante");
				descripcion = JOptionPane.showInputDialog("Introduce descripcion");
				 hm.put(codBarras, new Articulo (codBarras, estante, descripcion));
				System.out.println(hm.toString());
				
			}
			
//			if (opcion == 2) {
//				Articulos="";
//				Object claves[] = hm.keySet().toArray();
//				for (int i = 0; i < claves.length; i++) {
//					Articulos+=("Codigo: " + claves[i].toString() + " - Articulo: "  + hm.get(claves[i])+"\n");
//				}
//				JOptionPane.showMessageDialog(null, Articulos);
//			}
		}while (opcion != 0);
		
	}

}
