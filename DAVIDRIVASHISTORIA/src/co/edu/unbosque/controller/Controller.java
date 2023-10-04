package co.edu.unbosque.controller;

import co.edu.unbosque.model.AlmaException;
import co.edu.unbosque.model.AlturaHeroesException;
import co.edu.unbosque.model.ColorOjosException;
import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;

public class Controller {

	private View gui;
	private Fachada f;
	
	public Controller(){
		gui = new View();
		f = new Fachada();
		ejecutar();
	}

	private void ejecutar()  {
		// TODO Auto-generated method stub
		try {
			f.AlturaHeroesException();
		} catch (AlturaHeroesException e) {
			gui.mostrarHeroes(f.generarHeroes());
			gui.mostrarKira(f.generarKira());
			gui.mostrarAstar(f.generarAstar());
		}
		gui.mostrarMortales(f.generarMortales());
		try {
			f.colorOjosException();
		} catch (ColorOjosException e) {
			gui.mostrarDavid(f.generarDavid());
		}
		gui.mostrarDesterrados(f.generarDesterrados());
		try {
			f.almaException();
		} catch (AlmaException e) {
			gui.mostrarRenk(f.generarRenk());
		}
		
			
	}
}
