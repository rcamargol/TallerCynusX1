package co.edu.unbosque.controller;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View gui;
	private CynusX1 planeta;
	
	public Controller() {
		gui = new View();
		planeta = new CynusX1();
		run();
	}
	
	public void run() {
		// Configurando los datos de Kira
		int edadKira = 38;
		String colorDeOjosKira = "Verde";
		String almaKira = "Verdadera";
		planeta.agregarInformacionKira(edadKira, colorDeOjosKira, almaKira);
		
		// Mostrando los datos de Kira
		gui.mostrarDato(planeta.obtenerInformacionKira(), "Kira | Información");
		
		
		// Configurando los datos de Astar
		int edadAstar = 50;
		String colorDeOjosAstar = "Rojos";
		String almaAstar = "Falsa";
		planeta.agregarInformacionAstar(edadAstar, colorDeOjosAstar, almaAstar);
		
		// Mostrando los datos de Astar
		gui.mostrarDato(planeta.obtenerInformacionAstar(), "Astar | Información");
		
		
		// Configurando los datos de Renk
		double estaturaRenk = 2.5;
		String colorDeOjosRenk = "Azules";
		planeta.agregarInformacionRenk(estaturaRenk, colorDeOjosRenk);
		
		// Mostrando los datos de Renk
		gui.mostrarDato(planeta.obtenerInformacionRenk(), "Renk | Información");
		
		
		// Configurando los datos de Nicolás
		planeta.agregarInformacionNicolas();
		
		// Mostrando los datos de Nicolas
		gui.mostrarDato(planeta.obtenerInformacionNicolas(), "Nicolás | Información");
	}
}
