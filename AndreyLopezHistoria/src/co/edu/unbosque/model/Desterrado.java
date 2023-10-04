package co.edu.unbosque.model;

public class Desterrado extends KublaKan {
	
	public Desterrado() {
		super.alma = "Falsa";
		super.edad = 1500;
	}

	@Override
	public String habitar() {
		return "habita en el extremo sur del planeta";
	}

	@Override
	public String sentir() {
		return "no siente a nadie más que a sí mismo/a";
	}
	
	public String arrastrar() {
		return "se arrastra de un lugar a otro";
	}
	
}
