package Programacion.Ahorcadoo.Version_1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
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
	public static final int HEIGHT = 480;

	
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

		// Pintando base
		
		g.setColor(Color.gray);
		g.fillRect(50, 380, 171, 40);
		//palo base
		g.setColor(Color.gray);
		g.fillRect(120, 20, 30, 360);
		//palobase2
		g.setColor(Color.gray);
		g.fillRect(120, 20, 340, 30);
		//palobaseCabeza
		g.setColor(Color.gray);
		g.fillRect(450, 20, 20, 80);
		// Pintando cuerpo
		g.setColor(Color.green);
		g.fillRect(420, 175, 80, 150);
		
		// Pintando brazo izquierdo
		g.setColor(Color.green);
		g.fillRect(382, 175, 30, 80);
		
		// Pintando brazo derecho
		g.setColor(Color.green);
		g.fillRect(508, 175, 30, 80);
		
		// Pintando pierna izquierda
		g.setColor(Color.green);
		g.fillRect(425, 330, 30, 80);
		// Pintando pierna derecha
		g.setColor(Color.green);
		g.fillRect(465, 330, 30, 80);
		// Pintando cabeza
		g.setColor(Color.green);
		g.fillOval(420, 99, 77, 77);
		g.drawImage(Cache_Imagen.getCache().getImagenTablero(), 0, 0, this);
	
	}

}

