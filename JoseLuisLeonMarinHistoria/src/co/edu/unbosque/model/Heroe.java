package co.edu.unbosque.model;

public class Heroe extends KublaKan {
	
	public Heroe() {
		super.estatura = 3;
	}

	@Override
	public String habitar() {
		return "habita en la parte gomela del planeta";
	}

	@Override
	public String sentir() {
		return "Se siente la ultima coca cola del desierto";
	}
	
	
	public String volar() {
		return "vuela por los aires";
	}
	
	public String crearFuego() {
		return "crea fuego ";
	}
	
	public String detenerElTiempo() {
		return "detiene el tiempo";
	}
}
