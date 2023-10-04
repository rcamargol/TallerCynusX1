package co.edu.unbosque.Model;

public class Desterrado extends KublaKan {
    private int vida;

    public Desterrado(String nombre, int edad, String colorOjos, int altura, String alma, int vida) {
        super(nombre, edad, colorOjos, altura, alma);
        this.vida = vida;
    }

    public void habitarPlaneta() {
        System.out.println("Los Desterrados no tienen camello.");
    }

    public void sentir() {
        System.out.println("Los Desterrados solo se sienten a sí mismos.");
    }


    public int getVida() {
        return vida;
    }
}
