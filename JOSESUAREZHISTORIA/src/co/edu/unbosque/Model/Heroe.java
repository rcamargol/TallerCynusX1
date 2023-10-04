package co.edu.unbosque.Model;

public class Heroe extends KublaKan {
    private boolean puedeVolar;
    private boolean puedeCrearFuego;
    private boolean puedeDetenerTiempo;

    public Heroe(String nombre, int edad, String colorOjos,int altura, String alma,
                 boolean puedeVolar, boolean puedeCrearFuego, boolean puedeDetenerTiempo) {
        super(nombre, edad, colorOjos, altura, alma);
        this.puedeVolar = puedeVolar;
        this.puedeCrearFuego = puedeCrearFuego;
        this.puedeDetenerTiempo = puedeDetenerTiempo;
    }
    @Override
    public void habitarPlaneta() {
        System.out.println("Los Héroes protegen el planeta Cynus X1.");
    }
    @Override
    public void sentir() {
        System.out.println("Los Héroes sienten a sí mismos y a seres de otros mundos.");
    }


    public boolean puedeVolar() {
        return puedeVolar;
    }

    public boolean puedeCrearFuego() {
        return puedeCrearFuego;
    }

    public boolean puedeDetenerTiempo() {
        return puedeDetenerTiempo;
    }
}
