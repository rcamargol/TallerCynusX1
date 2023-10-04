package co.edu.unbosque.model;
public class Heroe extends KublaKan {
	
	
	protected String habilidadDeVuelo;
	protected String habilidadDeCreacionDeFuego;
	protected String habilidadDeDetenerElTiempo;
	
	
	
	public Heroe() {
		
	}
	
	public String volarPorLosAires() {
		return "vuela epicamente";
	}
	
	public boolean crearFuegoConManos()  {
		return true;
	}
	
	public void detenerEltiempo() {
		
	}
	

	@Override
	public void sentir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void habitar() {
		// TODO Auto-generated method stub
		
	}

	public String getHabilidadDeVuelo() {
		return habilidadDeVuelo;
	}

	public void setHabilidadDeVuelo(String habilidadDeVuelo) {
		this.habilidadDeVuelo = habilidadDeVuelo;
	}

	public String getHabilidadDeCreacionDeFuego() {
		return habilidadDeCreacionDeFuego;
	}

	public void setHabilidadDeCreacionDeFuego(String habilidadDeCreacionDeFuego) {
		this.habilidadDeCreacionDeFuego = habilidadDeCreacionDeFuego;
	}

	public String getHabilidadDeDetenerElTiempo() {
		return habilidadDeDetenerElTiempo;
	}

	public void setHabilidadDeDetenerElTiempo(String habilidadDeDetenerElTiempo) {
		this.habilidadDeDetenerElTiempo = habilidadDeDetenerElTiempo;
	}


}
