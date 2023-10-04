package co.edu.unbosque.model;

public class Mortal extends KublaKan {
	
	private static String nombre;
	
	public Mortal (int edad, String estatura, String colorOjos, String alma, String nombre) {
		super (edad, estatura, colorOjos, alma);
		this.nombre = nombre;
		this.colorOjos = "Violeta";
	}	
	
	public static String getNombre() {
		return nombre;
	}
	
	public static String AdquirirConocimiento () {
		return "Yo puedo adquirir conocimiento";
	}
	
	public static String TenerFamilia () {
		return "Yo puedo tener familia";
	}
	
	public static String EjercerProfesion () {
		return "Yo puedo ejercer profesion";
	}

	@Override
	public String Habitar() {
		// TODO Auto-generated method stub
		return "Yo habito en el Este del planeta";
	}

	@Override
	public String Sentir() {
		// TODO Auto-generated method stub
		return "Yo puedo sentir otros mortales";
	}

}
