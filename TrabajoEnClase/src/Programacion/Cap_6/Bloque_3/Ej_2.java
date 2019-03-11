package Programacion.Cap_6.Bloque_3;

import javax.swing.JOptionPane;

public class Ej_2 {
//	2º.- Crear un programa que pida al usuario una contraseña con los siguientes requisitos:
//        - Al menos una mayúscula.
//        - Al menos una minúscula.
//        - Al menos un dígito
//        - Al menos un carácter no alfanumérico.
//      El programa no terminará hasta que el usuario no introduzca la contraseña con estos requisitos.
	
	
	static String introduceUsuario;
	static boolean falloMayus;
	static boolean falloMinus;
	static boolean falloDigito;
	static boolean falloAlfanumerico;
	
	
	public static void main(String[] args) {
		do {
			introduceUsuario = JOptionPane.showInputDialog("Introduce una contraseña");
			falloDigito = false;
			falloMayus = false;
			falloMinus = false;
			falloAlfanumerico = false;
			mayuscula();
			minuscula();
			digito();
			caracterAlfanumerico();
		}while(!falloMayus==true || !falloMinus==true || !falloDigito==true || !falloAlfanumerico==true);
		JOptionPane.showMessageDialog(null, " Contraseña correcta.");

			

	}
	
	public static void mayuscula() {
		int tamaño = introduceUsuario.length();
		char cadenaTexto[] = new char[tamaño] ;
		
		for (int i = 0; i < cadenaTexto.length; i++) {
			cadenaTexto[i] = introduceUsuario.charAt(i);
		}
		for (int i = 0; i < cadenaTexto.length; i++) {
			if(Character.isUpperCase(cadenaTexto[i])) {
				falloMayus=true;
				
			}
			
		}
		if (falloMayus == false) {
			JOptionPane.showMessageDialog(null, "Error, La contraseña debe tener al menos una letra Mayuscula.");
		}
		
	}
	
	public static void minuscula() {
		int tamaño = introduceUsuario.length();
		char cadenaTexto[] = new char[tamaño] ;
		
		for (int i = 0; i < cadenaTexto.length; i++) {
			cadenaTexto[i] = introduceUsuario.charAt(i);
		}
		for (int i = 0; i < cadenaTexto.length; i++) {
			if(Character.isLowerCase(cadenaTexto[i])) {
				falloMinus=true;
			}
		}
		if (falloMinus == false) {
			JOptionPane.showMessageDialog(null, "Error, La contraseña debe tener al menos una letra Minuscula.");
		}
	}
	
	public static void digito() {
		int tamaño = introduceUsuario.length();
		char cadenaTexto[] = new char[tamaño] ;
		
		for (int i = 0; i < cadenaTexto.length; i++) {
			cadenaTexto[i] = introduceUsuario.charAt(i);
		}
		for (int i = 0; i < cadenaTexto.length; i++) {
			if(Character.isDigit(cadenaTexto[i])) {
				falloDigito=true;
			}
		}
		if (falloDigito == false) {
			JOptionPane.showMessageDialog(null, "Error, La contraseña debe tener al menos un Numero.");
		}
	}
	
	public static void caracterAlfanumerico() {
		int tamaño = introduceUsuario.length();
		char cadenaTexto[] = new char[tamaño] ;
		
		for (int i = 0; i < cadenaTexto.length; i++) {
			cadenaTexto[i] = introduceUsuario.charAt(i);
		}
		for (int i = 0; i < cadenaTexto.length; i++) {
			if(!Character.isLetterOrDigit(cadenaTexto[i])) {
				falloAlfanumerico=true;
			}
		}
		if (falloAlfanumerico == false) {
			JOptionPane.showMessageDialog(null, "Error, La contraseña debe tener al menos un caracter Alfanumerico.");
		}
	}

}
