
public class Limpieza extends Articulo {

	
	String limpio;
	
	public Limpieza(String nombre, int id, int cantidad, int precio, String limpio) {
		super(nombre, id, cantidad, precio);
		this.limpio = limpio;
		this.id = id;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Limpieza [limpio=" + limpio + ", nombre=" + nombre + ", id=" + id + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}
	
	@Override
	public String getDescription() {
		return "Limpieza [limpio=" + limpio + ", nombre=" + nombre + ", id=" + id + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}
	
}
