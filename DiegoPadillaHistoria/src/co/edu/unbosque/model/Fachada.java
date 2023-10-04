package co.edu.unbosque.model;

public class Fachada {

	 public static Ser crearHeroe(String nombre) {
	        return new Heroe(nombre);
	    }

	    public static Ser crearMortal(String nombre, String colorOjos) {
	        return (Ser) new Mortal(nombre, colorOjos);
	    }

	    public static Ser crearDesterrado(String nombre) {
	        return new Desterrado(nombre);
	    }
	
	
	
}
