package Programacion.Cap_6.Bloque_7.Ej_1;

public class Usuario implements DigitoListener {
	String nombre;

	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
		Principal.addDigitoListener(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void digitoDetectado(DigitoEvent evento) {
		System.out.println("El usuario "+nombre+ " ha recibido el evento");
	}
	
}
