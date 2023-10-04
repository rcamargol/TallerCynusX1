package co.edu.unbosque.model;

public abstract class Kublakan {
	
	protected int Edad;
	protected float Estatura;
	protected String ColorOjos;
	protected boolean Alma;
	
	public Kublakan(int Edad,float Estatura,String ColorOjos,boolean Alma) {
		this.Edad=Edad;
		this.Estatura=Estatura;
		this.ColorOjos=ColorOjos;
		this.Alma=Alma;
	}
	
	public abstract String Habitar();
	public abstract String Sentir();

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public float getEstatura() {
		return Estatura;
	}

	public void setEstatura(float estatura) {
		Estatura = estatura;
	}

	public String getColorOjos() {
		return ColorOjos;
	}

	public void setColorOjos(String colorOjos) {
		ColorOjos = colorOjos;
	}

	public boolean isAlma() {
		return Alma;
	}

	public void setAlma(boolean alma) {
		Alma = alma;
	}
	

}
