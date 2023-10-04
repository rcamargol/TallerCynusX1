package co.edu.unbosque.model;

public abstract class KublaKan {
	
	protected int edad;
	protected float estatura; 
	protected String colorOjos;
	protected String alma; 
	
	
	public abstract String habitarPlaneta();
	public abstract String sentir();
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	public String getColorOjos() {
		return colorOjos;
	}
	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}
	public String getAlma() {
		return alma;
	}
	public void setAlma(String alma) {
		this.alma = alma;
	}
	
	
	
	
	

}
