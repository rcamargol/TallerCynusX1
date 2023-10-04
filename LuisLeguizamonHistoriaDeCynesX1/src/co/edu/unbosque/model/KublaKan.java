package co.edu.unbosque.model;

public abstract class KublaKan {
	
	protected int edad;
	protected double estatura;
	protected String colorDeOjos;
	protected String alma;
	
	public abstract String habitar();
	public abstract String sentir();
	
	
	
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		if (validarNumero(edad) == true) {
			this.edad = edad;
		}
	}
	
	protected abstract boolean validarNumero(double estatura2);
	public double getEstatura() {
		return estatura;
	}
	
	public void setEstatura(double estatura) {
		if (validarNumero(estatura) == true) {
			this.estatura = estatura;
		}
	}
	
	public String getColorDeOjos() {
		return colorDeOjos;
	}
	
	public void setColorDeOjos(String colorDeOjos) {
		if (validarString(colorDeOjos) == true) {
			this.colorDeOjos = colorDeOjos;
		}
	}
	
	protected abstract boolean validarString(String colorDeOjos2);
	public String getAlma() {
		return alma;
	}
	
	public void setAlma(String alma) {
		if (validarString(alma) == true && validarAlmaBooleana(alma)) {
			this.alma = alma;
		}
	}
	protected abstract boolean validarAlmaBooleana(String alma2);
}



