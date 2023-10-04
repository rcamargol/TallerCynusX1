package co.edu.unbosque.model;

public class Mortal extends KublaKlan {
	public void ColorOjos() {	
		String msg="error, por si dado el caso";
		String colorDeOjos = "Morado";
		
			try {
				if (colorDeOjos=="verde") {
					throw new ColorOjosException("Ojos incorrectos");
				}
			}
			catch(ColorOjosException e){
				msg = "no funciona";	
			}
		}
	
	
	public String trabajar() {
		return "Mi nombre es"+super.nombre+" y trabajo todos los dias, para hacer avanzar el planeta";
		
	}
	
	public String estudiar() {
		return "Mi nombre es "+super.nombre+" y estudio para encontrar una forma que un mortal tenga poderes";
	}

	@Override
	public String vivir() {
		// TODO Auto-generated method stub
		return "Vivir feliz";
	}

	@Override
	public String observar() {
		// TODO Auto-generated method stub
		return "Obseravar y luego actuar";
	}

	
	
	
}
