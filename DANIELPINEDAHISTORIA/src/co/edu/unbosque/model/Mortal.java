package co.edu.unbosque.model;

public class Mortal extends KublaKlan {
	
	public void ColorOjos() {	
	String msg="error, por si acaso";
	String colorDeOjos = "Morado";
	
		try {
			if (colorDeOjos=="verde") {
				throw new ColorOjosException("Ojos incorrectos");
			}
		}
		catch(ColorOjosException e){
			msg = "no sirve";	
		}
	}
		
	public String adquirirConocimientos() {
		return ("Mi nombre es "+super.nombre+" tengo "+super.edad+" y puedo estudiar.");
	}
	
	public String ejercerProfesion() {
		return ("Mi nombre es "+super.nombre+" tengo "+super.edad+" y puedo trabajar.");
		
	}
	
	@Override
	public String existir() {
		// TODO Auto-generated method stub
		return ("pienso, luego existo");
	}

	@Override
	public String respirar() {
		// TODO Auto-generated method stub
		return ("respiro");
	}

}
