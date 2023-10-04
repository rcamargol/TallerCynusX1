package Co.edu.unbosque.Model;

public class Heroe extends Personaje {

	private String Fuego;
	private String volar;
	private String detenerElTiempo;

	public Heroe(String nombre, int edad, double altura, String colorDeOjos, boolean alma, String planeta, String Fuego,
			String volar, String detenerElTiempo) throws AlturaIncorrectaException {
		super(nombre, edad, altura, colorDeOjos, alma, planeta);
		this.Fuego = Fuego;
		this.volar = volar;
		this.detenerElTiempo = detenerElTiempo;

		if (altura != 3.0) {
			throw new AlturaIncorrectaException();
		}

	}

	@Override
	public String ser() {
		return "Tengo alma ";
	}

	@Override
	public String habilidad() {
		return " Tengo la habilidad de:  ";
	}

	public String getFuego() {
		return Fuego;
	}

	public void setFuego(String fuego) {
		Fuego = fuego;
	}

	public String getVolar() {
		return volar;
	}

	public void setVolar(String volar) {
		this.volar = volar;
	}

	public String getDetenerElTiempo() {
		return detenerElTiempo;
	}

	public void setDetenerElTiempo(String detenerElTiempo) {
		this.detenerElTiempo = detenerElTiempo;
	}

}
