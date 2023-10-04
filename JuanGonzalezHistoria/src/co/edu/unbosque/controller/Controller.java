package co.edu.unbosque.controller;

import co.edu.unbosque.model.DesterradoException;
import co.edu.unbosque.model.Herencia;
import co.edu.unbosque.model.HeroeException;
import co.edu.unbosque.model.MortalException;
import co.edu.unbosque.view.View;

public class Controller {

	private View gui;
	private Herencia herencia;

	public Controller() throws HeroeException, DesterradoException, MortalException {

		gui = new View();
		herencia = new Herencia();

		ejecutar();
	}

	public void ejecutar() throws HeroeException, DesterradoException, MortalException {

		// Heroes /////////////////////

		gui.mostrarResultados(herencia.hacerHeroe1() + "\n" + herencia.getHeroes().crearFuego() + "\n"
				+ herencia.getHeroes().detenerElTiempo() + "\n" + herencia.getHeroes().volar() + "\n"
				+ herencia.getHeroes().sentir() + "por cierto " + "\n" + herencia.getHeroes().habitarPlaneta());

		gui.mostrarResultados(herencia.hacerHeroe21() + "\n" + herencia.getHeroes().crearFuego() + "\n"
				+ herencia.getHeroes().detenerElTiempo() + "\n" + herencia.getHeroes().volar() + "\n"
				+ herencia.getHeroes().sentir() + "por cierto " + "\n" + herencia.getHeroes().habitarPlaneta()
				+ "tambien");

		/////////////////////////

		gui.mostrarResultados(herencia.hacerDesterrado() + "\n" + herencia.getDesterrados().habitarPlaneta() + "\n"
				+ herencia.getDesterrados().sentir() + "\n" + herencia.getDesterrados().arrastrar());

		gui.mostrarResultados(herencia.hacerHumano() + "\n" + herencia.getMortales().adquirirConocimiento() + "\n"
				+ herencia.getMortales().ejercerProfesion() + "\n" + herencia.getMortales().tenerFamilia() + "\n"
				+ herencia.getMortales().habitarPlaneta() + "\n" + herencia.getMortales().sentir());

		//// Desterrado ///////

	}

}
