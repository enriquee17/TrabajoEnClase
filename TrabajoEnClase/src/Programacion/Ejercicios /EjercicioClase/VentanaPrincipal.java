package Programacion.Ejercicios.EjercicioClase;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import Programacion.Utils;



public class VentanaPrincipal extends JFrame {
	
	private static char digitosHexadecimales[] = new char[] {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};


	public VentanaPrincipal () {
		this.setBounds(0, 0, 800, 600);
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPanel = new JTabbedPane();		
		tabbedPanel.add("01", getPanelTab01());	
		tabbedPanel.add("02", getPanelTab02());	
		
		this.setContentPane(tabbedPanel);
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	private JPanel getPanelTab01 () {		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(new JLabel("Una etiqueta"));

		JTextField jtf = new JTextField("Texto", 40);
		panel.add(jtf);
		
		JCheckBox check = new JCheckBox("Esto es un check");
		check.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ha cambiado el estado del check a : " + check.isSelected());
			}
		});
		panel.add(check);
		
		JButton jbt = new JButton ("Aceptar");
		jbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = "Contenido del JTextField: " + jtf.getText() +
						" \n- Check: " + check.isSelected();
				JOptionPane.showMessageDialog(null, str);
			}
		});
		
		panel.add(jbt);
		
		return panel;
	}
	
	private void array() {
		String opciones[] = new String[10];
		
		
		
	}
	
	private JPanel getPanelTab02 () {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(new JLabel("Usuario"));

		JTextField jtf = new JTextField("Texto", 40);
		panel.add(jtf);
		
		panel.add(new JLabel("Contraseña"));
		
		JPasswordField jpwd = new JPasswordField(8);
		panel.add(jpwd);
		
		String opciones[] = new String [] {"Cuevas", "Dani"};
		
		JComboBox jcbx = new JComboBox(opciones);
		panel.add(jcbx);
		jcbx.setSelectedIndex(0);
		
		jcbx.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, jcbx.getSelectedItem());
				
			}
		});
		
		
		
		JList jlist = new JList(opciones);
		panel.add(jlist);
		
		JButton jbt = new JButton ("Aceptar");
		jbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.decode(getColorAzar()));
			}
		});
		
		panel.add(jbt);
		
		return panel;
	}
	
	private static String getColorAzar () {
		StringBuffer sb = new StringBuffer ("#");
		for (int i = 0; i < 6; i++) {
			sb.append(digitosHexadecimales[Utils.obtenerNumeroAzar(0, digitosHexadecimales.length-1)]);
		}
		return sb.toString();
	}
	
	
	
	public static void main (String args[]) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
	}
}
