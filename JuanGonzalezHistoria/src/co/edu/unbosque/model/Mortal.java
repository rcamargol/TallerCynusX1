package co.edu.unbosque.model;

public class Mortal extends KublaKan {
	
	//estos atributos sobran
	
	
	protected String hobbies;
	protected String genero;

	public Mortal() {

		super.colorOjos = "violeta";
	}

	public String adquirirConocimiento() {

		return "el Dios KublaKan me dio la capacidad de adquirir conocimiento";
	}

	public String tenerFamilia() {

		return "Me ha sido concedida la capacidad de tenr una familia en este planeta";
	}

	public String ejercerProfesion() {

		return "Por mi raza mortal, debo ejercer una profesion para ser util en la sociedad";
	}

	@Override
	public String habitarPlaneta() {
		// TODO Auto-generated method stub
		return "habito el extremo sur del planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "tengo la capacidad de sentir la presencia de otros mortales";
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
