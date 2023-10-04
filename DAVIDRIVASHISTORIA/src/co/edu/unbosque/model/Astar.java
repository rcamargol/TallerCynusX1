package co.edu.unbosque.model;

public class Astar extends Heroes{
	
	private String nombre = "Astar";

	public Astar(int edad, float estatura, String colorDeOjos, boolean alma) {
		super(edad, estatura, colorDeOjos, alma);
	}

	@Override
	public String habitarPlaneta() {
		return super.habitarPlaneta();
	}

	@Override
	public String sentir() {
		return super.sentir();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
