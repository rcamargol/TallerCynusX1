package co.edu.unbosque.model;

public class Héroes extends Kublakan{
	
	public Héroes(int edad, String colorDeOjos) {
		super.edad = edad;
		super.estatura = 3.0 ;
		super.colorDeOjos = colorDeOjos;
		super.alma = true;
	}
	
	public String volar() {
		return "¿Es un pajaro?, ¿es un avion?, no es un héroe";
	}
	public String crearFuego() {
		return "Toco el fuego y no me quemo";
	}
	public String detenerElTiempo() {
		return "No se muevan, a no pueden";
	}
	
	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Vivo al norte del planeta, soy clase alta";
	}
	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Siento la presencia de todos, incluida la mia";
	}

}
