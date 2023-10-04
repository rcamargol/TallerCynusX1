package Co.edu.unbosque.Model;

public class Mostrar {

	private Kira kira;
	private Astar astar;
	private Renk renk;
	private Esteban esteban;

	public String Heroe() throws AlturaIncorrectaException {

		this.kira = new Kira("Kira un heroe ", 25, 3, "No tengo color de ojos", true, " Vivo en el norte del planeta",
				" Hacer fuego con mis  manos! ", null, null);
		return " Hola soy " + kira.getNombre() + " y tengo la edad de: " + kira.getEdad() + " y Mido: "
				+ +kira.getAltura() + "\n" + "Tambien: " + kira.ser() + kira.getColorDeOjos() + kira.getPlaneta() + "\n"
				+ kira.habilidades();
	}

	public String Astar() throws AlturaIncorrectaException {
		this.astar = new Astar("Astar un heroe", 28, 3, "No tengo color de ojos ", true, "Vivo en el norte del planeta",
				null, null, " Puedo detener el tiempo! ");
		return " Hola soy " + astar.getNombre() + " y tengo la edad de: " + astar.getEdad() + " y Mido: "
				+ +astar.getAltura() + "\n" + "Tambien: " + astar.ser() + astar.getColorDeOjos() + astar.getPlaneta()
				+ "\n" + astar.poder();

	}

	public String Renk() throws EdadIncorrectaException {
		this.renk = new Renk(" Renk un desterrado ", 1400, 1.9, " No tengo color de ojos ", false);
		return " Hola soy " + renk.getNombre() + " y tengo la edad de: " + renk.getEdad() + " y Mido: "
				+ +renk.getAltura() + "\n" + "Tambien: " + renk.ser() + renk.getColorDeOjos() + "\n"
				+ " Mis poderes son : " + renk.habilidad();
	}

	public String mortales() throws ColorDeOjosException {
		this.esteban = new Esteban(" Esteban", 20, 1.63, " Violetas ", " No tengo ", true, " Programador ",
				"  Bogota ");
		return "Hola mi nombre es: " + esteban.getNombre() + "\n" + " Mi edad es de: " + esteban.getEdad() + "\n"
				+ " Mi altura es de: " + esteban.getAltura() + "\n" + "Color de ojos son: " + esteban.getColorDeOjos()
				+ "  Y   " + esteban.ser() + "\n" + " profesion: " + esteban.getProfesion() + "\n"
				+ " Yo estoy aprendiendo a tener un conociemiento como: " + esteban.getConocimientos() + "\n"
				+ " Vivo en " + esteban.getLugarDeResidencia() + "\n"
				+ esteban.formarFamilia(" Mi mama y mis hermanos ") + " Tengo una habilidad: " + esteban.habilidad()
				+ "\n" + esteban.planeta();
	}
}
