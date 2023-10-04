package co.edu.unbosque.view;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.Fachada;

public class View {
	Fachada f=new Fachada();
	public void mostrarFachadaKira() {
		JOptionPane.showMessageDialog(null, f.mostrarKira());
	}
	public void mostrarFachadaAstar(){
		JOptionPane.showMessageDialog(null, f.mostrarAstar());
	}
	public void mostrarFachadaRenk() {
		JOptionPane.showMessageDialog(null, f.mostrarRenk());
	}
	public void mostrarFachadaAndres() {
		JOptionPane.showMessageDialog(null, f.mostrarAndres());
	}
}
