package co.edu.unbosque.model;

public abstract class KublaKlan {
	protected String nombre;
	protected int edad;
	protected int estatura;
	protected String alma;
	protected String colorDeOjos;
	
	public int getEstatura() {
		return estatura;
	}
	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}
	public String getAlma() {
		return alma;
	}
	public void setAlma(String alma) {
		this.alma = alma;
	}
	public String getColorDeOjos() {
		return colorDeOjos;
	}
	public void setColorDeOjos(String colorDeOjos) {
		this.colorDeOjos = colorDeOjos;
	}
	
	
	
	public abstract String vivir();
	public abstract String observar();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
