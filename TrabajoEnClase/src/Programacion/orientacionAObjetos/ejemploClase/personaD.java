package Programacion.orientacionAObjetos.ejemploClase;

public class personaD extends persona {
	private String dni;
	
		public personaD() {
		super();
		}

		public personaD(String nombre, String apellidos, String fechaNacimiento, String dni) {
		super(nombre, apellidos, fechaNacimiento);
		// TODO Auto-generated constructor stub
		this.dni = dni;
		}

		public String getDni() {
		return dni;
		}

		public void setDni(String dni) {
		this.dni = dni;
		}

		@Override
		public String toString() {
			return "personaD [getDni()=" + getDni() + ", getNombre()=" + getNombre() + ", getApellidos()="
					+ getApellidos() + ", getFechaNacimiento()=" + getFechaNacimiento() + "]";
		}
	
	

}
