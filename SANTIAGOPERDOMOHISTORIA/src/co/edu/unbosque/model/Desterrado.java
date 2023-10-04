package co.edu.unbosque.model;

public class Desterrado extends Ser {
    public Desterrado(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String descripcion() {
        return "Soy un desterrado con nombre " + getNombre() + " y edad " + getEdad();
    }
}
