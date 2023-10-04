package co.edu.unbosque.model;

public class Fachada {

	private static Héroes heroes1;
	private static Héroes heroes2;
	private static Mortales mortales;
	private static Desterrados desterrados;

	public static String instanciarHeroe1() {
		heroes1 = new Héroes(3, 1000, "Rojos", true);
		return "Soy Kira y mido " + heroes1.getEstatura() + " metros" + ", tengo " + heroes1.getEdadAños() + " años. "
				+ heroes1.volar() + " y " + heroes1.crearFuego();

	}

	public static String instanciarHeroe2() {
		heroes2 = new Héroes(3, 800, "Morados", true);
		return "Soy Astar y mido " + heroes2.getEstatura() + " metros" + ", tengo " + heroes2.getEdadAños() + " años. "
				+ heroes2.volar() + " y " + heroes2.detenerElTiempo();
	}

	public static String instanciarMortales() {
		mortales = new Mortales(777, 2.10, "violeta", true);
		return "Soy Jeison y tengo " + mortales.getEdadAños() + " años " + ", mis ojos son de color "
				+ mortales.getColorDeOjos() + ", yo " + mortales.adquirirConocimientos() + " y"
				+ mortales.tenerFamilia();
	}

	public static String instanciarDesterrados() {
		desterrados = new Desterrados(1500, 2, "blancos", false);
		return "Mi nombre es Renk soy un desterrado de ojos " + desterrados.getColorDeOjos() + " tengo "
				+ desterrados.getEdadAños() + " años, " + " habito " + desterrados.habitar() + " y "
				+ desterrados.arrastrar();
	}
}
