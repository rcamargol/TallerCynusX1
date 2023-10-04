package co.edu.unbosque.model;

public abstract class KublaKan {

	protected int edad;
	protected int altura;
	protected String colorOjos;
	protected boolean alma;
	protected String nombre;

	public abstract String habitarPlaneta();

	public abstract String sentir();

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public boolean getAlma() {
		return alma;
	}

	public void setAlma(boolean alma) {
		this.alma = alma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	

}
