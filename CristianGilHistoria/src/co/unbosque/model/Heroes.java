package co.unbosque.model;

public class Heroes extends Kublakan {


	public Heroes(String nombre, int edad, double estatura, String colorDeOjos, boolean alma) {
	    super(nombre, edad, estatura, colorDeOjos, alma);
	    
	}


    // Implementación del método para volar por los aires
    public String volarPorLosAires() {
        return"Los héroes pueden volar por los aires.";
    }

    // Implementación del método para crear fuego con las manos
    public String crearFuegoConLasManos() {
       return "Los héroes pueden crear fuego con sus manos.";
    }

    // Implementación del método para detener el tiempo
    public String detenerElTiempo() {
        return"Los héroes pueden detener el tiempo.";
    }  

    @Override
    public String sentir() {
        // Implementación de cómo los héroes sienten a sí mismos y a otros seres
        return "Los héroes pueden sentir a sí mismos y a seres de otros mundos.";
    }

    @Override
    public String habitar() {
        // Implementación de la ubicación de los héroes en el norte del planeta
        return "Los héroes habitan en el norte del planeta Cynus X1.";
    }
}
