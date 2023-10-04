package co.edu.unbosque.model;

public class Heroe extends KublaKan {
	
	public Heroe() {
		super.estatura = 3;
	}

	@Override
	public String habitar() {
		return "Soy héroe y habito el norte del planeta";
	}

	@Override
	public String sentir() {
		return "Soy héroe y me siento a mí mismo/a y a seres de otros mundos";
	}
	
	
	public String volar() {
		return "Soy héroe y vuelo por los aires";
	}
	
	public String crearFuego() {
		return "Soy héroe y creo fuego con mis manos";
	}
	
	public String detenerElTiempo() {
		return "Soy héroe y detengo el tiempo";
	}
}