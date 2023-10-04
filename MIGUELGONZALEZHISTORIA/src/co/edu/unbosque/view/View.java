package co.edu.unbosque.view;


import javax.swing.JOptionPane;

import co.edu.unbosque.model.Desterrados;
import co.edu.unbosque.model.Heroes;
import co.edu.unbosque.model.Mortales;

public class View {

	public void mostrar(Object objeto) {
		String mensaje= "";
		
		if(objeto instanceof Heroes) {
			Heroes heroes = (Heroes)objeto;
			mensaje = "Nombre: "+ heroes.getNombre()+
					"\nEdad: "+ heroes.getEdad()+
					"\nEstatura: "+ heroes.getEstatura()+
					"\nColor Ojos: "+ heroes.getColorOjos()+
					"\nAlma: "+ heroes.isAlma()+
					"\nVolar: "+ heroes.volar()+
					"\nCrear fuego: "+ heroes.crearFuego()+
					"\nDetener tiempo: "+ heroes.detenerTiempo();
		} else if (objeto instanceof Heroes) {
			Heroes heroes = (Heroes)objeto;
			mensaje = "Nombre: "+ heroes.getNombre()+
					"\nEdad: "+ heroes.getEdad()+
					"\nEstatura: "+ heroes.getEstatura()+
					"\nColor Ojos: "+ heroes.getColorOjos()+
					"\nAlma: "+ heroes.isAlma()+
					"\nVolar: "+ heroes.volar()+
					"\nCrear fuego: "+ heroes.crearFuego()+
					"\nDetener tiempo: "+ heroes.detenerTiempo();
		} else if (objeto instanceof Mortales) {
			Mortales mortales = (Mortales)objeto;
			mensaje = "Nombre: "+ mortales.getNombre()+
					"\nEdad: "+ mortales.getEdad()+
					"\nEstatura: "+ mortales.getEstatura()+
					"\nColor Ojos: "+ mortales.getColorOjos()+
					"\nAlma: "+ mortales.isAlma()+
					"\nAdquirir Conocimientos: "+ mortales.adquirirConocimientos()+
					"\nTener familia: "+ mortales.tenerFamilia()+
					"\nEjercer profesion: "+ mortales.ejercerProfesion();
		} else if (objeto instanceof Desterrados) {
			Desterrados desterrados = (Desterrados)objeto;
			mensaje = "Nombre: "+ desterrados.getNombre()+
					"\nEdad: "+ desterrados.getEdad()+
					"\nEstatura: "+ desterrados.getEstatura()+
					"\nColor Ojos: "+ desterrados.getColorOjos()+
					"\nAlma: "+ desterrados.isAlma()+
					"\nArrastrar: "+ desterrados.arrastrar();
		}
		
		JOptionPane.showMessageDialog(null, mensaje, "Informacion de "+objeto.getClass().getSimpleName(),JOptionPane.INFORMATION_MESSAGE);
	}
}