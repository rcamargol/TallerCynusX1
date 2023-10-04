package co.edu.unbosque.model;

public abstract class Ser {
	
	private String nombre;
	private String alma;
	
	public Ser(String nombre, String alma) {
		this.nombre = nombre;
		this.alma = alma;
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getAlma() {
		return alma;
	}
//Se esta diciendo que ser es una clase abstracta y que contiene un metodo
//abstracto en este caso es sentir()
	public abstract void sentir();
	

}
