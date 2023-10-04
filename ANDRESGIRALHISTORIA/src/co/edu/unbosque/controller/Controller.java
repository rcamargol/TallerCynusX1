package co.edu.unbosque.controller;

import co.edu.unbosque.view.View;
public class Controller {
	private View gui;
	
	public Controller() {	
		gui = new View();
		gui.mostrarFachadaKira();
		gui.mostrarFachadaAstar();
		gui.mostrarFachadaRenk();
		gui.mostrarFachadaAndres();
	
}
}
