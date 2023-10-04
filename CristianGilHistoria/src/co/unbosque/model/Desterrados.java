package co.unbosque.model;

public class Desterrados extends Kublakan {

	public Desterrados(String nombre, int edad, double estatura, String colorDeOjos, boolean alma) {
	    super(nombre, edad, estatura, colorDeOjos, alma);
	    // Lógica específica de la clase Desterrados
	}


    // Método para describir la tristeza de los desterrados
    public String serTriste() {
        return "Los desterrados son los seres más tristes.";
    }

    // Método para describir el rechazo de KublaKan hacia los desterrados
    public String serRechazadosPorKublaKan() {
        return "KublaKan los rechazó porque sus almas son consideradas 'falsas'.";
    }

    @Override
    public String sentir() {
        // Implementación de cómo los desterrados no sienten a nadie más que a ellos mismos
        return "Los desterrados no sienten a nadie más que a ellos mismos.";
    }

    @Override
    public String habitar() {
        // Implementación de la ubicación de los desterrados en el extremo sur del planeta
        return "Los desterrados habitan en el extremo sur del planeta Cynus X1.";
    }

    // Método para describir la longevidad de los desterrados
    public String vivir() {
        return "Todos los desterrados viven exactamente 1500 años.";
    }
}
