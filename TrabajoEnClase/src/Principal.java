import java.util.ArrayList;

import java.util.List;

public class Principal {

	public static void main(String[] args) {

		SupervisorCajas usEnrique = new SupervisorCajas("Enrique");
		System.out.println("Fichero de Propiedades: \n");
		System.out.println("Nombre leido correctamente: " + FicheroPropiedades.getProperty("Nombre") + "\n");
		Cliente.getInstancia().aniadeArticulo();
		System.out.println("Lista de HashMap");
		Caja.articuloPasadoPorCaja();
		System.out.println();
		System.out.println();
		Caja.eliminarArticulo();
		System.out.println("Lista de Articulos una vez se han devuelto: \n");
		Caja.imprimirConBorrado();

		try {
			Caja.pagar();
		} catch (CashInsuficienteException e) {
			System.out.println("Dinero insuficiente");
			e.printStackTrace();
		}

	}

}
