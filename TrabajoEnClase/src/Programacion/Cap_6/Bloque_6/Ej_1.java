package Programacion.Cap_6.Bloque_6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Ej_1 {
//	1º.- Crea un programa en Java que utilice un fichero de propiedades para leer un nombre de usuario ficticio 
//	y su correspondiente contraseña.
	
	

		private static Properties propiedades = null;

		
		
		/**
		 * 
		 * @return
		 */
		private static Properties getPropiedades() {
			if (propiedades == null) {
				propiedades = new Properties();
			    
				try {
					propiedades.load(propiedades.getClass().getResourceAsStream("/Programacion/Cap_6/Bloque_6/propiedades.properties"));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
			}
			return propiedades;
		}

		/**
		 * 
		 * @param nombrePropiedad
		 * @return
		 */
		public static String getProperty(String nombrePropiedad) {
			return getPropiedades().getProperty(nombrePropiedad);
		}

		
		/**
		 * 
		 * @param nombrePropiedad
		 * @return
		 */
		public static int getIntProperty (String nombrePropiedad) {
			return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
		}
		
		
		/**
		 * 
		 * @param nombrePropiedad
		 * @return
		 */
		public static Float getFloatProperty (String nombrePropiedad) {
			return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
		}
		
		
		/**
		 * 
		 * @param args
		 */
		public static void main (String args[]) {
			String usuario = Ej_1.getProperty("Usuario");
			String password = Ej_1.getProperty("Contrasenia");
			
			
			System.out.println("Usuario leido del fichero de propiedades: " + usuario);
			System.out.println("Contraseña leida del fichero de propiedades: " + password);
		
		}

}
