package co.edu.unbosque.model;

public class Mortales extends KublanKan {

	public Mortales(int edad,int estatura,String ColorDeOjos,Boolean alma) {
		super.edad = edad;
		super.estatura = estatura;
		super.colorDeOjos = ColorDeOjos;
		super.alma = alma;
	}
	
	public String adquirirconocimientos() {
		return "soy un genio pa";
	}
	public String tenerfamilia() {
		return "la familia es lo mas importante";
	}
	public String Profecion() {
		return "ponerme a chambear";
	}
	
	@Override
	public String habitar() {
		return "vivimos en el este del pais";
	}

	@Override
	public String sentir() {
		return "nosotros nos podemos sentir entre nosotros";
	}

}
