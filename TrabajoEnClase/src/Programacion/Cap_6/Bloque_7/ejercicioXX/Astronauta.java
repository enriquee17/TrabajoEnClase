package Programacion.Cap_6.Bloque_7.ejercicioXX;

public class Astronauta implements Ordenador_Listener{
	String nombre;

	public Astronauta(String nombre) {
		super();
		this.nombre = nombre;
		Principal.addOrdenador_listener(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void palabraOrdenadorDetectada(OrdenadorEvent evento) {
		System.out.println("Atronauta "+nombre+ " Recibe el evento");
	}
}
