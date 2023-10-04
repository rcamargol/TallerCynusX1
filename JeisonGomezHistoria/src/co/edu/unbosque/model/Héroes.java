package co.edu.unbosque.model;

public class Héroes extends KublaKan {

	public Héroes(double estatura, int edadAños, String colorDeOjos, boolean alma) {
		super.estatura = estatura;
		super.edadAños = edadAños;
		super.colorDeOjos = colorDeOjos;
		super.alma = alma;
	}

	public String volar() {
		return "Yo puedo volar";
	}

	public String crearFuego() {
		return "hacer fuego con las manos";

	}

	public String detenerElTiempo() {
		return "detener el tiempo";
	}

	@Override
	public String habitar() {
		return "Habitan al norde del planeta";
		// TODO Auto-generated method stub

	}

	@Override
	public String sentir() {
		return "Sentian a seres de otro mundo y a si mismos";
		// TODO Auto-generated method stub

	}

}
