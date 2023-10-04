package co.edu.unbosque.model;

public class Heroe extends Ser  {

	 public Heroe(String nombre) {
        super(nombre, 1500); 
    }

	
	 public String habitar() {
	        return "Los Héroes  pueden volar y detener el tiempo.";
	    }

	   
	    public String sentir() {
	        return "Los Héroes pueden sentir a sí mismos y a seres de otros mundos.";
	    }
    

  
   
}
