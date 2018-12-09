package Programacion.Ahorcadoo.Version_1;

import javax.swing.JOptionPane;

public class Juego {
	
	static int contFallos=0;
	static char coincidencia [];
	static boolean acierto=false;
	static boolean booleanCoincidencia=false;
	public static Juego juego=null;
	public static String palabra;
	static String introduceUsuario;
	static boolean aciertoPalabra=false;
	static boolean isJuegoTerminado=false;
	static String fallos[]= new String[6];
	public static void generacionPalabra (){

		
		String  palabras [] = new String [] {"aburrido", "�cido", "alegre", "alto", "amargo", "ancho", "atrevido", "azul", "bajo", "blanco", "blando", "bonito", "buen", "caliente", "capaz", "central", "chungo", "com�n", "conocido", "contento", "corto", "d�bil", "delgado", "derecho", "diferente", "dif�cil", "dulce", "duro", "enfermo", "estrecho", "exterior", "f�cil", "falso", "famoso", "feo", "final", "fresco", "fr�o", "fuerte", "gordo", "grande", "guay", "guapo", "h�medo", "igual", "imposible", "interesante", "interior", "in�til", "izquierdo", "joven", "largo", "lento", "listo", "malo", "masivo", "mayor", "mejor", "menor", "mucho", "muerto", "musical", "nacional", "natural", "negro", "nuevo", "peor", "peque�o", "perfecto", "pobre", "poco", "popular", "posible", "primero", "principal", "pr�ximo", "r�pido", "raro", "real", "recto", "rico", "rojo", "salado", "sano", "seco", "segundo", "simple", "sinverg�enza", "social", "solo", "soso", "t�mido", "tonto", "triste", "�til", "verdadero", "verde", "viejo", "vivo", "crema", "explosi�n", "navaja", "universidad", "llaves", "pap�", "catre", "escuela", "codo", "mapa", "lima", "edificio", "hojas", "granizo", "mano", "m�sica", "habitaci�n", "abuelo", "templo", "plato", "botella", "casa", "planeta", "metal", "mono", "petr�leo", "debate", "ru�do", "herramienta", "anteojos", "zapato", "ojo", "ciente", "diente", "buzo", "puerta", "ensalada", "candidato", "diario", "hierro", "barco", "tecla", "departamento", "hipop�tamo", "�rbol", "discurso", "r�cula", "lentejas", "reloj", "desodorante", "monta�as", "mo�o", "partido", "fiesta", "caf�", "guitarra", "martillo", "lapicera", "letra", "librer�a", "rueda", "camisa", "sill�n", "teclado", "pantalla", "tenedor", "pantalla", "tenedor", "agua", "cohete", "c�sped", "parlante", "pesta�a", "monitor", "hombre", "velero", "palo", "lentes", "nube", "castillo", "libro", "televisor", "tel�fono", "percha", "anillo", "pared", "cartas", "impresora", "luces", "bomba", "bol�grafo", "gobierno", "enano", "persona", "guantes", "proyector", "muela", "remate", "cuaderno", "taladro", "chocolate", "caramelos", "angustia", "lluvia", "corbata", "peri�dico", "planta", "chupete", "oficina", "persiana", "silla", "pradera", "zool�gico", "deporte", "recipiente", "fotograf�a", "ave", "refugio", "pantal�n", "carne", "nieve", "humedad", "pistola", "tristeza", "sof�", "cama", "campera", "coche", "cintur�n", "famoso", "madera", "piso", "malet�n", "diputado", "cuchillo", "candado", "luz", "ordenador", "radio", "cuadro", "calor", "teatro", "bala", "auriculares", "pl�stico", "libro", "aluminio", "agujeta", "sonido", "perro", "pelo", "felicidad", "servilleta", "sol", "estad�stica", "mensaje", "rey", "presidencia", "colegio", "l�mpara", "flor", "tornillo", "abuela", "sat�lite"}; 
	
		palabra = palabras[(int)Math.round(Math.random()*(palabras.length-1))];
		System.out.println("La palabra es: "+palabra);
		
		
		//String palabraOculta = palabra;
		 coincidencia  = new char [palabra.length()];
		
		for (int i = 0; i < coincidencia.length; i++) {
			coincidencia[i] = '_';
			System.out.print(coincidencia[i]+" ");
			
			
		  
		}
		
			do {
				acierto=false;
				 introduceUsuario = JOptionPane.showInputDialog("Introduce un caracter o una palabra");
				
					
						
					if (introduceUsuario.length()==1) {
						 System.out.println();
						 
						for (int i = 0; i < palabra.length(); i++) {
							 char charUsuario = introduceUsuario.charAt(0);
							 if (charUsuario == palabra.charAt(i)) {
								 coincidencia[i]=charUsuario;
								 acierto=true;	
								
								 
							 }
							 
		
						}
						
						
						String coincidencias = new String (coincidencia);
						if (coincidencias.equals(palabra)) {
							booleanCoincidencia=true;
						}
						
						
						
						if (acierto==false) {
							JOptionPane.showMessageDialog(null, "Se ha equivocado, intentelo de nuevo");
							contFallos++;
						
							Ventana.getventana().repaint();
							
						}
						else {
							for (int i = 0; i < coincidencia.length; i++) {
								System.out.print(coincidencia[i]+" ");
								Ventana.getventana().repaint();
							}
						}
					}
					else {
						if (introduceUsuario.equals(palabra)) {
							for (int i = 0; i < palabra.length();i++) {
								coincidencia[i]=palabra.charAt(i);
							}
							Ventana.getventana().repaint();
							aciertoPalabra=true;
							
						}
						
						else {
							JOptionPane.showMessageDialog(null, "Se ha equivocado, intentelo de nuevo");
							contFallos++;
							Ventana.getventana().repaint();
							 }
						}
					
			      
			}while(!((introduceUsuario.equals(palabra))||(contFallos == 6)||(booleanCoincidencia==true)));
		
			isJuegoTerminado=true;
	
	}
	public static Juego getjuego(){
		if (juego==null) {
			juego=new Juego();
		}
		return juego;

	}
	
}
