package co.edu.unbosque.model;

public class Astar extends Heroes{
	
	public boolean Musculoso;
	public String VisionNocturna;

	public Astar(int Edad, float Estatura, String ColorOjos, boolean Alma,boolean Musculoso,String VisionNocturna) {
		super(Edad, Estatura, ColorOjos, Alma);
		this.Musculoso=Musculoso;
		this.VisionNocturna=VisionNocturna;
	}
	
	public String Correr() {
		return"Puedo corre tan rapido como la luz";
	}
	public String Cantar() {
		return"Canto mas lindo que Shakira";
	}

	public boolean isMusculoso() {
		return Musculoso;
	}

	public void setMusculoso(boolean musculoso) {
		Musculoso = musculoso;
	}

	public String getVisionNocturna() {
		return VisionNocturna;
	}

	public void setVisionNocturna(String visionNocturna) {
		VisionNocturna = visionNocturna;
	}
	

}
