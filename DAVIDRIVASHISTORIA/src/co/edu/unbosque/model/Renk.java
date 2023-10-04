package co.edu.unbosque.model;

public class Renk extends Desterrados{
	
	private String nombre = "Renk";
	private boolean almaR = true;

	public Renk(int edad, double estatura, String colorDeOjos, boolean alma) {
		super(edad, estatura, colorDeOjos, alma);
		this.alma = almaR;
	}

	@Override
	public String habitarPlaneta() {
		// TODO Auto-generated method stub
		return super.habitarPlaneta();
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return super.sentir();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isAlmaR() {
		return almaR;
	}

	public void setAlmaR(boolean almaR) {
		this.almaR = almaR;
	}

	
	
	
	

}
