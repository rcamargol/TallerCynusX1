package co.edu.unbosque.model;

public class Desterrados extends Kublakan{

	public Desterrados(int Edad, float Estatura, String ColorOjos, boolean Alma) {
		super(Edad=1500, Estatura, ColorOjos, Alma=false);
	}
	public String Arrastraban() {
		return"No tenemos piernaaas";
	}

	@Override
	public String Habitar() {
		return "Habitamos en eñ extremos sur del planeta";
	}

	@Override
	public String Sentir() {
		return "Sentimos solamente a nosotros mismos";
	}

}
