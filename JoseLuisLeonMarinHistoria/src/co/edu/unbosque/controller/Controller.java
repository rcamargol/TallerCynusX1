package co.edu.unbosque.controller;
import co.edu.unbosque.model.Ser;
import co.edu.unbosque.view.View;
public class Controller {
	
	private View gui;
	private Ser ser;
	
	public Controller() {
		gui = new View();
		ser = new Ser();
		
		gui.mostrarMensaje("Kira es héroe, tiene " + ser.getKira().getEdad() + " años,\n"
				+ " su color de ojos es " + ser.getKira().getColorDeOjos() + ",\n"
				+ " su estatura es " + ser.getKira().getEstatura() + " metros\n"
				+ " y su alma es " + ser.getKira().getAlma() + ".\n"
				+ ser.getKira().habitar() + "\n" 
				+ ser.getKira().sentir() + "\n"
				+ ser.getKira().volar() + "\n"
				+ ser.getKira().detenerElTiempo() + "\n"
				);
		
		gui.mostrarMensaje("Astar es héroe, tiene " + ser.getAstar().getEdad() + " años,\n"
				+ " su color de ojos es " + ser.getAstar().getColorDeOjos() + ",\n"
				+ " su estatura es " + ser.getAstar().getEstatura() + " metros\n"
				+ " y su alma es " + ser.getAstar().getAlma() + ".\n"
				+ ser.getAstar().habitar() + "\n" 
				+ ser.getAstar().sentir() + "\n"
				+ ser.getAstar().volar() + "\n"
				+ ser.getAstar().detenerElTiempo() + "\n"
				);
		
		gui.mostrarMensaje("Renk es desterrado, tiene " + ser.getRenk().getEdad() + " años,\n"
				+ " su color de ojos es " + ser.getRenk().getColorDeOjos() + "\n"
				+ "su estatura es " + ser.getRenk().getEstatura() + " metros\n"
				+ " y su alma es " + ser.getRenk().getAlma() + ".\n"
				+ ser.getRenk().habitar() + "\n" 
				+ ser.getRenk().sentir() + "\n"
				+ ser.getRenk().arrastrar() + "\n"
				);
		
		gui.mostrarMensaje("Soy Jose, soy mortal, tengo " + ser.getJose().getEdad() + " años,\n"
				+ " mi color de ojos es " + ser.getJose().getColorDeOjos() + "\n"
				+ "mi estatura es " + ser.getJose().getEstatura() + " metros\n"
				+ " y mi alma es " + ser.getJose().getAlma() + ".\n"
				+ ser.getJose().habitar() + "\n" 
				+ ser.getJose().sentir() + "\n"
				+ ser.getJose().adquirirConocimientos() + "\n"
				);
	}
}