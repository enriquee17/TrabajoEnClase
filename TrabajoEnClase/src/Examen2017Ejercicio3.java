import javax.swing.JOptionPane;

public class Examen2017Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.println(i);
				}
			}
		} while (num != 0);

	}

}
