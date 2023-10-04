package co.edu.unbosque.model;

public class Héroes extends KublanKan{

	public Héroes(int edad,int estatura,String colorDeojos,Boolean alma) {
		super.edad = edad;
		super.estatura = estatura;
		super.colorDeOjos = colorDeojos;
		super.alma = alma;
	}
	
	public String volar() {
		return "yo vuelo tu vuelas nosotros volamos";
	}
	public String crearFuego() {
		return "el fuego quema";
	}
	public String detenerEltiempo() {
		return "tiempo parao";
	}
	
	@Override
	public String habitar() {
		return "yo vivo en el norte del planeta";
	}
	@Override
	public String sentir() {
		return "yo me puedo comunicar con parceros de otro mundo";
	}
	

}
