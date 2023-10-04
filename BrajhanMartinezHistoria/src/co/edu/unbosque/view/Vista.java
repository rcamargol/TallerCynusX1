package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class Vista {
	public Vista() {
		// TODO Auto-generated constructor stub
		
	}

	public String pedirDato() {
		return (JOptionPane.showInputDialog(null,"Ingrese un dato","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}

	public int pedirNumero() {
		return Integer.parseInt(pedirDato());
	}

	public void escribirDato(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "Titulo del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
}

