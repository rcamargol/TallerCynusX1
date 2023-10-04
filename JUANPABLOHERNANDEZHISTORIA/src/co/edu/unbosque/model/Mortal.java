package co.edu.unbosque.model;

public class Mortal extends Descendiente {

	public Mortal(String nombre, int edad, double estatura, String colorOjos, boolean almaAutentica) {
		super(nombre, edad, estatura, colorOjos, almaAutentica);
		
	}
	
	public String adquirirConocimientos() {
		return "A base del estudio de mi entorno, logro expandir mis conocimientos.";
	}
	
	public String tenerFamilia() {
		return "La vida me ha dado el placer de tener una familia, una gran pareja e hijos grandes y fuertes.";
	}
	
	public String ejercerProfesion() {
		return "Cumplo mi labor con la sociedad, ejerciendo mi profesión, y soy feliz con ello.";
	}
	
	
	
	
	

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Habito al este del planeta Cynus X1";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Siento la presencia de mi gente, de otros mortales igual que yo.";
	}

}
