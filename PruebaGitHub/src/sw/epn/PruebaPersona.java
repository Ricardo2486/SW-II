package sw.epn;

import javax.swing.JOptionPane;

public class PruebaPersona {

	public static void main(String[] args) {
		
		Persona p1 = new Persona ();
		p1.setNombre("Cristian");
		p1.setEdad(22);
		p1.setEstatura(1.65);
		
		JOptionPane.showMessageDialog(null, p1.toString());

	}

}
