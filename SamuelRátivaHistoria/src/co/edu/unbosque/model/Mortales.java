package co.edu.unbosque.model;

public class Mortales extends Kublakan{

	public Mortales(int Edad, float Estatura, String ColorOjos, boolean Alma) {
		super(Edad, Estatura,ColorOjos="Violeta",Alma);
	}
	
	public String AdquirirConocimiento() {
		return"Nostros podemos aprender cosas nuevas";
	}
	public String TenerFamilia() {
		return"Es comun tener una familia entre los mortales";
	}
	public String EjercerProfesion() {
		return "Cada uno tiene un rol y una profesion diferente";
		
	}

	@Override
	public String Habitar() {
		return "Nosotros habitamos en el este de el planeta";
	}

	@Override
	public String Sentir() {
		return "Podemos sentir la presencia de solamente otros mortales";
	}

}
