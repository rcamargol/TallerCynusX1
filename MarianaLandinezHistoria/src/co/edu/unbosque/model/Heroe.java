package co.edu.unbosque.model;

public class Heroe extends KublaKan{
	
	
	public Heroe() {
		
		super.setEstatura(3);

	}
	
	
	public String volar() {
		return "Solo los heroes podemos volar.";
		
	}
	
	public  String crearFuego() {
		return "Solo nosotros, los heroes, podemos crear fuego.";
	}
	
	public String detenerTiempo() {
		return " Los heroes tenemos la capacidad de detener el tiempo cuando querramos";
		
	}

	


	@Override
	public String habitarPlaneta() {
		// TODO Auto-generated method stub
		return "Los heroes habitan en el norte del planeta" ;
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Los heroes se sienten asi mismos y a seres de otros mundos";
	}
	
	
}
