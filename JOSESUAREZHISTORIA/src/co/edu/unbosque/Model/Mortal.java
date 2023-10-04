package co.edu.unbosque.Model;

public class Mortal extends KublaKan {
    private String profesion;
    private String familia;

    public Mortal(String nombre, int edad, String colorOjos, int altura, String alma,
                  String profesion, String familia) {
        super(nombre, edad, colorOjos, altura, alma);
        this.profesion = profesion;
        this.familia = familia;
    }

    public void habitarPlaneta() {
        System.out.println("Los Mortales trabajan por el planeta y tienen una familia.");
    }

    public void sentir() {
        System.out.println("Los Mortales sienten a sí mismos y a  otros mortales.");
    }


    public String getProfesion() {
        return profesion;
    }

    public String getFamilia() {
        return familia;
    }
}
