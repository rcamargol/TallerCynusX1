package co.edu.unbosque.model;

public class David extends Mortales{
	
	private String nombre = "David";

	public David(int edad, double estatura, String colorDeOjos, boolean alma) {
		super(edad, estatura, colorDeOjos, alma);
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
	
	

}
