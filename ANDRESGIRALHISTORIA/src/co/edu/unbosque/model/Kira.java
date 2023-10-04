package co.edu.unbosque.model;

public class Kira extends Heroes {
	private int fuerza;
	private String arma;
	public Kira(int edad, double estatura, String colorOjos, boolean alma, int fuerza, String arma) {
		super(edad, estatura, colorOjos, alma);
		this.fuerza=fuerza;
		this.arma=arma;
	}
	public String teletransportacion() {
		return "Yo me voy a cualquier parte del mundo";
	}
	public String superFuerza() {
		return" levanto cualquier cosa";
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public String getArma() {
		return arma;
	}
	public void setArma(String arma) {
		this.arma = arma;
	}
	
	
}
