package co.edu.unbosque.model;
public abstract class Desterrados extends KublaKan {
	
	public Desterrados() {
		super.colorDeOjos = colorDeOjos;
		super.estatura = estatura;
		super.alma = "Falsa";
		super.edad = 1500;

	}

	@Override
	public String habitar() {
		// TODO Auto-generated method stub
		return "Vivo en muy muy lejano";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return "Sentir que es eso se come jaja";
	}
	
}

	


