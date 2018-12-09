 package Programacion.Ahorcadoo.Version_1;

import java.awt.Canvas;  
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;







// La clase extiende de Canvas, se trata de un lienzo sobre el cual podemos pintar
// libremente.
public class Ventana extends Canvas { 

	// Declaraci�n de variables que nos permitir�n introducir el ancho y el alto
	// de la ventana
	public static final int WIDTH = 640;
	public static final int HEIGHT = 460;
	public static Ventana ventana=null;
	

	
	public Ventana () {
		// La clase JFrame nos permite mostrar una ventana en pantalla
		JFrame ventana = new JFrame("El juego de el Ahorcado");
		// Establecemos las dimensiones que queremos que tenga
		ventana.setBounds(0,0,WIDTH,HEIGHT);
		
		// Obtengo una referencia al panel principal de la ventana.
		// Todas las ventanas tienen un panel principal	
		JPanel panel = (JPanel)ventana.getContentPane();

		// Al panel principal de la ventana le a�adimos el objeto this, un Canvas
		panel.add(this);

		// Establezco el tama�o del canvas (this) para que ocupe todo el tama�o de la ventana
		this.setBounds(0,0,WIDTH,HEIGHT);
		
		// Provocamos que el programa se acabe cuando cerramos la ventana 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Hacemos visible la ventana.
		ventana.setVisible(true);
		// Evitamos que la ventana pueda redimensionarse.
		ventana.setResizable(false);
	}
	
	
	
	/**
	 * Sobrescribimos el m�todo "paint" que tienen todos los componentes gr�ficos en AWT-SWING
	 */
	@Override
	public void paint(Graphics g) {
		// Establecimiento del color del pincel
		g.setColor(Color.decode("#74ce25"));
		g.drawImage(Cache_Imagen.getCache().getImagenAhorcado(), 0, 0, this);
		
		// Pintando base
		
		g.setColor(Color.black);
		g.fillRect(50, 380, 171, 40);
		
		//palo base
		g.setColor(Color.black);
		g.fillRect(120, 20, 30, 360);
		
		//palobase2
		g.setColor(Color.black);
		g.fillRect(120, 20, 340, 30);
		
		//palobaseCabeza
		g.setColor(Color.black);
		g.fillRect(450, 20, 10, 80);
		
		// Pintando cuerpo
		g.setColor(Color.blue);
		g.fillRect(420, 150, 70, 100);
		//cuerpoError
		if (Juego.contFallos>3) {
			g.setColor(Color.red);
			g.fillRect(420, 150, 70, 100);
		}
		/**
		 * 
		 */
		// Pintando brazo izquierdo
		g.setColor(Color.green);
		g.fillRect(390, 160, 25, 70);
		//brazoIZError
		if (Juego.contFallos>1) {
			g.setColor(Color.red);
			g.fillRect(390, 160, 25, 70);
		}
		/**
		 * 
		 */
		
		// Pintando brazo derecho
		g.setColor(Color.green);
		g.fillRect(495, 160, 25, 70);
		//brazoderechoerror
		if (Juego.contFallos>2) {
			g.setColor(Color.red);
			g.fillRect(495, 160, 25, 70);
		}
		/**
		 * 
		 */
		// Pintando pierna izquierda
		g.setColor(Color.green);
		g.fillRect(425, 260, 25, 70);
		//pierdaIZQError
		if (Juego.contFallos>4) {
			g.setColor(Color.red);
			g.fillRect(425, 260, 25, 70);
		}
		/**
		 * 
		 */
		// Pintando pierna derecha
		g.setColor(Color.green);
		g.fillRect(465, 260, 25, 70);
		//piernaDerechaError
		if(Juego.contFallos>5) {
			g.setColor(Color.red);
			g.fillRect(465, 260, 25, 70);
		}
		/**
		 * 
		 */
		// Pintando cabeza
		g.setColor(Color.orange);
		g.fillOval(430, 97, 50, 50);
		//cabezaError
		if(Juego.contFallos>0) {
			g.setColor(Color.red);
			g.fillOval(430, 97, 50, 50);
		}
		String pintarArray="";
		//Guiones de palabra en la pantalla
		for (int i=0;i<Juego.getjuego().coincidencia.length;i++) {
			pintarArray+=Juego.getjuego().coincidencia[i]+" ";
		}
		g.setColor(Color.white);
		g.drawString("Palabra: " +pintarArray, 180, 42);
		
		g.setColor(Color.white);
		g.drawString("Fallos: " +Juego.getjuego().contFallos, 380, 42);
		//Mensaje de perdedor
		String msgPerdedor="HAS PERDIDO, la palabra secreta es: " + Juego.getjuego().palabra;
		Font fuente=new Font("Monospaced", Font.BOLD, 20);
		if (Juego.getjuego().contFallos==6) {
			
			g.setColor(Color.white);
			g.setFont(fuente);
			g.drawString(msgPerdedor, 50, 400);
		}
		//Mensaje ganador
		String msgGanador="HAS GANADO, ENHORABUENA";
		if (Juego.getjuego().aciertoPalabra==true || Juego.getjuego().booleanCoincidencia==true) {
			g.setColor(Color.white);
			g.setFont(fuente);
			g.drawString(msgGanador, 50, 400);
		}
		
		
		
		
	}
	public static Ventana getventana(){
		if (ventana==null) {
			ventana=new Ventana();
		}
		return ventana;

	}


}

