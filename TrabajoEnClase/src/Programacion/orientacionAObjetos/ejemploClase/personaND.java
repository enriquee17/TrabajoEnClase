package Programacion.orientacionAObjetos.ejemploClase;

public class personaND extends persona {

	private String descripcion;
	
		public personaND(){
			super();
		}

		public personaND(String nombre, String apellidos, String fechaNacimiento, String descripcion) {
			super(nombre, apellidos, fechaNacimiento);
			// TODO Auto-generated constructor stub
			this.descripcion = descripcion;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		@Override
		public String toString() {
			return "personaND [getDescripcion()=" + getDescripcion() + ", getNombre()=" + getNombre()
					+ ", getApellidos()=" + getApellidos() + ", getFechaNacimiento()=" + getFechaNacimiento() + "]";
		}
		
		

}
