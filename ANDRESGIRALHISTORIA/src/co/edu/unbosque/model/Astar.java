package co.edu.unbosque.model;

public class Astar extends Heroes {
	private int velocidad;
	private int resistencia;
	//constructor
	public Astar(int edad, double estatura, String colorOjos, boolean alma,int velocidad,int resistencia) {
		super(edad, estatura, colorOjos, alma);
		this.velocidad=velocidad;
		this.resistencia=resistencia;
	}
	//metodos
	public String viajarTiempo() {
		return" viajar en el tiempo";
	}
	public String caminarAgua() {
		return"Puedo caminar en el agua";
	}
	//Get Set
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	
	
	

}
