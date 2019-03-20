
public class Perfumeria extends Articulo {

	
	String olor;
	public Perfumeria(String nombre, int id, int cantidad, int precio, String olor) {
		super(nombre, id, cantidad, precio);
		this.olor = olor;
		this.id = id;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Perfumeria [olor=" + olor + ", nombre=" + nombre + ", id=" + id + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
	@Override
	public String getDescription() {
		return "Perfumeria [olor=" + olor + ", nombre=" + nombre + ", id=" + id + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
}
