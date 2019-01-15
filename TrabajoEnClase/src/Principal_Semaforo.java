
public class Principal_Semaforo {

	public static void main(String[] args) {
		String colores;
		
		
		String color[] = new String [] {"Rojo", "Naranja", "Verde"};
		
		colores = color [(int)Math.round(Math.random()*(color.length-1))];
		
		
			System.out.println(colores);
		
	}
	
	

}
