package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	public void mostrarDato(String dato, String titulo) {
		JOptionPane.showMessageDialog(null, dato, titulo, JOptionPane.INFORMATION_MESSAGE);
	}
}
