package co.edu.unbosque.model;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Exceptions extends Exception {
	
	private Fachada fachada;

	
	public void Excepciones() {
		
		fachada=new Fachada();
		try{
			fachada.MostrarKira();
			fachada.MostrarAstar();
			fachada.MostrarRenk();
			fachada.MostrarSamuel();			
		}catch(NumberFormatException e){
			return;
		}
		catch(InputMismatchException e) {
			return;
		}
		catch(NullPointerException e) {
			JOptionPane.showMessageDialog(null,"Error","ddds",1);
		}
	}
}
