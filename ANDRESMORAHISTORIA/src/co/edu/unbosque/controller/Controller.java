package co.edu.unbosque.controller;

import co.edu.unbosque.model.Herencia;
import co.edu.unbosque.view.View;

public class Controller {

	//Atributos que vienen del Modelo (mundo) 
	private Herencia herencia;
	private Herencia hacerOtraHerencia;
	private Herencia herencia3;
	private Herencia herencia4;
	
	//Atributos que vienen de Vista
	private View vista;
	
	public Controller() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		herencia = new Herencia();
		hacerOtraHerencia = new Herencia();
		herencia3 = new Herencia();
		herencia4 = new Herencia();
		vista = new View();
		
		

		//aqui van los metodos que se invocan de Modelo (Mundo) y de Vista y que ejecutar�n el programa.
		funcionar();
	}

	public void funcionar() {
		vista.escribirDato("Mi nombre es "+herencia.hacerHerencia());
		vista.escribirDato("Mi nombre es "+ herencia.hacerOtraHerencia());
		vista.escribirDato("Mi nombre es "+ herencia.herencia3());
		vista.escribirDato("Mi nombre es " + herencia.herencia4());
	}
	
}