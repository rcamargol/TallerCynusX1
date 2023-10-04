package co.edu.unbosque.model;

public class Renk extends Desterrados {
	private int numeroBrazos;
	private int nivelSalto;
	//Constructor
	public Renk(int edad, double estatura, String colorOjos, boolean alma, int numeroBrazos, int nivelSalto) {
		super(edad, estatura, colorOjos, alma);
		this.numeroBrazos=numeroBrazos;
		this.nivelSalto=nivelSalto;
	}
	//Metodos
	public String regeneracion() {
		return "Yo me puedo regenerar";
	}
	public String sangrar() {
		return"no puedo sangrar";
	}
	//get set
	public int getNumeroBrazos() {
		return numeroBrazos;
	}
	public void setNumeroBrazos(int numeroBrazos) {
		this.numeroBrazos = numeroBrazos;
	}
	public int getNivelSalto() {
		return nivelSalto;
	}
	public void setNivelSalto(int nivelSalto) {
		this.nivelSalto = nivelSalto;
	}
	

}
