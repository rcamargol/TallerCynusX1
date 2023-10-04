package co.edu.unbosque.model;

public class Desterrado extends KublaKan{

	private static String nombre;
		
	public Desterrado (int edad, String estatura, String colorOjos, String alma, String nombre) {
		super (edad, estatura, colorOjos, alma);
		this.nombre = nombre;
		this.edad = 1500;
	}	
	
	public static String getNombre() {
		return nombre;
	}
	
	public static String Arrastar () {
		return "Los desterrados nos arrastramos de un lugar a otro";
	}
	
	public String Habitar() {
		// TODO Auto-generated method stub
		return "Los desterrados habitamos en el sur del planeta";
	}

	public String Sentir() {
		// TODO Auto-generated method stub
		return "Solo puedo sentir otros desterrados";
	}

}
