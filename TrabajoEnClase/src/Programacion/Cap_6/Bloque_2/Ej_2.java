package Programacion.Cap_6.Bloque_2;

public class Ej_2 {

	public static void main(String[] args) {

		for (float x = 0.0001f; x < 1; x += 0.0001f) {
			float y1 = (float) Math.sqrt(x);
			System.out.println("x1: " + x + " y1 = sqrt(x): " + y1);

			float y2 = (float) (0 - Math.log(x));
			System.out.println("x1: " + x + " y2 = -ln(x): " + y2);

			if (Math.abs(y2 - y1) < 0.0001) {
				System.out.println("Solucion encontrada en x = " + x);
				break;
			}
		}
	}

}
