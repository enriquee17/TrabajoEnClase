package Programacion.XXX;

public class Carlos extends NumeroEspecialIntroducidoAdapter {

	
	public Carlos () {
		Principal.addPalabraImparIntroducidaListener(this);
	}
	
	
	@Override
	public void palabraIntroducida(PalabraEspecialIntroducida event) {
		System.out.println("Soy Carlos, han introducido un n�mero impar: " + event.getNumeroIntroducido());
	}


	@Override
	public void palabraIntroducida(PalabraEspecialIntroducida event) {
		super.palabraIntroducida(event);
		System.out.println("Soy Carlos, han introducido un n�mero primo: " + event.getNumeroIntroducido());
	}
	
	
	
}
