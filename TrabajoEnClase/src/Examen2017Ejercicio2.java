import javax.swing.JOptionPane;

public class Examen2017Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el n�mero:"));

		int limite = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el l�mite de los m�ltiplos:"));

		for (int i = 0; (num * i) < limite; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

	}

}
