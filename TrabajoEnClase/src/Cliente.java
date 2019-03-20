import java.util.ArrayList;
import java.util.List;







public class Cliente {
	List<Articulo> articulo = new ArrayList<Articulo>();
	private static Cliente instancia = null;

	
	
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public void aniadeArticulo() {
		System.out.println("Lista de Articulos: \n");
		
		articulo.add(new Carniceria("Pollo", 1, 1, 5, "Roja"));
		articulo.add(new Lacteos("Leche", 2, 2, 3, "Desnatada"));
		articulo.add(new Perfumeria("Colonia", 3, 1, 6, "Fuerte"));
		articulo.add(new Limpieza("Escoba", 4, 4, 10, "Limpio"));
		articulo.add(new Fruta("Manzana", 5, 7, 5, "Verde"));
		
		for(int i = 0; i < articulo.size(); i++) {
			System.out.println(articulo.get(i));
		}
		System.out.println();
		
	}
	
	public void articuloHashMap() {
		for(int i = 0; i < articulo.size(); i++) {
			articulo.get(i);
			Caja.getInstancia().articuloPasadoPorCaja();
		}
	}
	
	
	public synchronized static Cliente getInstancia () {
		if (instancia == null) {
			instancia = new Cliente();
		}
		return instancia;
	}
}
