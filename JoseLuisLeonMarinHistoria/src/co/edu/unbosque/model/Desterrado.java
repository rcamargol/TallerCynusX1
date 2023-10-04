package co.edu.unbosque.model;

public class Desterrado extends KublaKan {
	
	public Desterrado() {
		super.alma = "Falsa";
		super.edad = 900;
	}

	@Override
	public String habitar() {
		return "habita en la zona peye del planeta";
	}

	@Override
	public String sentir() {
		return "es la vistima y siente dolor";
	}
	
	public String arrastrar() {
		return "se arrastra y queja";
	}
	
}
