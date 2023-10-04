package co.edu.unbosque.model;

public class Heroes extends KublaKan {
	//Constrcutor
	public Heroes(int edad,double estatura,String colorOjos,boolean alma) {
		super(edad,estatura=3,colorOjos,alma);
	}
	//Metodos
	public String volar() {
		return"poder volar";
	}
	public String crearFuego() {
		return"Yo creo fuego";
	}
	public String detenerTiempo() {
		return"Yo detengo el tiempo";
	}
	
	
	@Override
	public String habitar() {
		return"habitan al norte del planeta";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return"se sientes a si mismos y a otros seres de esos mundos";
	}

}
