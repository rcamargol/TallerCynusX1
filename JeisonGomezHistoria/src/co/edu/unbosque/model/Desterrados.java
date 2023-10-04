package co.edu.unbosque.model;

public class Desterrados extends KublaKan {

	public Desterrados(int edadAños, double estatura, String colorDeOjos, boolean alma) {
		super.estatura = estatura;
		super.edadAños = edadAños;
		super.colorDeOjos = colorDeOjos;
		super.alma = alma;


	}

	public String arrastrar() {
		return "me arrastro de un lugar a otro";
	}

	@Override
	public String habitar() {
		return "en el extremo sur del planeta";
	}

	@Override
	public String sentir() {
		return "No sientes a nadie más que a ellos mismos";
	}
}