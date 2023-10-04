package co.edu.unbosque.model;

public class Heroes extends KublaKan{
	
	protected String nombre;

	public Heroes(String nombre,int edad, String estatura, String colorOjos, boolean alma) {
		super(edad, estatura, colorOjos, alma);
		this.nombre = nombre;
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	void habitar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sentir() {
		// TODO Auto-generated method stub
		
	}
	
	public String volar() {
		return "yo puedo volar";
	}
	
	public String crearFuego() {
		return "puedo crear fuego con mis manos";
	}
	
	public String detenerTiempo() {
		return "tambien puedo detener el tiempo";
	}

}
