package Programacion.XXX;

public class Fran  extends NumeroEspecialIntroducidoAdapter  {

	@Override
	public void palabraIntroducida(PalabraEspecialIntroducida event) {
		System.out.println("Soy Fran, han introducido un n�mero impar: " + event.getNumeroIntroducido());
	}

}
