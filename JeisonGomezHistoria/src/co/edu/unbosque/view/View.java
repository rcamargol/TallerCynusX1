package co.edu.unbosque.view;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Fachada;

public class View {

	String resultadoHeroe1 = Fachada.instanciarHeroe1();
	String resultadoHeroe2 = Fachada.instanciarHeroe2();
	String resultadoMortales = Fachada.instanciarMortales();
	String resultadoDesterrados = Fachada.instanciarDesterrados();

	public void resultadoHeroe1(String Heroe1) {
		JOptionPane.showMessageDialog(null, resultadoHeroe1);

	}

	public void resultadoHeroe2(String Heroe2) {
		JOptionPane.showMessageDialog(null, resultadoHeroe2);

	}

	public void resultadoMortales(String Mortales) {
		JOptionPane.showMessageDialog(null, resultadoMortales);

	}

	public void resultadoDesterrados(String Desterrados) {
		JOptionPane.showMessageDialog(null, resultadoDesterrados);
	}
}