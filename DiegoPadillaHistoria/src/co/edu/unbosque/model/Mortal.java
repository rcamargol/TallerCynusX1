package co.edu.unbosque.model;

public class Mortal extends Ser  { 

	 private String colorOjos;

	    public Mortal(String nombre, String colorOjos) {
	        super(nombre, 1500); 
	        this.colorOjos = colorOjos;
	    }

	    public String getColorOjos() {
	        return colorOjos;
	    }

	  
	    public String habitar() {
	        return "Los Mortales viven  en el  planeta tierra y pueden tener una familia.";
	    }

	   
	    public String sentir() {
	        return "Los Mortales pueden ser felices .";
	    }
	
}
