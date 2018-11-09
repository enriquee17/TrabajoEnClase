package Programacion.orientacionAObjetos.ejemploClase;

public class matriculaBach extends matricula {
	
	private String modalidad;

	public matriculaBach() {
		super();
	}

	public matriculaBach(String fecha, int codigo, String modalidad) {
		super(fecha, codigo);
		this.modalidad = modalidad;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	@Override
	public String toString() {
		return "matriculaBach [getModalidad()=" + getModalidad() + ", getFecha()=" + getFecha() + ", getCodigo()="
				+ getCodigo() + "]";
	}
	
	

}
