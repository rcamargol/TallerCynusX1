package co.edu.unbosque.controller;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.*;

public class Controller {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void crearYMostrarSeres() throws SerFalsoException, SerSolitarioException, SerVoladorException {
        // Crear objetos de los seres
		HeroeSer kira = new HeroeSer("Kira", 3000);
		HeroeSer astar = new HeroeSer("Astar", 2800);
		Desterrado renk = new Desterrado("Renk", 1500);

		// Mostrar información en la vista
		view.mostrarInformacion(kira);
		view.mostrarInformacion(astar);
		view.mostrarInformacion(renk);
    }
}
