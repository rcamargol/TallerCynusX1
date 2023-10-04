package co.edu.unbosque.model;

public abstract class KublaKlan {
	protected String nombre;
	protected int edad;
	protected int estatura;
	protected String colorDeOjos;
	protected String alma;
	

	public abstract String existir();

	public abstract String respirar();

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

	public String getAlma() {
		return alma;
	}

	public void setAlma(String alma) {
		this.alma = alma;
	}

	

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
