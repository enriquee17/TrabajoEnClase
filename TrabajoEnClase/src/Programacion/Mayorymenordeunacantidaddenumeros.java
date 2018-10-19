package Programacion;

import javax.swing.JOptionPane;

public class Mayorymenordeunacantidaddenumeros {

	public static void main(String[] args) {
		int mayor=0, menor=0, num=1;
		
		
		for (int i=0; num !=0; i++) {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce numero (0 para terminar )"));
			
			if (i == 0) {
				mayor=num; 
				menor=num;
			}
			
			if (num>=mayor && num !=0) {
				mayor=num;
			}
			if (num<=menor && num !=0) {
				menor=num;
			}
			
		}
		JOptionPane.showMessageDialog(null, +mayor+ " Es el mayor y " +menor+  " Es el menor" );	
	}

}
