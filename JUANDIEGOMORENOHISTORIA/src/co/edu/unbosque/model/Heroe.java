package co.edu.unbosque.model;

public class Heroe extends Kublakan {
	
	public Heroe() {
		super.estatura=3;
		super.edad=400;
	}
		
	
		
    @Override
	public String habitar() {
		return "habitamos al norte del planeta";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String sentir() {
		return "me siento a mi mismo y a todos los seres vivos";
		// TODO Auto-generated method stub
		
	}
	
	public String volar(){
		return"volar";
		}
	
	public String crearFuego() {
		return "yo creo fuego";
	}
	public String detenerTiempo(){
		return "yo detengo el tiempo";
	}
	
	
	
	}
