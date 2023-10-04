package co.edu.unbosque.model;

public class Mortal extends KublaKan {
	
	public Mortal() {
		super.colorDeOjos = "Violeta";
	}

	@Override
	public String habitar() {
		return "Soy mortal y habito en el este del planeta";
	}

	@Override
	public String sentir() {
		return "Soy mortal y puedo sentir la presencia de otros mortales";
	}
	
	
	public String adquirirConocimientos() {
		return "Soy mortal y puedo adquirir conocimientos";
	}
	
	public String tenerUnaFamilia() {
		return "Soy mortal y puedo tener una familia";
	}
	
	public String ejercerUnaProfesion() {
		return "Soy mortal y puedo ejercer una profesión";
	}
}