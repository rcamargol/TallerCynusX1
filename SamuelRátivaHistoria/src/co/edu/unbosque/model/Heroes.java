package co.edu.unbosque.model;

public class Heroes extends Kublakan {

	public Heroes(int Edad, float Estatura, String ColorOjos, boolean Alma) {
		super(Edad, Estatura=3, ColorOjos, Alma);
	}
	
	public String Volar() {
		return"Yo vuelo super rapido";
	}
	public String CrearFuego() {
		return"Yo puedo lanzar fuego con mis manos";
	}
	public String DetenerTiempo() {
		return "Yo puedo detener el tiempo cuando quiera";
	}

	@Override
	public String Habitar() {
		return "Los heroes habitamos al norte del planeta";
	}

	@Override
	public String Sentir() {
		return "Nosotros nos sentimos a nosotros mismos y a seres de otros mundos";
	}
	

}
