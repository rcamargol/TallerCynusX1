package co.edu.unbosque.model;

public class Heroe extends KublaKan {

	protected int tiempoSiendoHeroe;
	protected String aliasDeHeroe;

	public Heroe() {

		super.altura = 3;

	}

	public String volar() {

		return "Tengo la habilidad de volar";
	}

	public String crearFuego() {

		return "Tengo la capacidad de crear fuego";

	}

	public String detenerElTiempo() {

		return "Tengo la capacidad de detener el tiempo";
	}

	@Override
	public String habitarPlaneta() {

		return "Habito la zona norte del planeta";

	}

	@Override
	public String sentir() {

		return "Tengo la capacidad de sentirme y sentir a seres de otros mundos";
	}

	public int getTiempoSiendoHeroe() {
		return tiempoSiendoHeroe;
	}

	public void setTiempoSiendoHeroe(int tiempoSiendoHeroe) {
		this.tiempoSiendoHeroe = tiempoSiendoHeroe;
	}

	public String getNombreDeHeroe() {
		return aliasDeHeroe;
	}

	public void setNombreDeHeroe(String nombreDeHeroe) {
		this.aliasDeHeroe = nombreDeHeroe;
	}

}
