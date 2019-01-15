package Programacion.Formula_1;

public class Vehiculo {
	Vehiculo veiculo[] = new Vehiculo[5];
	static int metroAvanzado;
	static int numAzar;
	
	
	public  void avanza() {
		numAzar = (int)Math.round(Math.random()*(50-3)+3);
		System.out.println(numAzar);
		
		
	}

}
