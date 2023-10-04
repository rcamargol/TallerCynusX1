package co.edu.unbosque.controller;

import co.edu.unbosque.model.Seres;
import co.edu.unbosque.view.View;

public class Controller {
	private View gui;
	private Seres seres;
	
	public Controller() {
		gui = new View();
		seres = new Seres();
		gui.mostrarMensaje("Hola soy Kira soy un héroe, tiene 28 " + seres.getKira().getEdad() + " años ,\n"
				+ " su color de ojos es   " + seres.getKira().getColorDeOjos() + ",\n"
				+ " mi estatura es de 1.50 " + seres.getKira().getEstatura() + " metros\n"
				+ " y mi alma es pura " + seres.getKira().getAlma() + ".\n"
				+ seres.getKira().habitar() + "\n" 
				+ seres.getKira().sentir() + "\n" 
				);
		
		gui.mostrarMensaje("Hola soy Astar y soy un héroe, tiene 30 " + seres.getAstar().getEdad() + " años,\n"
				+ " su color de ojos es  " + seres.getAstar().getColorDeOjos() + ",\n"
				+ " su estatura es 1.66" + seres.getAstar().getEstatura() + " metros\n"
				+ " y su alma es " + seres.getAstar().getAlma() + ".\n"
				+ seres.getAstar().habitar() + "\n" 
				+ seres.getAstar().sentir() + "\n"
			
				);
		
		gui.mostrarMensaje("Hola soy renk y soy desterrado lastimosamente , tiene 55" + seres.getRenk().getEdad() + " años,\n"
				+ " su color de ojos es  " + seres.getRenk().getColorDeOjos() + "\n"
				+ "su estatura es 1.75 " + seres.getRenk().getEstatura() + " metros\n"
				+ " y su alma es " + seres.getRenk().getAlma() + ".\n"
				+ seres.getRenk().habitar() + "\n" 
				+ seres.getRenk().sentir() + "\n"
				+ seres.getRenk().arrastrar() + "\n"
				);
		
		gui.mostrarMensaje("Hola soy Luis Leguizamon, soy Mortal, tengo 18 " + seres.getLuisleguizamon().getEdad() + " años,\n"
				+ " mi color de ojos es  " + seres.getLuisleguizamon().getColorDeOjos() + "\n"
				+ "mi estatura es 1.80 " + seres.getLuisleguizamon().getEstatura() + " metros\n"
				+ " y mi alma es " + seres.getLuisleguizamon().getAlma() + ".\n"
				+ seres.getLuisleguizamon().habitar() + "\n" 
				+ seres.getLuisleguizamon().sentir() + "\n"
				);
	}

	public View getGui() {
		return gui;
	}

	public void setGui(View gui) {
		this.gui = gui;
	}

	public Seres getSeres() {
		return seres;
	}

	public void setSeres(Seres seres) {
		this.seres = seres;
	}
}


