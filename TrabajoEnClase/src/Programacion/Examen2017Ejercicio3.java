package Programacion;
import java.util.Date;

import javax.swing.JOptionPane;

public class Examen2017Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		do {
			long millisAntes = new Date().getTime();
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			for (int i = 1; i <= num; i++) {
				if (num % i ==0) {
					System.out.print(i);
					System.out.print(" ");
				}
			}
			long millisDespues = new Date().getTime();
			System.out.print("\nTiempo transcurrido (en milisegundos): " + ((float) (millisDespues - millisAntes) / 1000 )/100+"\n");
			
			
		}
		while(num != 0);
		
		
		
	}

}
