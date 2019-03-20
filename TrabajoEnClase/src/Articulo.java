
public abstract class Articulo {
	String nombre;
	int id;
	int cantidad;
	float precio;
	public Articulo(String nombre, int id, int cantidad, float precio) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	abstract String getDescription();
}
