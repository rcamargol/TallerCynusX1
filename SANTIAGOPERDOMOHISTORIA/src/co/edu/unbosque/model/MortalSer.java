package co.edu.unbosque.model;

public class MortalSer extends Ser {
    private String colorOjos;

    public MortalSer(String nombre, int edad, String colorOjos) {
        super(nombre, edad);
        this.colorOjos = colorOjos;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    @Override
    public String descripcion() {
        return "Soy un mortal con nombre " + getNombre() + ", edad " + getEdad() + " y color de ojos " + getColorOjos();
    }
}
