package Co.edu.unbosque.Model;

public class Mortales extends Personaje {

	private String profesion;
	private String lugarDeResidencia;
	private String Conocimientos;

	public Mortales(String nombre, int edad, double altura, String colorDeOjos, String profesion, boolean alma,
			String Conocimientos, String lugarDeResidencia) throws ColorDeOjosException {
		super(nombre, edad, altura, colorDeOjos, alma, lugarDeResidencia);
		this.profesion = profesion;
		this.lugarDeResidencia = lugarDeResidencia;
		this.Conocimientos = Conocimientos;
		if (!colorDeOjos.equalsIgnoreCase(" Violetas ")) {
			throw new ColorDeOjosException();

		}
	}

	@Override
	public String ser() {
		return "Tengo un alma";

	}

	public String formarFamilia(String miembro) {
		return "Hola soy " + getNombre() + " y he formado mi familia con " + miembro;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getLugarDeResidencia() {
		return lugarDeResidencia;
	}

	public void setLugarDeResidencia(String lugarDeResidencia) {
		this.lugarDeResidencia = lugarDeResidencia;
	}

	public String getConocimientos() {
		return Conocimientos;
	}

	public void setConocimientos(String conocimientos) {
		Conocimientos = conocimientos;
	}

	@Override
	public String habilidad() {
		return "Puedo sentir la presencia de otros mortales";
	}
}