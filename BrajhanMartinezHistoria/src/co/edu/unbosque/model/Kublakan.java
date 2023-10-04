package co.edu.unbosque.model;

public abstract class Kublakan {
	
	// Atributos que van a heredar todas las clases
	protected int edad;
	protected double estatura; // En metros
	protected String colorDeOjos;
	protected boolean alma;
	
	// Metodos que van a heredar todas las clases
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
	public String getColorDeOjos() {
		return colorDeOjos;
	}
	public void setColorDeOjos(String colorDeOjos) {
		this.colorDeOjos = colorDeOjos;
	}
	public boolean getAlma() {
		return alma;
	}
	public void setAlma(boolean alma) {
		this.alma = alma;
	}
}
