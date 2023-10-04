package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	
	
	public void escribirDato(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "Titulo del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
}
