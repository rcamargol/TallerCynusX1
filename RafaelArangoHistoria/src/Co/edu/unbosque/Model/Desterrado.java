package Co.edu.unbosque.Model;

public class Desterrado extends Personaje {

	public Desterrado(String nombre, int edad, double altura, String colorDeOjos, boolean alma) throws EdadIncorrectaException {
		super(nombre, edad, altura, colorDeOjos, alma, "Vivo en el sur del planeta");

		if (edad != 1500) {
			throw  new EdadIncorrectaException();

		}
	}

	@Override
	public String ser() {

		return " Nosotros nos arrastrabamos  de un lugar a otro, vivo en el sur del planeta";
	}

	@Override
	public String habilidad() {

		return "No soy capaz de sentir a nadie mas que sea yo mismo";
	}

}
