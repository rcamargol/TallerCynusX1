package co.edu.unbosque.controller;

import co.edu.unbosque.model.Cynus;
import co.edu.unbosque.view.View;

public class Controller {

	
	private Cynus Cynus;
	
	//Atributos que vienen de Vista
	private View vista;
	
	public Controller() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		Cynus = new Cynus();
		vista = new View();

		//aqui van los metodos que se invocan de Modelo (Mundo) y de Vista y que ejecutar�n el programa.
		funcionar();
	}

	public void funcionar() {
		vista.escribirDato(Cynus.Gabriel());
		vista.escribirDato(Cynus.Kira());
		vista.escribirDato(Cynus.Renk());
		vista.escribirDato(Cynus.Aztar());

	}
	
}
