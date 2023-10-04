package co.edu.unbosque.model;

public class Heroe extends KublaKan {
	
	public Heroe() {
		super.estatura = 3;
	}

	@Override
	public String habitar() {
		return "habita el norte del planeta";
	}

	@Override
	public String sentir() {
		return "Se siente a sí mismo/a y a seres de otros mundos";
	}
	
	
	public String volar() {
		return "vuela por los aires";
	}
	
	public String crearFuego() {
		return "crea fuego con mis manos";
	}
	
	public String detenerElTiempo() {
		return "detiene el tiempo";
	}
}
