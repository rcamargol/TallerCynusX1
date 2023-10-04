package co.edu.unbosque.controller;


import co.edu.unbosque.model.Desterrado;
import co.edu.unbosque.model.*;
import co.edu.unbosque.view.*;

public class Controller {
	private SerView serView;
	private Heroe heroe;
	private Mortal mortal;
	private Desterrado desterrado;
	
	public Controller() {
		 serView = new SerView();
		//Inicialización las instancias de los personajes
		heroe = new Heroe("Kira","Alma de Héroes", 300,"Norte");
		mortal = new Mortal("Juan", "Alma de Mortal", "Violeta","Este");
		desterrado = new Desterrado("Renk","Sin Alma", "Extremo sur",1500,false);
		mostrarPersonaje("Heroe");
		mostrarPersonaje("Mortal");
		mostrarPersonaje("Desterrado");
	}
	//Mortal Exception
	public void MortalException() {
		try {
			mortal.morir();
		} catch (MortalException e) {
			System.out.println();
			serView.mostrarMensaje("Error: " + e.getMessage());
		}
	}
	//Heroe Exception
	public void HeroeException() {
		try {
			heroe.perder();
		} catch (HeroeException e) {
			System.out.println();
			serView.mostrarMensaje("Error: " + e.getMessage());
		}
	}
	//Mortal Exception
	public void ExceptionDesterrado() {
		try {
			mortal.morir();
		} catch (MortalException e) {
			System.out.println();
			serView.mostrarMensaje("Error: " + e.getMessage());
		}
	}
	//Desterrado Exeption
	public void volar() {
		try {
			desterrado.volar();
		} catch (DesterradoException e) {
			System.out.println();
			serView.mostrarMensaje("Error: " + e.getMessage());
		}
	}
	
	public void mostrarPersonaje(String seleccion) {
		if(seleccion.equalsIgnoreCase("Heroe")) {
			serView.mostrarHeroe(heroe);
		}else if(seleccion.equalsIgnoreCase("Mortal")) {
			serView.mostrarMortal(mortal);
		}else if(seleccion.equalsIgnoreCase("Desterrado")) {
			serView.mostrarDesterrado(desterrado);
		}else {
			
		}
		
	}
	

}
