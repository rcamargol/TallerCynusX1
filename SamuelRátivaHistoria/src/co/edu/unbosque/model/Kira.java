package co.edu.unbosque.model;

public class Kira extends Heroes {
	
	public String ColorPelo;
	public String Arma; 

	public Kira(int Edad, float Estatura, String ColorOjos, boolean Alma,String ColorPelo,String Arma) {
		super(Edad, Estatura, ColorOjos, Alma);
		this.ColorPelo=ColorPelo;
		this.Arma=Arma;
	}
	
	public String CaminarSobreAgua() {
		return "Poder Caminar sobre el agua";
	}
	public String HablarConAnimales() {
		return"Hablar con los animales";
	}

	public String getColorPelo() {
		return ColorPelo;
	}

	public void setColorPelo(String colorPelo) {
		ColorPelo = colorPelo;
	}

	public String getArma() {
		return Arma;
	}

	public void setArma(String arma) {
		Arma = arma;
	}
	
	
	

}
