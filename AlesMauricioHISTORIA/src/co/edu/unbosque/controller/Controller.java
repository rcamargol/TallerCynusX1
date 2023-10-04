package co.edu.unbosque.controller;

import co.edu.unbosque.model.Herencia;
import co.edu.unbosque.view.View;

public class Controller {

	//Atributos que vienen del Modelo (mundo) 
	private Herencia herencia;
	
	//Atributos que vienen de Vista
	private View vista;
	
	public Controller() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		herencia = new Herencia();
		vista = new View();

		//aqui van los metodos que se invocan de Modelo (Mundo) y de Vista y que ejecutar�n el programa.
		funcionar();
	}

	public void funcionar() {
		vista.escribirDato(herencia.herenciaAles());
		vista.escribirDato(herencia.herenciaKira());
		vista.escribirDato(herencia.herenciaAstar());
		vista.escribirDato(herencia.herenciaRenk());

	}
	
}
