package Programacion;

import javax.swing.JOptionPane;

public class JuegoCaraCruz {

	public static void main(String[] args) {
		int cara=0, cruz=1, usuario=0, ordenador=0;
		
		
		
		do {
			int numeropensado=(int) Math.round(Math.random());
			System.out.println(+numeropensado);
			int opcion=Integer.parseInt(JOptionPane.showInputDialog("Elije Cara (0) o Cruz (1)"));
			if (opcion==cara) {
				
				if (numeropensado==0) {
					usuario++;
					JOptionPane.showMessageDialog(null, "Enhorabuena ha ganado esta ronda: Tu " +usuario+ " Maquina " +ordenador );
					
				}
				else {
					ordenador++;
					JOptionPane.showMessageDialog(null, "Has perdido esta ronda: Tu " +usuario+ " Maquina " +ordenador);
					
				}
			}
			
			if (opcion==cruz) {
				if (numeropensado==1) {
					usuario++;
					JOptionPane.showMessageDialog(null, "Enhorabuena has ganado esta ronda: Tu " +usuario+ " Maquina " +ordenador);
					
				}
				else {
					ordenador++;
					JOptionPane.showMessageDialog(null, "Has perdido esta ronda: Tu " +usuario+ " Maquina " +ordenador);
					
				}
			}
		}
		while (usuario<5 && ordenador<5 );
	}

}
