package co.edu.unbosque.model;

public class Samuel extends Mortales {
	
	public String CarreraU;
	public String SegundoNombre;

	public Samuel(int Edad, float Estatura, String ColorOjos, boolean Alma,String CarreraU,String SegundoNombre) {
		super(Edad, Estatura, ColorOjos, Alma);
		this.CarreraU=CarreraU;
		this.SegundoNombre=SegundoNombre;
	}
	
	public String Razonar() {
		return"puede razonar";
	}
	public String Respirar() {
		return"Si dejamos de respirar nos morimos";
	}

	public String getCarreraU() {
		return CarreraU;
	}

	public void setCarreraU(String carreraU) {
		CarreraU = carreraU;
	}

	public String getSegundoNombre() {
		return SegundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		SegundoNombre = segundoNombre;
	}
	

}
