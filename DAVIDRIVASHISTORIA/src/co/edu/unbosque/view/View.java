package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	//Heroes
	public void mostrarHeroes(String h) {
		JOptionPane.showMessageDialog(null, h, "Heroes", 1);
	}
	public void mostrarKira(String k) {
		JOptionPane.showMessageDialog(null, k, "Kira", 1);
	}
	public void mostrarAstar(String a) {
		JOptionPane.showMessageDialog(null, a, "Astar", 1);
	}
	
	
	//Mortales
	public void mostrarMortales(String m) {
		JOptionPane.showMessageDialog(null, m, "Mortales", 1);
	}
	public void mostrarDavid(String d) {
		JOptionPane.showMessageDialog(null, d, "David", 1);
	}

	//Desterrados
	public void mostrarDesterrados(String d) {
		JOptionPane.showMessageDialog(null, d, "Desterrados", 1);
	}
	public void mostrarRenk(String r) {
		JOptionPane.showMessageDialog(null, r, "Renk", 1);
	}
	
}
