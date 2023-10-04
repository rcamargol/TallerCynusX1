package co.edu.unbosque.model;

public class Mortales extends KublaKan{

	protected String colorDeOjos = "violeta";
	//Constructor
	public Mortales(int edad, double estatura, String colorDeOjos, boolean alma) {
		super(edad, estatura, colorDeOjos, alma);
		this.colorDeOjos = colorDeOjos;
	}

	
	//Sobrescritura de metodos abstractos
	@Override
	public String habitarPlaneta() {
		return "Habitan en el este";
		
	}

	@Override
	public String sentir() {
		return "Pueden sentir la precencia de otros mortales"; 
		
	}
	
	
	
	public String getColorDeOjos() {
		return colorDeOjos;
	}


	public void setColorDeOjos(String colorDeOjos) {
		this.colorDeOjos = colorDeOjos;
	}


	//Metodos
	public String adquirirConocimientos() {
		return "Podemos aprender muy rapido";
	}
	public String tenerFamilia() {
		return "Tengo una hermosa familia";
	}
	public String ejercerProfesion() {
		return "Trabajamos para aportar a nuestra sociedad";
	}
}
