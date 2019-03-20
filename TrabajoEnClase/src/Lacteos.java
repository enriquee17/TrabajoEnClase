
public class Lacteos extends Articulo {
	
	
	String lactosa;
	
	public Lacteos(String nombre, int id, int cantidad, int precio, String lactosa) {
		super(nombre, id, cantidad, precio);
		this.lactosa = lactosa;
		this.id = id;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Lacteos [lactosa=" + lactosa + ", nombre=" + nombre + ", id=" + id + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}
	
	@Override
	public String getDescription() {
		return "Lacteos [lactosa=" + lactosa + ", nombre=" + nombre + ", id=" + id + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}
	
}
