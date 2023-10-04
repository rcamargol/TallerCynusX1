package co.edu.unbosque.controller;
import co.edu.unbosque.model.Union;
import co.edu.unbosque.view.Vista;

public class Controller {

	private Union union;
	private Vista vista;

	public Controller() {
		union = new Union();
		vista = new Vista();
		funcionar();
	}

	public void funcionar() {
		vista.mostrarMensaje(union.hacerUnion());
	}
}
