package Programacion.Cap_6.Bloque_7.ejercicioXX;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Programacion.Cap_6.Bloque_7.Ej_1.DigitoEvent;
import Programacion.Cap_6.Bloque_7.Ej_1.DigitoListener;

public class Principal {
	static List<Ordenador_Listener> listeners = new ArrayList<Ordenador_Listener>();
	private static void pideFrase() {
		String frase;
		do {
			 frase = JOptionPane.showInputDialog("Dame frase");
			 if (frase.toUpperCase().contains("ORDENADOR")) {
				 OrdenadorEvent evento = new OrdenadorEvent(frase);
				 for(Ordenador_Listener listener : listeners) {
					 listener.palabraOrdenadorDetectada(evento);
				 }
			 }
		}while(!frase.trim().equals("ordenador"));
	}
	
	public static void addOrdenador_listener (Ordenador_Listener listener) {
		listeners.add(listener);
	}
	
	public static void removeOrdenador_listener (Ordenador_Listener listener) {
		listeners.remove(listener);
	}
	
	
	
	public static void main(String[] args) {
		Futbolista futAntonio = new Futbolista("Antonio");
		Futbolista futSandra = new Futbolista("Sandra");
		Astronauta astMaria = new Astronauta("Maria");
		Astronauta astFrancisco = new Astronauta("Francisco");
		pideFrase();
		
	}

}
