package co.edu.unbosque.model;

public abstract class KublaKan {

	protected int edadAños;
	protected double estatura;
	protected String colorDeOjos;
	protected boolean alma;
	
	protected abstract String habitar();
	protected abstract String sentir();
	public int getEdadAños() {
		return edadAños;
	}
	public void setEdadAños(int edadAños) {
		this.edadAños = edadAños;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public String getColorDeOjos() {
		return colorDeOjos;
	}
	public void setColorDeOjos(String colorDeOjos) {
		this.colorDeOjos = colorDeOjos;
	}
	public boolean isAlma() {
		return alma;
	}
	public void setAlma(boolean alma) {
		this.alma = alma;
	}
	
	
}
