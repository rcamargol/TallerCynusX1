package Co.edu.unbosque.Model;

public class Astar extends Heroe {

	public Astar(String nombre, int edad, double altura, String colorDeOjos, boolean alma, String planeta, String Fuego,
			String volar, String detenerElTiempo) throws AlturaIncorrectaException {
		super(nombre, edad, altura, colorDeOjos, alma, planeta, Fuego, volar, detenerElTiempo);

	}

	public String poder() {
		return getNombre() + " Tengo el poder de " + getDetenerElTiempo();
	}

}
