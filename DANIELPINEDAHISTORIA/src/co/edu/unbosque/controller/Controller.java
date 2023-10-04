package co.edu.unbosque.controller;
import co.edu.unbosque.model.UnionFachada;
import co.edu.unbosque.view.Vista;

public class Controller {

	private UnionFachada union;
	private Vista vista;

	public Controller() {
		union = new UnionFachada();
		vista = new Vista();
		funcionar();
	}

	public void funcionar() {
		vista.mostrarMensaje(union.hacerUnion());
	}
}
