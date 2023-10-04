package co.edu.unbosque.model;

public abstract class KublaKan {
	
	protected int edad;
	protected double estatura;
	protected String colorDeOjos;
	protected String alma;
	
	public abstract String habitar();
	public abstract String sentir();
	
	
	public boolean validarNumero(double numero) {
		try {
			if (numero <= -1) {
				throw new NumeroNegativoExcepcion("Numero no valido");
			}
		} catch(NumeroNegativoExcepcion e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean validarString(String dato) {
		try {
			for (char c : dato.toCharArray()) {
				if (Character.isDigit(c) == true) {
					throw new NumeroEnStringExcepcion("La entrada contiene numeros");
				}
			}
			return true;
		} catch(NumeroEnStringExcepcion e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean validarAlmaBooleana(String alma) {
		try {
			if (alma.toUpperCase().equals("VERDADERA") || alma.toUpperCase().trim().equals("FALSA")) {
				return true;
			} else {
				throw new AlmaBooleanaExcepcion("El alma entrada no es booleana");
			}
		} catch(AlmaBooleanaExcepcion e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		if (validarNumero(edad) == true) {
			this.edad = edad;
		}
	}
	
	public double getEstatura() {
		return estatura;
	}
	
	public void setEstatura(double estatura) {
		if (validarNumero(estatura) == true) {
			this.estatura = estatura;
		}
	}
	
	public String getColorDeOjos() {
		return colorDeOjos;
	}
	
	public void setColorDeOjos(String colorDeOjos) {
		if (validarString(colorDeOjos) == true) {
			this.colorDeOjos = colorDeOjos;
		}
	}
	
	public String getAlma() {
		return alma;
	}
	
	public void setAlma(String alma) {
		if (validarString(alma) == true && validarAlmaBooleana(alma)) {
			this.alma = alma;
		}
	}
}
