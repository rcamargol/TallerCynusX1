package co.edu.unbosque.model;

public class Desterrados extends Kublakan{

	public Desterrados(double estatura, String colorDeOjos) {
		super.edad = 1500;
		super.estatura = estatura;
		super.colorDeOjos = colorDeOjos;
		super.alma = false;
	}
	
	public String arrastrar() {
		return "Siempre comiendo polvo";
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Vivo en el sur del planeta, puro Latan";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "A duras penas se que estoy vivo";
	}

}
