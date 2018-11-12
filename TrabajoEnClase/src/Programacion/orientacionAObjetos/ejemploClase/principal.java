package Programacion.orientacionAObjetos.ejemploClase;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		String menu1 = "Elige una opcion"
				+ "\n\n1.- Persona"
				+ "\n2.- Matricula";
		
		
		int opcion1=Integer.parseInt(JOptionPane.showInputDialog(menu1));
		
		switch (opcion1) {
		
		case 1: //Persona
		
			String menu2 = "Introduzca el tipo de persona"
					+ "\n\n1.- Personna no Documentada"
					+ "\n2.- Documentada por DNI";
			
			
			int opcion2=Integer.parseInt(JOptionPane.showInputDialog(menu2));
		
			persona persona = null;
			
			switch (opcion2) {
			
			case 1: // No documentada
				persona = new personaND();
				((personaND)persona).setDescripcion(JOptionPane.showInputDialog("Introduzca nombre, apellidos y fecha de nacimiento"));
				break;
						
				
			case 2: //Documentada por DNI
				persona = new personaD();
				((personaD)persona).setDni(JOptionPane.showInputDialog("Introduzca DNI"));
				break;
			}
			
			persona.setNombre(JOptionPane.showInputDialog("Introduzca nombre"));
			persona.setApellidos(JOptionPane.showInputDialog("Introduzca apellidos"));
			persona.setFechaNacimiento(JOptionPane.showInputDialog("Introduzca fecha de nacimiento"));
			
			System.out.println(persona.toString());
			
		case 2: //Matricula
			
			String menu3 = "Tipo de matricula"
					+ "\n\n1.- Matricula ESO"
					+ "\n2.- Matricula Bach"
					+ "\n3.- Formacion Profesional";
			int opcion3=Integer.parseInt(JOptionPane.showInputDialog(menu3));
			
			matricula matricula = null;
			
			switch (opcion3) {
			
			case 1: //Matricula ESO
				matricula = new matriculaESO();
				((matriculaESO)matricula).setPmal(Boolean.parseBoolean(JOptionPane.showInputDialog("Introduzca si es Pmal")));
				break;
				
			case 2: //Matricula Bachillerato
				matricula = new matriculaBach();
				((matriculaBach)matricula).setModalidad(JOptionPane.showInputDialog("Introduzca si es Pmal"));
				break;
				
			case 3: //Formacion profesional	
				matricula = new fp();
				((fp)matricula).setDual(Boolean.parseBoolean(JOptionPane.showInputDialog("Introduzca si es Dual")));
				break;
			}
			
			matricula.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Introduzca un codigo de matricula")));
			matricula.setFecha(JOptionPane.showInputDialog("Introduzca una fecha de matricula"));
				
		}

	}

}
