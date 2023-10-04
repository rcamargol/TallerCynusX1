package co.edu.unbosque.model;

public class Mortal extends KublaKan {
	
	public Mortal() {
		super.colorDeOjos = "Violeta";
	}

	@Override
	public String habitar() {
		return "habito en el este de este planeta";
	}

	@Override
	public String sentir() {
		return "puedo sentir la presencia de otros mortales";
	}
	
	
	public String adquirirConocimientos() {
		return "puedo adquirir conocimientos";
	}
	
	public String tenerUnaFamilia() {
		return "puedo tener una familia";
	}
	
	public String ejercerUnaProfesion() {
		return "puedo ejercer una profesión";
	}
}
