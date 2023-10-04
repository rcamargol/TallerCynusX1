package co.unbosque.model;

public class Mortales extends Kublakan {

    private String profesion;
    private String familia;

    public Mortales(String nombre, int edad, double estatura, String colorDeOjos, boolean alma, String profesion, String familia) {
        super(nombre, edad, estatura, colorDeOjos, alma);
        this.profesion = profesion;
        this.familia = familia;
    }

    // Método para adquirir conocimientos
    public String adquirirConocimientos() {
        return "Los mortales pueden adquirir conocimientos.";
    }

    // Método para tener una familia
    public String tenerFamilia() {
        return "Los mortales pueden tener una familia.";
    }

    // Implementación del método para ejercer una profesión
    public String ejercerProfesion() {
        return "Los mortales pueden ejercer la profesión de " + this.profesion;
    }

    @Override
    public String sentir() {
        // Implementación de cómo los mortales sienten la presencia de otros mortales
        return "Los mortales pueden sentir la presencia de otros mortales.";
    }

    @Override
    public String habitar() {
        // Implementación de la ubicación de los mortales en el este del planeta
        return "Los mortales habitan en el este del planeta Cynus X1.";
    }

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

    
}
