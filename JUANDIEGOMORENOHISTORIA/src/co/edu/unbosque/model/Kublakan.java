package co.edu.unbosque.model;

public  abstract class Kublakan {
	
	protected int edad;
	protected double estatura;
	protected String colorOjos;
	protected String alma;
	
	
	public abstract String habitar();
	
	public abstract String sentir();

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
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
