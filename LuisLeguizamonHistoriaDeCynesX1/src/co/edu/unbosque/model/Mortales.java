package co.edu.unbosque.model;

public class Mortales extends KublaKan {
	 Mortales() {
		super.colorDeOjos = "Azul";
	}

	@Override
	public String habitar() {
		return "No se que es habitar, sera que es donde vivo ";
	}

	@Override
	public String sentir() {
		return "Desde el suceso aquel deje de sentir ";
	}
	
 public void setEdad(int edad) {
		// TODO Auto-generated method stub
		
 }

public void setEstatura(double estatura) {
	// TODO Auto-generated method stub
	
}

public void setAlma(String alma) {
	// TODO Auto-generated method stub
	
}

@Override
protected boolean validarNumero(double estatura2) {
	// TODO Auto-generated method stub
	return false;
}

@Override
protected boolean validarString(String colorDeOjos2) {
	// TODO Auto-generated method stub
	return false;
}

@Override
protected boolean validarAlmaBooleana(String alma2) {
	// TODO Auto-generated method stub
	return false;
}
}
