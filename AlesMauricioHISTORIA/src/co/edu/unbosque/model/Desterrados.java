package co.edu.unbosque.model;

public class Desterrados extends KublanKan {

	public Desterrados(int edad,int estatura,String colorDeOjos) {
		super.edad = edad;
		super.estatura = estatura;
		super.colorDeOjos = colorDeOjos;
		super.alma = false;
	}
	
	public String arrastrar() {
		return "yo me arrastro";
	}
	
	@Override
	public String habitar() {
		return "habitamos en el sur del planeta pay, solo sur pa";
	}

	@Override
	public String sentir() {
		return "solo me siento a mi mismo soy re ezquisofrenico";
	}

}
