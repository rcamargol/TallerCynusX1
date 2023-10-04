package co.edu.unbosque.model;

public abstract class KublaKan {
	
	protected int edad;
	protected String colorOjos;
	protected double altura;
	protected boolean alma;
	
	public abstract String sentir();
	public abstract String habitar();
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getColorOjos() {
		return colorOjos;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	

}
