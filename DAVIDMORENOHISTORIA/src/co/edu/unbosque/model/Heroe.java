package co.edu.unbosque.model;

public class Heroe extends KublaKan {
	
	private static String nombre;
		
	public Heroe (int edad, String estatura, String colorOjos, String alma, String nombre) {
		super (edad, estatura, colorOjos, alma);
		this.nombre = nombre;
		this.estatura = "3 mts";
	}	
	
	public static String getNombre() {
		return nombre;
	}
	
	public static String CrearFuego () {
		return "Yo puedo crear fuego";
	}
	
	public static String Volar () {
		return "Yo puedo volar";
	}
	
	public String DetenerTiempo () {
		return "Yo puedo detener el tiempo";
	}

	public String Habitar() {
		// TODO Auto-generated method stub
		return "Yo habito en el norte del planeta";
	}

	public String Sentir() {
		// TODO Auto-generated method stub
		return "Yo me siento a mi mismo y a seres de otros mundos";
	}
	

}
