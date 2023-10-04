package co.edu.unbosque.model;

public class Desterrados extends KublaKan{
	
	protected boolean alma=false;
	//Constructor
	public Desterrados(int edad, double estatura, String colorDeOjos, boolean alma) {
		super(edad, estatura, colorDeOjos, alma);
		this.alma=alma;
		// TODO Auto-generated constructor stub
	}

	
	//Sobrescritura de metodos abstractos
	@Override
	public String habitarPlaneta() {
		return "Habitan en el extremo sur";
		
	}

	@Override
	public String sentir() {
		return "Solo sienten a ellos mismos";
	}
	
	
	
	//Metodos

	public boolean isAlma() {
		return alma;
	}


	public void setAlma(boolean alma) {
		this.alma = alma;
	}


	public String arrastrar() {
		return "Solo nos podemos arrastrar";
	}
}
