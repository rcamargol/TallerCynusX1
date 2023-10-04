package co.edu.unbosque.controller;

import co.edu.unbosque.view.View;

public class Controller {

	private View gui;

	public Controller() {
		gui = new View();

		String resultadoHeroe = ("HEROES");
		gui.resultadoHeroe1(resultadoHeroe);
		gui.resultadoHeroe2(resultadoHeroe);

		String resultadoMortales = ("MORTALES");
		gui.resultadoMortales(resultadoMortales);

		String resultadoDesterrados = ("");
		gui.resultadoDesterrados(resultadoDesterrados);

	}

}
