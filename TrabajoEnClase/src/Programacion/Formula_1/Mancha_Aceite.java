package Programacion.Formula_1;

public class Mancha_Aceite extends Obstaculo {
	int numAzar;
	
	
	
	public void inicializa() {
		numAzar = (int)Math.round(Math.random()*(-10-(-50))-50);
		System.out.println(numAzar);
		
	}

}
