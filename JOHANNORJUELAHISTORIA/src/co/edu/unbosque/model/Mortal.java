package co.edu.unbosque.model;

public class Mortal extends KublaKan {

	protected String conocimiento;
	protected String familiares;
	protected String profesion;
	
	
	
	public Mortal() {
		
	}
	


	public String adquirirConocimientos() {
		return "Adquiere Conocimientos";
	}
	public String formarFamilia() {
		return "Forma una familia";
	}
	
	public void ejercerProfesion() {
		
	}
	@Override
	public void sentir() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void habitar() {
		// TODO Auto-generated method stub
		
	}
	
	public String getConocimiento() {
		return conocimiento;
	}
	public void setConocimiento(String conocimiento) {
		this.conocimiento = conocimiento;
	}
	public String getFamiliares() {
		return familiares;
	}
	public void setFamiliares(String familiares) {
		this.familiares = familiares;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}



	

}
