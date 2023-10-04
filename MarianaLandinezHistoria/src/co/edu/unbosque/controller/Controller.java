package co.edu.unbosque.controller;

import co.edu.unbosque.model.DesterradoException;
import co.edu.unbosque.model.Herencia;
import co.edu.unbosque.model.HeroeException;
import co.edu.unbosque.model.MortalException;
import co.edu.unbosque.view.View;

public class Controller {
	

	
	private Herencia herencia;
	private View gui;
	
	public Controller() throws HeroeException, MortalException, DesterradoException {
		herencia = new Herencia();
		gui = new View();
		
		ejecutar();
	}
	
	public void ejecutar() throws HeroeException, MortalException, DesterradoException {
		
		gui.mostrarResultados(herencia.hacerHerenciaKira());
		gui.mostrarResultados(herencia.hacerHerenciaAstar());
		gui.mostrarResultados(herencia.hacerHerenciaRenk());
		gui.mostrarResultados(herencia.hacerHerenciaMariana());
	}

}
