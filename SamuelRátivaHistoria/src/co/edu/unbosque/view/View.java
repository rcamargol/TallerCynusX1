package co.edu.unbosque.view;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.*;

public class View {
	
	Fachada f=new Fachada();
	
	public void MostrarFraseKira() {
	JOptionPane.showMessageDialog(null,f.MostrarKira(),"Frase Kira",1);
	}
	
	public void MostrarFraseAstar() {
		JOptionPane.showMessageDialog(null,f.MostrarAstar(),"Frase Astar",1);
	}
	public void MostrarFraseRenk() {
		JOptionPane.showMessageDialog(null,f.MostrarRenk(),"Frase Renk",1);
	}
	public void MostrarFraseSamuel() {
		JOptionPane.showMessageDialog(null,f.MostrarSamuel(),"Frase Samuel",1);
	}
}
