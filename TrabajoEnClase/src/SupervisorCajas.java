
public class SupervisorCajas implements ArticuloDevueltoListener {
	String nombre;
	
	public SupervisorCajas(String nombre) {
		super();
		this.nombre = nombre;
		Principal.addArticuloDevueltoListener(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void articuloDevuelto(ArticuloDevueltoEvent evento) {
		System.out.println("El Supervisor "+nombre+ " ha recibido el evento de que se ha elimidado un articulo \n");
	}

}
