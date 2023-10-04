package co.edu.unbosque.model;

public abstract class SerCynus {
    protected String nombre;
    protected int edad;

    public SerCynus(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract String habitarPlaneta();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
