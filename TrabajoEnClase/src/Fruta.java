
public class Fruta extends Articulo {


	String color;
	
	public Fruta(String nombre, int id, int cantidad, int precio, String color) {
		super(nombre, id, cantidad, precio);
		this.color = color;
		this.id = id;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Fruta [color=" + color + ", nombre=" + nombre + ", id=" + id + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
	@Override
	public String getDescription() {
		return "Fruta [color=" + color + ", nombre=" + nombre + ", id=" + id + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
}
