package co.edu.unbosque.model;

public class Heroe extends Descendiente {

	public Heroe(String nombre, int edad, double estatura, String colorOjos, boolean almaAutentica) {
		super(nombre, edad, estatura, colorOjos, almaAutentica);
		// TODO Auto-generated constructor stub
	}

	public String volar() {
		return "Acto seguido, el heroe emprende su vuelo";
	}

	public String crearFuego() {
		return "El fuego empieza a brotar de forma incandescente en sus manos";
	}

	public String detenerElTiempo() {
		return "Y todo se paralizó, ¡el heroe ha parado el tiempo!";
	}

	
	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Habito al norte del planeta Cynus X1.";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Soy capaz de sentirme a mi mismo, y de igual forma, a seres de otros mundos.";
	}

}
