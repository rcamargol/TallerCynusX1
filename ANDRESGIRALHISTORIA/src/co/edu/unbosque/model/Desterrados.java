package co.edu.unbosque.model;

public class Desterrados extends KublaKan {
	public Desterrados(int edad, double estatura, String colorOjos, boolean alma) {
		super(edad, estatura, colorOjos, alma=false);
	}
	//Metodos
	public String arrastrar() {
		return "Yo me arrastro";
	}
	@Override
	public String habitar() {
		return "habitamos el extremo sur del planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return"no sienten a nadie más que a ellos";
	}

}
