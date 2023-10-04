package co.edu.unbosque.model;

public class Desterrado extends Ser {

	public Desterrado(String nombre) {
        super(nombre, 1500);
    }

   
    public String habitar() {
        return "Los Desterrados  se arrastran de un lugar a otro.";
    }

    
    public String sentir() {
        return "Los Desterrados no sienten a nadie más que a ellos mismos.";
    }
	
}
