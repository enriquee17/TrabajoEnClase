
public class Carniceria extends Articulo {
	
	
	String tipoCarne;
	public Carniceria(String nombre, int id, int cantidad, int precio, String tipoCarne) {
		super(nombre, id, cantidad, precio);
		this.tipoCarne = tipoCarne;
		this.id = id;
		this.cantidad = cantidad;
		this.nombre = nombre;
		this.precio = precio;
		
	}
	@Override
	public String toString() {
		return "Carniceria [tipoCarne=" + tipoCarne + ", nombre=" + nombre + ", id=" + id + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}
	@Override
	public String getDescription() {
		return "Carniceria [tipoCarne=" + tipoCarne + ", nombre=" + nombre + ", id=" + id + ", cantidad=" + cantidad
				+ ", precio=" + precio + "]";
	}


}
