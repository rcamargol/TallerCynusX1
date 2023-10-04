package co.edu.unbosque.model;

public abstract class Ser {

	 private String nombre;
	    private int edad;

	    public Ser(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public abstract String habitar();
	    public abstract String sentir();
	
	
}	

