package co.edu.unbosque.model;

public class Desterrado extends Descendiente{

	public Desterrado(String nombre, int edad, double estatura, String colorOjos, boolean almaAutentica) {
		super(nombre, edad, estatura, colorOjos, almaAutentica);
		// TODO Auto-generated constructor stub
	}
	
	public String arrastrarse() {
		return "Yo me arrastro sobre mi miseria, sobre el sufrimiento causado por el abandono de mi creador.";
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Habito al extremo sur del planeta Cynus X1, alejado de heroes y mortales.";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "La soledad es mi amiga, solo me siento a mi.";
	}
	
	

}
