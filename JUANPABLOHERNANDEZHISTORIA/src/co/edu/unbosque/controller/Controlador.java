package co.edu.unbosque.controller;

import co.edu.unbosque.model.Herencia;
import co.edu.unbosque.view.View;

public class Controlador {
private Herencia herencia;
private View view;

public Controlador() {
	herencia = new Herencia();
	view = new View();
}

public void ejecutar() {
	view.mostrarInfo(herencia.realizarHerenciaHeroe1());
	view.mostrarInfo(herencia.realizarHerenciaHeroe2());
	view.mostrarInfo(herencia.realizarHerenciaMortal());
	view.mostrarInfo(herencia.realizarHerenciaDesterrado());
}
}
