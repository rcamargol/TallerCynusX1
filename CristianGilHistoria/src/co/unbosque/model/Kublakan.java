package co.unbosque.model;

public abstract class Kublakan {
	   private String nombre;
	    private int edad;
	    private double estatura;
	    private String colorDeOjos;
	    private boolean alma;

	    public Kublakan(String nombre, int edad, double estatura, String colorDeOjos, boolean alma) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.estatura = estatura;
	        this.colorDeOjos = colorDeOjos;
	        this.alma = alma;
	    }
	    
public abstract String  sentir ();


public abstract String habitar();

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public double getEstatura() {
	return estatura;
}

public void setEstatura(double estatura) {
	this.estatura = estatura;
}

public String getColorDeOjos() {
	return colorDeOjos;
}

public void setColorDeOjos(String colorDeOjos) {
	this.colorDeOjos = colorDeOjos;
}

public boolean isAlma() {
	return alma;
}

public void setAlma(boolean alma) {
	this.alma = alma;
}

}

