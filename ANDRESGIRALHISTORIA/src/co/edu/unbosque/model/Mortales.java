package co.edu.unbosque.model;

public class Mortales extends KublaKan {
	//Constrcutor
	public Mortales(int edad,double estatura,String colorOjos,boolean alma) {
		super(edad,estatura,colorOjos="Violeta",alma);
		
}
	//Metodos
	public String adquirirConocimientos() {
		return"Yo adquiero conociemientos";
	}
	public String tenerFamilia() {
		return"yo tengo familia";
	}
	public String ejercerProfesion() {
		return"Yo ejerso una profesion";
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return"Habitan en este planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return"sienten la presencia de otros mortales";
	}
	
}