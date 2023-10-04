package co.edu.unbosque.model;

public class Mortales extends Kublakan{

	public Mortales(int edad, double estatura) {
		super.edad = edad;
		super.estatura = estatura;
		super.colorDeOjos = "Violeta";
		super.alma = true;
	}
	
	public String adquerirConocimiento() {
		return "Tengo el arma más poderosa, la mente y mis ganas de aprender";
	}
	public String tenerFamilia() {
		return "Orgulloso padre de dos perros";
	}
	public String ejercerProfesión() {
		return "Y lo peor es que hoy es lunes";
	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Vivo al este del planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Siento la presencia de todos los mortales";
	}

}
