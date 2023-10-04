package co.edu.unbosque.model;

public class Desterrado extends KublaKan {
	
	
	protected int tiempoDeVidaRestante;
	
	
	
	public Desterrado() {	
		
	}

	public String arrastrarse() {	
		return "Se arrastra epicamente";
	}
	
	public String vivirPor1500Años() {
		return "vive por 1500 años";
	}
	
	public void sentirseASiMismo() {
		
	}	

	public int getTiempoDeVidaRestante() {
		return tiempoDeVidaRestante;
	}

	public void setTiempoDeVidaRestante(int tiempoDeVidaRestante) {
		this.tiempoDeVidaRestante = tiempoDeVidaRestante;
	}


	@Override
	public void sentir() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void habitar() {
		// TODO Auto-generated method stub
		
	}

}
