package co.edu.unbosque.model;

public class Heroes extends KublaKan {
	
	public Heroes() {
		super.estatura = 5;
	}

	@Override
	public String habitar() {
		return "Habitamos el norte del planeta";
	}

	@Override
	public String sentir() {
		return "No se si llegar a sentir algo ";
	}
	
	
	public String volar() {
		return "Sera que si me tiro vuelo ";
	}
	
	public String crearFuego() {
		return "Mano yo creo que me quemo si me sale fuego por las manos";
	}
	
	public String detenerElTiempo() {
		return "Con el poder de detener el timpo que debo hacer ";
	}

	@Override
	protected boolean validarNumero(double estatura2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean validarString(String colorDeOjos2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean validarAlmaBooleana(String alma2) {
		// TODO Auto-generated method stub
		return false;
	}
}
