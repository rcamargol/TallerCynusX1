package Co.edu.unbosque.Model;

public class Esteban extends Mortales {

	public Esteban(String nombre, int edad, double altura, String colorDeOjos, String profesion, boolean alma,
			String Conocimientos, String lugarDeResidencia) throws ColorDeOjosException {
		super(nombre, edad, altura, colorDeOjos, profesion, alma, Conocimientos, lugarDeResidencia);
		// TODO Auto-generated constructor stub
	}

	public String planeta() {
		return " Soy " + getNombre() + " y soy de la tierra";
	}

}
