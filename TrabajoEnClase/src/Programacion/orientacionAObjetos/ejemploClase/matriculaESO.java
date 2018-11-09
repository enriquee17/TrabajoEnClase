package Programacion.orientacionAObjetos.ejemploClase;

public class matriculaESO extends matricula {
	
	private boolean pmal;

	public matriculaESO() {
		super();
	}

	public matriculaESO(String fecha, int codigo, boolean pmal) {
		super(fecha, codigo);
		this.pmal = pmal;
	}

	public boolean isPmal() {
		return pmal;
	}

	public void setPmal(boolean pmal) {
		this.pmal = pmal;
	}

	@Override
	public String toString() {
		return "matriculaESO [isPmal()=" + isPmal() + ", getFecha()=" + getFecha() + ", getCodigo()=" + getCodigo()
				+ "]";
	}
	
	
	

}
