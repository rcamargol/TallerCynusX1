package co.edu.unbosque.model;

public abstract class KublaKan {

	//Atributos
	protected int edad;
	protected double estatura;
	protected String colorDeOjos;
	protected boolean alma;
	
	
	
	//Constructor
	public KublaKan(int edad, double estatura, String colorDeOjos, boolean alma) {
		this.edad = edad;
		this.estatura = estatura;
		this.colorDeOjos = colorDeOjos;
		this.alma = alma;
	}
	
	
	//Metodos abstractos
	public abstract String habitarPlaneta();
	public abstract String sentir();
	
	
	//Getters y Setters
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
