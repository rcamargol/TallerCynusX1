package co.edu.unbosque.model;

public abstract class KublaKan {

	protected int edad;
	protected String estatura;
	protected String colorOjos;
	protected boolean alma;
	
	
	public KublaKan(int edad, String estatura, String colorOjos, boolean alma) {
		super();
		this.edad = edad;
		this.estatura = estatura;
		this.colorOjos = colorOjos;
		this.alma = alma;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstatura() {
		return estatura;
	}

	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public boolean isAlma() {
		return alma;
	}

	public void setAlma(boolean alma) {
		this.alma = alma;
	}

	abstract void habitar();
	
	abstract void sentir();
}
