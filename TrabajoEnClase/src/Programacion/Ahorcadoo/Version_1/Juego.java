package Programacion.Ahorcadoo.Version_1;

import javax.swing.JOptionPane;

public class Juego {
	
	static int contFallos=0;
	static char coincidencia [];
	static Juego juego=null;
	static String palabra;
	static String introduceUsuario;
	static String fallos[]= new String[6];
	static String chetoTematica="navidad";
	static String chetoInmortal="inmortal";
	static boolean inmortal=false;
	static boolean acierto=false;
	static boolean booleanCoincidencia=false;
	static boolean aciertoPalabra=false;
	static boolean isJuegoTerminado=false;
	
	
	
	public static void inicioJuego (){
		
		//generamos el array de palabras
		
		String  palabras [] = new String [] {"aburrido", "ácido", "alegre", "alto", "amargo", "ancho", "atrevido", "azul", "bajo", "blanco", "blando", "bonito", "buen", "caliente", "capaz", "central", "chungo", "común", "conocido", "contento", "corto", "débil", "delgado", "derecho", "diferente", "dif�cil", "dulce", "duro", "enfermo", "estrecho", "exterior", "fácil", "falso", "famoso", "feo", "final", "fresco", "frío", "fuerte", "gordo", "grande", "guay", "guapo", "húmedo", "igual", "imposible", "interesante", "interior", "inútil", "izquierdo", "joven", "largo", "lento", "listo", "malo", "masivo", "mayor", "mejor", "menor", "mucho", "muerto", "musical", "nacional", "natural", "negro", "nuevo", "peor", "pequeño", "perfecto", "pobre", "poco", "popular", "posible", "primero", "principal", "próximo", "rápido", "raro", "real", "recto", "rico", "rojo", "salado", "sano", "seco", "segundo", "simple", "sinverguenza", "social", "solo", "soso", "tímido", "tonto", "triste", "útil", "verdadero", "verde", "viejo", "vivo", "crema", "explosión", "navaja", "universidad", "llaves", "papá", "catre", "escuela", "codo", "mapa", "lima", "edificio", "hojas", "granizo", "mano", "m�sica", "habitaci�n", "abuelo", "templo", "plato", "botella", "casa", "planeta", "metal", "mono", "petr�leo", "debate", "ru�do", "herramienta", "anteojos", "zapato", "ojo", "ciente", "diente", "buzo", "puerta", "ensalada", "candidato", "diario", "hierro", "barco", "tecla", "departamento", "hipop�tamo", "�rbol", "discurso", "r�cula", "lentejas", "reloj", "desodorante", "monta�as", "mo�o", "partido", "fiesta", "caf�", "guitarra", "martillo", "lapicera", "letra", "librer�a", "rueda", "camisa", "sill�n", "teclado", "pantalla", "tenedor", "pantalla", "tenedor", "agua", "cohete", "c�sped", "parlante", "pesta�a", "monitor", "hombre", "velero", "palo", "lentes", "nube", "castillo", "libro", "televisor", "tel�fono", "percha", "anillo", "pared", "cartas", "impresora", "luces", "bomba", "bol�grafo", "gobierno", "enano", "persona", "guantes", "proyector", "muela", "remate", "cuaderno", "taladro", "chocolate", "caramelos", "angustia", "lluvia", "corbata", "peri�dico", "planta", "chupete", "oficina", "persiana", "silla", "pradera", "zool�gico", "deporte", "recipiente", "fotograf�a", "ave", "refugio", "pantal�n", "carne", "nieve", "humedad", "pistola", "tristeza", "sof�", "cama", "campera", "coche", "cintur�n", "famoso", "madera", "piso", "malet�n", "diputado", "cuchillo", "candado", "luz", "ordenador", "radio", "cuadro", "calor", "teatro", "bala", "auriculares", "pl�stico", "libro", "aluminio", "agujeta", "sonido", "perro", "pelo", "felicidad", "servilleta", "sol", "estad�stica", "mensaje", "rey", "presidencia", "colegio", "l�mpara", "flor", "tornillo", "abuela", "sat�lite"}; 
	
		palabra = palabras[(int)Math.round(Math.random()*(palabras.length-1))];
		System.out.println("La palabra es: "+palabra);
		
		
		
		 coincidencia  = new char [palabra.length()];
		
		for (int i = 0; i < coincidencia.length; i++) {
			coincidencia[i] = '*';
			System.out.print(coincidencia[i]+" ");
			
			
		  
		}
		
		do {
			inmortal=false;
			acierto=false;
			introduceUsuario = JOptionPane.showInputDialog("Introduce un caracter o una palabra");
			//modo inmortal
			if(introduceUsuario.equalsIgnoreCase(chetoInmortal)) {
				contFallos=7;
				inmortal=true;
				
			}
			
			if (introduceUsuario.length()==1) {
				 System.out.println();
				//sustituimos la letra introducida en el array de '_' 
				for (int i = 0; i < palabra.length(); i++) {
					 char charUsuario = introduceUsuario.charAt(0);
					 if (charUsuario == palabra.charAt(i)) {
						 coincidencia[i]=charUsuario;
						 acierto=true;	
						 
					 }
				}
				String coincidencias = new String (coincidencia);
				//palabra introducida igual a la palabra al aar
				if (coincidencias.equalsIgnoreCase(palabra)) {
					booleanCoincidencia=true;
				}
				if (acierto==false) {
					JOptionPane.showMessageDialog(null, "Se ha equivocado, intentelo de nuevo");
					contFallos++;
					//repintamos la ventana
					Ventana1.getventana().repaint();
					
				}
				else {
					//imprimo el array de '_' con la letra introducida y acertada
					for (int i = 0; i < coincidencia.length; i++) {
						System.out.print(coincidencia[i]+" ");
						Ventana1.getventana().repaint();
					}
				}
			}
			else {
				if (introduceUsuario.equalsIgnoreCase(palabra)) {
					for (int i = 0; i < palabra.length();i++) {
						coincidencia[i]=palabra.charAt(i);
					}
					Ventana1.getventana().repaint();
					aciertoPalabra=true;
					
				}
				
				else {
					//este if es para que no me salga el mensaje de error cuando introduzca la palabra inmortal
					if(inmortal==false) {
						JOptionPane.showMessageDialog(null, "Se ha equivocado, intentelo de nuevo");
						contFallos++;
						Ventana1.getventana().repaint();
						}
					 }
				}
			
			
		}while(!((introduceUsuario.equalsIgnoreCase(palabra))||(contFallos == 6)||(booleanCoincidencia==true)));
	
		isJuegoTerminado=true;
		System.exit(0);
	}
	public static Juego getjuego(){
		if (juego==null) {
			juego=new Juego();
		}
		return juego;

	}
	
}
