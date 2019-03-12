package Programacion.Cap_6.Bloque_7.ejercicioXX;

public class Futbolista implements Ordenador_Listener {
	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Futbolista(String nombre) {
		super();
		this.nombre = nombre;
		Principal.addOrdenador_listener(this);
	}
	@Override
	public  void palabraOrdenadorDetectada(OrdenadorEvent evento) {
		System.out.println("Futbolista "+nombre+ " Recibe el evento");
	}
}
