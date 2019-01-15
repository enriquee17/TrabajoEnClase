package Programacion.Formula_1;

public class Rampa extends Obstaculo {
	int numAzar;
	
	
	public void inicializa() {
		numAzar = (int)Math.round(Math.random()*(100-50)+50);
		System.out.println(numAzar);
		
	}

}
