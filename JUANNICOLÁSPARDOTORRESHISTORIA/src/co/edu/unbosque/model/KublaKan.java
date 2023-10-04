package co.edu.unbosque.model;

public abstract class KublaKan {
	protected int edad;
	protected double estatura;
	protected String colorDeOjos;
	protected String alma;
	
	public abstract String habitar();
	public abstract String sentir();
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		try {
			if (edad < 0)
				throw new EdadInvalidaException("Edad inválida: El número proveído es negativo");
			else
				this.edad = edad;
		} catch(EdadInvalidaException e) {
			e.printStackTrace();
		}
	}
	
	public double getEstatura() {
		return estatura;
	}
	
	public void setEstatura(double estatura) {
		try {
			if (estatura < 0.0)
				throw new EstaturaInvalidaException("La estatura es inválida: El número proveído es negativo");
				this.estatura = estatura;
		} catch(EstaturaInvalidaException e) {
			e.printStackTrace();
		}
	}
	
	public String getColorDeOjos() {
		return colorDeOjos;
	}
	
	public void setColorDeOjos(String colorDeOjos) {
		try {
			boolean contieneDigitos = false;
			
			for (char c : colorDeOjos.toCharArray()) {
				if (Character.isDigit(c))
					contieneDigitos = true;
			}
			if (colorDeOjos.equals(""))
				throw new ColorDeOjosInvalidoException("Color de ojos inválido: El color de ojos proveído está vacío");
			else if (contieneDigitos)
				throw new ColorDeOjosInvalidoException("Color de ojos inválido: El color de ojos proveído contiene números");
			this.colorDeOjos = colorDeOjos;
		} catch(ColorDeOjosInvalidoException e) {
			e.printStackTrace();
		}
	}
	
	public String getAlma() {
		return alma;
	}
	
	public void setAlma(String alma) {
		try {
			if (!alma.trim().toLowerCase().equals("verdadera") && !alma.trim().toLowerCase().equals("falsa"))
				throw new AlmaInvalidaException("El alma debe ser \"verdadera\" o \"falsa\"");
		} catch(AlmaInvalidaException e) {
			e.printStackTrace();
		}
		this.alma = alma;
	}
}
