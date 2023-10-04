package Co.edu.unbosque.Model;

public class Kira extends Heroe {

	public Kira(String nombre, int edad, double altura, String colorDeOjos, boolean alma, String planeta, String Fuego,
			String volar, String detenerElTiempo) throws AlturaIncorrectaException {
		super(nombre, edad, altura, colorDeOjos, alma, planeta, Fuego, volar, detenerElTiempo);

	}

	public String habilidades() {
		return getNombre() + "  Y yo tengo todos los poderes : " + getFuego();
	}

}
