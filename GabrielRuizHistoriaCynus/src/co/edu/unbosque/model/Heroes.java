package co.edu.unbosque.model;

public class Heroes  extends KublaKan {

	
	public Heroes (int edad,double altura , String colorOjos) {
		super.edad = edad;
		super. altura = 3;
		super.colorOjos = colorOjos;
		super.alma= true;
		super.altura = altura;
	}
	public String sentir() {
		return "yo me siento poderoso";
	}
	public String habitar() {
		return "yo vbivo en el norte, y este es mi hogar y lo voy a defender  ";
	}
	public double altura() {
		return  3;
	}
	public 	String volar() {
		return "en los cielos me puedes ver";
	} 
	public String crear() {
		return "tengo el poder de crear";
	}
	public String fuego() {
		return "estoy que ardo";
	}

}
