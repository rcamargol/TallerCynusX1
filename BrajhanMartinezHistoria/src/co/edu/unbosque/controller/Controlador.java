package co.edu.unbosque.controller;

import co.edu.unbosque.model.CynusX1;
import co.edu.unbosque.view.Vista;

public class Controlador {
	private Vista vista;
	private CynusX1 herencia;
	
	public Controlador() {
		vista = new Vista();
		herencia = new CynusX1();
		
		ejecutar();
	}
	
	public void ejecutar() {
		vista.escribirDato(herencia.hacerHerencia());
		vista.escribirDato(herencia.hacerHerencia1());
		vista.escribirDato(herencia.hacerHerencia2());
		vista.escribirDato(herencia.hacerHerencia3());
	}
}
