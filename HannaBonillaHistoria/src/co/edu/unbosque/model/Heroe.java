package co.edu.unbosque.model;

public class Heroe extends SerCynus {
	   
    private boolean puedeVolar;
    private boolean puedeCrearFuego;
    private boolean puedeDetenerTiempo;
    private boolean puedeSentir;
    
    
    public Heroe(String nombre, int edad, boolean puedeVolar, boolean puedeCrearFuego, boolean puedeDetenerTiempo,
			boolean puedeSentir) {
		super(nombre, edad);
		this.puedeVolar = puedeVolar;
		this.puedeCrearFuego = puedeCrearFuego;
		this.puedeDetenerTiempo = puedeDetenerTiempo;
		this.puedeSentir = puedeSentir;
	}
	
    public boolean puedeVolar() {
        return puedeVolar;
    }
    public boolean puedeCrearFuego() {
        return puedeCrearFuego;
    }
    public boolean puedeDetenerTiempo() {
        return puedeDetenerTiempo;
    }
    public boolean puedeSentir() {
        return puedeSentir;
    }
    @Override
    public String habitarPlaneta() {
        String poderes = (puedeVolar ? "pueden volar, " : "")
                + (puedeCrearFuego ? "pueden crear fuego, " : "")
                + (puedeDetenerTiempo ? "pueden detener el tiempo, " : "")
                + (puedeSentir ? "pueden sentir, " : "")
                + "y miden 3 metros de altura.";
        return "Los Héroes tienen habilidades especiales: " ;
    }
}
