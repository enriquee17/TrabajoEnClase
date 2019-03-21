import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class Caja {

	private static Caja instancia = null;

	static String respuesta;
	static HashMap hm = new HashMap();

	public static void articuloPasadoPorCaja() {

		hm.put("1", new Carniceria("Pollo", 1, 1, 5, "Roja"));
		hm.put("2", new Lacteos("Leche", 2, 2, 3, "Desnatada"));
		hm.put("3", new Perfumeria("Colonia", 3, 1, 6, "Fuerte"));
		hm.put("4", new Limpieza("Escoba", 4, 4, 10, "Limpio"));
		hm.put("5", new Fruta("Manzana", 5, 7, 5, "Verde"));

		Iterator<Articulo> articulos = hm.values().iterator();
		while (articulos.hasNext()) {
			System.out.println("Objeto obtenido: " + articulos.next());
		}

	}

	public static void imprimirConBorrado() {
		Iterator<Articulo> articulos = hm.values().iterator();
		while (articulos.hasNext()) {
			System.out.println("Objeto obtenido: " + articulos.next());
		}
	}

	public static void eliminarArticulo() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		ArticuloDevueltoEvent evento = new ArticuloDevueltoEvent(respuesta);
		do {
			respuesta = JOptionPane.showInputDialog("Que articulo desea eliminar?\n" + " Carniceria,\n" + " Lacteos,\n"
					+ " Perfumeria,\n" + " Limpieza,\n" + " Fruta\n" + " salir");
			if (respuesta.equals("Carniceria")) {
				hm.remove("1");
				System.out.println("Carniceria ha sido devuelto en la siguiente fecha: " + sdf.format(new Date()));
				fireArticuloDevueltoListener(evento);
				respuesta = JOptionPane.showInputDialog("Que articulo desea eliminar?\n" + " Lacteos,\n"
						+ " Perfumeria,\n" + " Limpieza,\n" + " Fruta\n" + " salir");
			}
			if (respuesta.equals("Lacteos")) {
				hm.remove("2");
				System.out.println("Lacteos ha sido devuelto en la siguiente fecha: " + sdf.format(new Date()));
				fireArticuloDevueltoListener(evento);
				respuesta = JOptionPane.showInputDialog("Que articulo desea eliminar?\n" + " Carniceria,\n"
						+ " Perfumeria,\n" + " Limpieza,\n" + " Fruta\n" + " salir");

			}
			if (respuesta.equals("Perfumeria")) {
				hm.remove("3");
				System.out.println("Perfumeria ha sido devuelto en la siguiente fecha: " + sdf.format(new Date()));
				fireArticuloDevueltoListener(evento);
				respuesta = JOptionPane.showInputDialog("Que articulo desea eliminar?\n" + " Carniceria,\n"
						+ " Lacteos,\n" + " Limpieza,\n" + " Fruta\n" + " salir");
			}
			if (respuesta.equals("Limpieza")) {
				hm.remove("4");
				System.out.println("Limpieza ha sido devuelto en la siguiente fecha: " + sdf.format(new Date()));
				fireArticuloDevueltoListener(evento);
				respuesta = JOptionPane.showInputDialog("Que articulo desea eliminar?\n" + " Carniceria,\n"
						+ " Lacteos,\n" + " Perfumeria,\n" + " Fruta\n" + " salir");
			}
			if (respuesta.equals("Fruta")) {
				hm.remove("5");
				System.out.println("Fruta ha sido devuelto en la siguiente fecha: " + sdf.format(new Date()));
				fireArticuloDevueltoListener(evento);
				respuesta = JOptionPane.showInputDialog("Que articulo desea eliminar?\n" + " Carniceria,\n"
						+ " Lacteos,\n" + " Perfumeria,\n" + " Limpieza,\n" + " salir");
			}
		} while (!respuesta.equals("salir"));

	}

	static List<ArticuloDevueltoListener> listeners = new ArrayList<ArticuloDevueltoListener>();

	public static void addArticuloDevueltoListener(ArticuloDevueltoListener listener) {
		listeners.add(listener);
	}

	public static void removeArticuloDevueltoListener(ArticuloDevueltoListener listener) {
		listeners.remove(listener);
	}

	public static void fireArticuloDevueltoListener(ArticuloDevueltoEvent evento) {
		for (ArticuloDevueltoListener listener : listeners) {
			listener.articuloDevuelto(evento);
		}
	}

	public static float calcularImporteTotal() {
		float importe = 0f;

		Iterator<Articulo> articulos = hm.values().iterator();
		while (articulos.hasNext()) {
			Articulo art = articulos.next();
			importe += art.getPrecio() * art.getCantidad();
		}

		return importe;
	}

	public static void pagar() throws CashInsuficienteException {
		float importe = calcularImporteTotal();

		float pago = Float
				.parseFloat(JOptionPane.showInputDialog("Debe pagar " + importe + "\nCuanto dinero desea darme?"));

		if (pago < importe) {
			throw new CashInsuficienteException("Debes pagar " + importe + " euros. Tu pago es insuficiente");
		}
	}

	public static void main(String args[]) {
		articuloPasadoPorCaja();
		eliminarArticulo();

	}

	public synchronized static Caja getInstancia() {
		if (instancia == null) {
			instancia = new Caja();
		}
		return instancia;
	}
}
