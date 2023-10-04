package co.edu.unbosque.model;

public class HeroeSer extends Ser {
    public HeroeSer(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String descripcion() {
        return "Soy un héroe con nombre " + getNombre() + " y edad " + getEdad();
    }
}
