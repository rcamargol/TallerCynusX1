package co.edu.unbosque.model;

public class Mortales extends KublaKan {

	public Mortales(int edadAños, double estatura, String colorDeOjos, boolean alma) {
		super.estatura = estatura;
		super.edadAños = edadAños;
		super.colorDeOjos = colorDeOjos;
		super.alma = alma;

	}

	public String adquirirConocimientos() {
		return "puedo adquirir conocimientos";
	}

	public String tenerFamilia() {
		return " tengo una familia";
	}

	public String ejercerProfesión() {
		return " puedo ejercer una profesion";
	}

	@Override
	public String habitar() {
		return "Habitan el extremo sur del planeta";
	}

	@Override
	public String sentir() {
		return "Solo pueden sentirse a ellos mismos";
	}

}