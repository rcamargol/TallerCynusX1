package co.edu.unbosque.model;

public class Andres extends Mortales{
	private int numeroHijos;
	private boolean tenerCasa;
	//Constructor
	public Andres(int edad, double estatura, String colorOjos, boolean alma, int numeroHijos,boolean tenerCasa) {
		super(edad, estatura, colorOjos, alma);
		this.numeroHijos=numeroHijos;
		this.tenerCasa=tenerCasa;
	}
	//Metodos
	public String soñar() {
		return"Yo sueño";
	}
	public String imaginar() {
		return"Yo imagino";
	}
	//get set
	public int getNumeroHijos() {
		return numeroHijos;
	}
	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}
	public boolean isTenerCasa() {
		return tenerCasa;
	}
	public void setTenerCasa(boolean tenerCasa) {
		this.tenerCasa = tenerCasa;
	}
	
	
}
