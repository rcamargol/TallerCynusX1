package co.edu.unbosque.controller;

import co.edu.unbosque.model.Desterrados;
import co.edu.unbosque.model.Heroes;
import co.edu.unbosque.model.Mortales;
import co.edu.unbosque.view.View;

public class Controller {

	public Controller() {
		View view = new View();
		Heroes heroes = new Heroes("Kira", 53, "3 metros", "Verdes", true);
		Heroes heroes1 = new Heroes("Astar", 49, "3 metros", "Cafes", true);
		Mortales mortales = new Mortales("Miguel", 18, "1.65 metros", "Violeta", true);
		Desterrados desterrados = new Desterrados("Renk", 1500, "2 metros", "Negros", false);
		
		view.mostrar(heroes);
		view.mostrar(heroes1);
		view.mostrar(mortales);
		view.mostrar(desterrados);
	}
}
