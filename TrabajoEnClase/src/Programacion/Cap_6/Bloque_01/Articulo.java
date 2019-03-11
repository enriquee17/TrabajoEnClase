package Programacion.Cap_6.Bloque_01;

public class Articulo {

	public static  String Codigo;
	public static String Estante;
	public static String Descripcion;
	
	
	public Articulo(String codigo, String estante, String descripcion) {
		super();
		Codigo = codigo;
		Estante = estante;
		Descripcion = descripcion;
	}


	
	


	public static String getCodigo() {
		return Codigo;
	}


	public static void setCodigo(String codigo) {
		Codigo = codigo;
	}


	public static String getEstante() {
		return Estante;
	}


	public static void setEstante(String estante) {
		Estante = estante;
	}


	public static String getDescripcion() {
		return Descripcion;
	}


	public static void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Articulo [Codigo de Barras =" + Codigo + ", Estante =" + Estante + ", Descripcion =" + Descripcion + "]";
	}
	
}
