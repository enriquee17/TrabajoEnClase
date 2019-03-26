package Programacion.Ejercicios.Ejercicio01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VentanaPrincipal extends JFrame {
	public static int ANCHO = 800;
	public static int ALTO = 600;
	public static String TITULO_APLICACION = "Titulo de la aplicacion";
	JTextField tfid;
	JTextField tfcif;
	JTextField tfnombre;

	public VentanaPrincipal() {
		super("TITULO_APLICACION");

		// Tama�o por defecto, basado en los valores est�ticos de esta misma clase
		setDimensionesBasicas();

		// Construcci�n elementos b�sicos sobre el ContentPanel
		this.setContentPane(getPanelPrincipal());
	}

	public JPanel getPanelPrincipal() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.lightGray);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel.add(getPanelId());
		panel.add(getPanelNombre());
		panel.add(getPanelCif());
		panel.add(getButton());

		return panel;
	}

	private JPanel getPanelId() {
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel("Id: ");
		panel.add(lbl);
		tfid = new JTextField();
		tfid.setColumns(20);

		panel.add(tfid);

		return panel;

	}

	private JPanel getPanelNombre() {
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel("Nombre: ");
		panel.add(lbl);
		tfnombre = new JTextField();
		tfnombre.setColumns(20);

		panel.add(tfnombre);

		return panel;

	}

	private JPanel getPanelCif() {
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel("Cif: ");
		panel.add(lbl);
		tfcif = new JTextField();
		tfcif.setColumns(20);

		panel.add(tfcif);

		return panel;

	}

	private JPanel getButton() {
		JPanel panel = new JPanel();
		JButton jbtGuardar = new JButton("Guardar ");
		
		jbtGuardar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				guardar();
				

			}

		});
		
		panel.add(jbtGuardar);
		
		JButton jbtEliminar = new JButton("Eliminar");
		jbtEliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				eliminar();
				
			}
		});
		panel.add(jbtEliminar);
		
		return panel;

	}
	
	private void eliminar() {
		Connection conn;
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = conn
					.prepareStatement("SELECT id from tutorialjavacoches.fabricante where " + "id=?");
			ps.setInt(1, Integer.parseInt(tfid.getText()));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				PreparedStatement psEliminar = conn
						.prepareStatement("DELETE id from tutorialjavacoches.fabricante where id = ?");
				psEliminar.setInt(1, Integer.parseInt(tfid.getText()));

				int registrosAfectados = psEliminar.executeUpdate();
				
				if(registrosAfectados == 1) {
					JOptionPane.showMessageDialog(null, "Registro Eliminado");
					tfid.setText("");
					tfcif.setText("");
					tfnombre.setText("");
				}

			} 

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ImposibleConectarException e) {
			e.printStackTrace();
		}

	}

	private void insertar() {
		try {
			Connection conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = conn.prepareStatement(
					"INSERT INTO tutorialjavacoches.fabricante (id, nombre, cif )" + "values (?, ?, ?)");
			ps.setInt(1, Integer.parseInt(tfid.getText()));
			ps.setString(2, tfnombre.getText());
			ps.setString(3, tfcif.getText());

			int filasAfectadas = ps.executeUpdate();

			if (filasAfectadas == 1) {
				System.out.println("Registro Insertado");
			}
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ImposibleConectarException e) {
			e.printStackTrace();

		}
	}

	private void guardar() {
		Connection conn;
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = conn
					.prepareStatement("SELECT id from tutorialjavacoches.fabricante where " + "id=?");
			ps.setInt(1, Integer.parseInt(tfid.getText()));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				actualizar();
			} else {
				insertar();
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} catch (ImposibleConectarException e) {
			e.printStackTrace();
		}

	}
	
	private void actualizar() {
		Connection conn;
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = conn
					.prepareStatement("UPDATE tutorialjavacoches.fabricante set cif = ?, nombre = ? where "+"id = ?" );
			ps.setInt(1, Integer.parseInt(tfid.getText()));
			ps.setString(2, tfnombre.getText());
			ps.setString(3, tfcif.getText());
			int filasAfectadas = ps.executeUpdate();

			if (filasAfectadas == 1) {
				System.out.println("Registro Modificado");
			}
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ImposibleConectarException e) {
			e.printStackTrace();

		}

	}

	private void setDimensionesBasicas() {
		this.setExtendedState(JFrame.NORMAL);
		this.setBounds(0, 0, ANCHO, ALTO);
		// this.setMinimumSize(new Dimension(ANCHO, ALTO));
	}
}
