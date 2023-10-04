package co.edu.unbosque.model;

public class Desterrados extends KublaKan {
	

	public Desterrados(int edad,double altura , String colorDeOjos) {
		super.edad = 1500;
		super.altura = altura;
		super.colorOjos = colorOjos;
		super.alma=false;
	}
	public 	String arrastrar() {
		return "voy a todos lados arrastrandome ";
	}

	public String sentir() {
		return "solo siento mi soledad ";
	}
		public String habitar() {
		return "yo vivo al sur";
	}
		public boolean alma(boolean b) {
			return false;
		}
	
}
