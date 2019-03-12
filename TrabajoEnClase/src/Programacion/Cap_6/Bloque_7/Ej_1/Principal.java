package Programacion.Cap_6.Bloque_7.Ej_1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Programacion.Cap_6.Bloque_7.ejercicioXX.Ordenador_Listener;
import sun.text.normalizer.CharTrie.FriendAgent;





public class Principal {

	
	static List<DigitoListener> listeners = new ArrayList<DigitoListener>();
	
	private static void pideFrase() {
		String frase;
		int contDigitos=0;
		do {
			 frase = JOptionPane.showInputDialog("Dame frase");
			 int tamaño = frase.length();
				char cadenaTexto[] = new char[tamaño] ;
				
				for (int i = 0; i < cadenaTexto.length; i++) {
					cadenaTexto[i] = frase.charAt(i);
				}
				for (int i = 0; i < cadenaTexto.length; i++) {
					if(Character.isDigit(cadenaTexto[i])) {
						contDigitos++;
						
					}
					if(contDigitos==3) {
						DigitoEvent evento = new DigitoEvent(frase);
						fireDigitoEvent(evento);
					}
					
				}
				
				
		}while(!(contDigitos==3));
		
	}
	
	public static void addDigitoListener (DigitoListener listener) {
		listeners.add(listener);
	}
	
	public static void removeDigitoListener (DigitoListener listener) {
		listeners.remove(listener);
	}
	
	public static void fireDigitoEvent(DigitoEvent evento) {
		for(DigitoListener listener : listeners) {
			 listener.digitoDetectado(evento);
		 }
	}
	public static void main(String[] args) {
//		1º.- Crea un programa en Java que pida palabras, continuamente, al usuario. Para cada palabra debes examinar sus 
//		caracteres buscando la cantidad de digitos numéricos que existen. Crea una clase llamada "BuscaDigitos". Debes crear 
//		la estructura de listeners y eventos necesarios para que, cuando la palabra introducida por el usuario contenga 3 dígitos, 
//		la clase BuscaDigitos sea notificada de ese evento producido.
		Usuario usEnrique = new Usuario ("Enrique");
		Usuario usCuevas = new Usuario ("Cuevas");
		
		pideFrase();

	}

}
