package co.edu.unbosque.model;

public abstract class KublanKan {
	protected int edad;
	protected int estatura;
	protected String colorDeOjos;
	protected Boolean alma;
	
	public abstract String habitar();
	public abstract String sentir();
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEstatura() {
		return estatura;
	}
	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}
	public String getColorDeOjos() {
		return colorDeOjos;
	}
	public void setColorDeOjos(String colorDeOjos) {
		this.colorDeOjos = colorDeOjos;
	}
	public Boolean getAlma() {
		return alma;
	}
	public void setAlma(Boolean alma) {
		this.alma = alma;
	}

	
}
