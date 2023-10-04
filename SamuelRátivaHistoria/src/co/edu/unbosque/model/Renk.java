package co.edu.unbosque.model;

public class Renk extends Desterrados{
	
	public String Forma;
	public int NumeroCabezas;

	public Renk(int Edad, float Estatura, String ColorOjos, boolean Alma,String Forma,int NumeroCabezas) {
		super(Edad, Estatura, ColorOjos, Alma);
		this.Forma=Forma;
		this.NumeroCabezas=NumeroCabezas;
	}
	
	public String Asustar() {
		return"Yo puedo asutar a cualquiera";
	}
	public String Comer() {
		return"Comemos los sobrados de los mortales";
	}

	public String getForma() {
		return Forma;
	}

	public void setForma(String forma) {
		Forma = forma;
	}

	public int getNumeroCabezas() {
		return NumeroCabezas;
	}

	public void setNumeroCabezas(int numeroCabezas) {
		NumeroCabezas = numeroCabezas;
	}
	
}
