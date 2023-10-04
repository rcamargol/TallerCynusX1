package co.edu.unbosque.controller;

import co.edu.unbosque.model.Seres;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View gui;
	private Seres seres;
	
	public Controller() {
		gui = new View();
		seres = new Seres();
		
		gui.mostrarMensaje("Kira es héroe, tiene " + seres.getKira().getEdad() + " años,\n"
				+ " su color de ojos es " + seres.getKira().getColorDeOjos() + ",\n"
				+ " su estatura es " + seres.getKira().getEstatura() + " metros\n"
				+ " y su alma es " + seres.getKira().getAlma() + ".\n"
				+ seres.getKira().habitar() + "\n" 
				+ seres.getKira().sentir() + "\n"
				+ seres.getKira().volar() + "\n"
				+ seres.getKira().detenerElTiempo() + "\n"
				);
		
		gui.mostrarMensaje("Astar es héroe, tiene " + seres.getAstar().getEdad() + " años,\n"
				+ " su color de ojos es " + seres.getAstar().getColorDeOjos() + ",\n"
				+ " su estatura es " + seres.getAstar().getEstatura() + " metros\n"
				+ " y su alma es " + seres.getAstar().getAlma() + ".\n"
				+ seres.getAstar().habitar() + "\n" 
				+ seres.getAstar().sentir() + "\n"
				+ seres.getAstar().volar() + "\n"
				+ seres.getAstar().detenerElTiempo() + "\n"
				);
		
		gui.mostrarMensaje("Renk es desterrado, tiene " + seres.getRenk().getEdad() + " años,\n"
				+ " su color de ojos es " + seres.getRenk().getColorDeOjos() + "\n"
				+ "su estatura es " + seres.getRenk().getEstatura() + " metros\n"
				+ " y su alma es " + seres.getRenk().getAlma() + ".\n"
				+ seres.getRenk().habitar() + "\n" 
				+ seres.getRenk().sentir() + "\n"
				+ seres.getRenk().arrastrar() + "\n"
				);
		
		gui.mostrarMensaje("Soy Andrey, soy mortal, tengo " + seres.getAndrey().getEdad() + " años,\n"
				+ " mi color de ojos es " + seres.getAndrey().getColorDeOjos() + "\n"
				+ "mi estatura es " + seres.getAndrey().getEstatura() + " metros\n"
				+ " y mi alma es " + seres.getAndrey().getAlma() + ".\n"
				+ seres.getAndrey().habitar() + "\n" 
				+ seres.getAndrey().sentir() + "\n"
				+ seres.getAndrey().adquirirConocimientos() + "\n"
				);
	}
}
