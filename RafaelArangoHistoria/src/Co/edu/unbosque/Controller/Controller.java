package Co.edu.unbosque.Controller;

import Co.edu.unbosque.Model.AlturaIncorrectaException;
import Co.edu.unbosque.Model.ColorDeOjosException;
import Co.edu.unbosque.Model.EdadIncorrectaException;
import Co.edu.unbosque.Model.Mostrar;
import Co.edu.unbosque.View.View;

public class Controller {
	private Mostrar mostrar;

	private View vista;

	public Controller() {

		mostrar = new Mostrar();
		vista = new View();

		try {
			vista.escribirDato(" El heroe: " + mostrar.Heroe());
		} catch (AlturaIncorrectaException e) {
			vista.escribirDato(e.getMessage());
		}

		try {
			vista.escribirDato("El otro heroe: " + mostrar.Astar());
		} catch (AlturaIncorrectaException e) {
			vista.escribirDato(e.getMessage());
		}

		try {
			vista.escribirDato("El desterrado Renk: " + mostrar.Renk());
		} catch (EdadIncorrectaException e) {
			vista.escribirDato(e.getMessage());
		}
		try {
			vista.escribirDato(" El mortal Esteban: " + mostrar.mortales());
		} catch (ColorDeOjosException e) {
			vista.escribirDato(e.getMessage());
		}
	}
}

//		vista.escribirDato(" El heroe: " + mostrar.Heroe());
//
//		vista.escribirDato("El otro heroe: " + mostrar.Astar());
//
//		vista.escribirDato("El desterrado: " + mostrar.Renk());
//
//		
//		vista.escribirDato("El mortal: "+mostrar.mortales());
//		
//	}
//
//}
