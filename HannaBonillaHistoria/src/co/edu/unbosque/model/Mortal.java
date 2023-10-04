package co.edu.unbosque.model;

public class Mortal extends SerCynus {
    // Atributos 
    private String colorOjos;
    private String ubicacionHabitat;
    private boolean puedeSentirPresencia;

    // Constructor 
    public Mortal(String nombre, int edad, String colorOjos) {
        super(nombre, edad); 
        this.ubicacionHabitat = "este del planeta"; 
        this.puedeSentirPresencia = true; 
    }

    // Implementación del método abstracto 
    @Override
    public String habitarPlaneta() {
        return "Los Mortales trabajaban por el planeta  ";
    }

    
    public String getColorOjos() {
        return colorOjos;
    }

    
    public String getUbicacionHabitat() {
        return ubicacionHabitat;
    }

    
    public boolean puedeSentirPresencia() {
        return puedeSentirPresencia;
    }

    // Métodos 
    public String adquirirConocimientos() {
    	return getNombre() + " ha adquirido conocimientos.";
    }

    public String formarFamilia() {
    	return getNombre() + " ha formado una familia.";
    }

    public String ejercerProfesion() {
    	return getNombre() + " está ejerciendo una profesión.";
    }

}
