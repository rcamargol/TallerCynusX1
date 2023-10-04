package co.edu.unbosque.model;

public class Desterrado extends KublaKan {
	
	public Desterrado() {
		super.alma = "Falsa";
		super.edad = 1500;
	}

	@Override
	public String habitar() {
		return "Soy desterrado y habito en el extremo sur del planeta";
	}

	@Override
	public String sentir() {
		return "Soy desterrado y no siento a nadie más que a mí mismo";
	}
	
	public String arrastrar() {
		return "Soy desterrado y me arrastro de un lugar a otro";
	}
	
}
