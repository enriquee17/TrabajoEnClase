package Programacion.Ahorcadoo.Version_1;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class Cache_Imagen {
	// Patr�n Singleton
		private static Cache_Imagen cache= null;
		
		// Variables con im�genes almacenadas
		private BufferedImage imagenTablero = null;
		
		
		
		/**
		 * El constructor busca los archivos en el sistema y los carga en memoria
		 */
		public Cache_Imagen() {
			super();
		}
		
		
		/**
		 * Getter del patr�n Singleton
		 * @return
		 */
		public static Cache_Imagen getCache() {
			if (cache == null) {
				cache = new Cache_Imagen();
			}
			return cache;
		}
		
		
		/**
		 * M�todo que permite obtener una imagen del sistema de ficheros. No es necesario que 
		 * en este momento de tu aprendizaje entiendas el 100% del siguiente m�todo. Es 
		 * demasiado complejo. S�lo tienes que entender que est� m�todo te devuelve un objeto
		 * de tipo BufferedImage, que podr�s utilizar para poder pintar un archivo de imagen
		 * sobre tu ventana.
		 * @param nombre
		 * @return
		 */
		public BufferedImage getImagen(String nombre) {
			URL url=null;
			try {
				url = getClass().getResource("/Programacion/Ahorcadoo/Version_1/" + nombre);
				return ImageIO.read(url);
			} catch (Exception e) {
				System.out.println("No se pudo cargar la imagen " + nombre +" de "+url);
				System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
				System.exit(0);
				return null;
			}
		}


		/**
		 * @return the imagenTablero
		 */
		public BufferedImage getImagenAhorcado() {
			if (imagenTablero == null) {
				imagenTablero = getCache().getImagen("Imagenn.jpg");
			}
			
			return imagenTablero;
		}
}
