package co.edu.unbosque.model;

public abstract class Descendiente {
	protected String nombre;
	protected int edad;
	protected double estatura;
	protected String colorOjos;
	protected boolean almaAutentica;

	public Descendiente(String nombre, int edad, double estatura, String colorOjos, boolean almaAutentica) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
		this.colorOjos = colorOjos;
		this.almaAutentica = almaAutentica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract String habitar();

	public abstract String sentir();

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public boolean isAlmaAutentica() {
		return almaAutentica;
	}

	public void setAlmaAutentica(boolean almaAutentica) {
		this.almaAutentica = almaAutentica;
	}

}
