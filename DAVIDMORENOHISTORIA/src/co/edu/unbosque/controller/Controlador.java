package co.edu.unbosque.controller;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.Desterrado;
import co.edu.unbosque.model.Heroe;
import co.edu.unbosque.model.KublaKan;
import co.edu.unbosque.model.Mortal;

public class Controlador {
	
	public void Funcionar() {
		
		JOptionPane.showMessageDialog(null, "Yo soy " + Heroe.getNombre() + "Tengo " + KublaKan.getEdad() + "Mis ojos son color " + KublaKan.getColorOjos() + " " + KublaKan.getAlma() + " " + Heroe.CrearFuego() + " " + Heroe.Volar());
		JOptionPane.showMessageDialog(null, "Yo soy" + Mortal.getNombre() + "Tengo " + KublaKan.getEdad() + "Mis ojos son color " + KublaKan.getColorOjos() + " " + KublaKan.getAlma() + " " + Mortal.AdquirirConocimiento() + " " + Mortal.TenerFamilia() + " " + Mortal.EjercerProfesion());
		JOptionPane.showMessageDialog(null, "Yo soy" + Desterrado.getNombre() + "Tengo " + KublaKan.getEdad() + "Mis ojos son color " + KublaKan.getColorOjos() + " " + KublaKan.getAlma() + " " + Desterrado.Arrastar());
	}
}