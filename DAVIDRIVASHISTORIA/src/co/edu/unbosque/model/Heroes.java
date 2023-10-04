package co.edu.unbosque.model;

public class Heroes extends KublaKan {
	
	protected double estatura=4;

	//Constructor
	public Heroes(int edad, double estatura, String colorDeOjos, boolean alma) {
		super(edad, estatura, colorDeOjos, alma);
		this.estatura=estatura;
	}
	
	//Sobrescritura de metodos abstractos
	@Override
	public String habitarPlaneta() {
		return"Habitan en el norte";
		
	}

	@Override
	public String sentir() {
		return "Se sienten ellos mismos y a seres de otro mundo";
	}
	

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	//Metodos
	public String volar() {
		return "Yo vuelo por los aires";
	}
	public String crearFuego() {
		return "Puedo crear fuego con mis manos";
	}
	public String detenerTiempo() {
		return "Tengo la capacidad de detener el tiempo";
	}
	
}
