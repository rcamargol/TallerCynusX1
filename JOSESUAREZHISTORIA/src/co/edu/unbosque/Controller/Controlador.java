package co.edu.unbosque.Controller;

import javax.swing.JOptionPane;
import co.edu.unbosque.Model.Desterrado;
import co.edu.unbosque.Model.Heroe;
import co.edu.unbosque.Model.KublaKan;
import co.edu.unbosque.Model.Mortal;
import co.edu.unbosque.View.Vista;

public class Controlador {
    private Vista vista = new Vista();

    public void iniciarPrograma() {
        Heroe heroe = crearHeroePredeterminado();
        mostrarCaracteristicas(heroe);

        Mortal mortal = crearMortalPredeterminado();
        mostrarCaracteristicas(mortal);

        Desterrado desterrado = crearDesterradoPredeterminado();
        mostrarCaracteristicas(desterrado);
    }

    private Heroe crearHeroePredeterminado() {
        return new Heroe("Kira y Astar", 50, "café", 300, "tienen alma", true, true, true);
    }

    private Mortal crearMortalPredeterminado() {
        return new Mortal("Jose", 21, "violeta", 185, "tiene alma", "programador", "Tiene familia");
    }

    private Desterrado crearDesterradoPredeterminado() {
        return new Desterrado("Renk", 30, "azul", 200, "alma falsa", 1500);
    }

    private void mostrarCaracteristicas(KublaKan personaje) {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Características del personaje:\n");
        mensaje.append("Nombre: " + personaje.getNombre() + "\n");
        mensaje.append("Edad: " + personaje.getEdad() + "\n");
        mensaje.append("Color de ojos: " + personaje.getColorOjos() + "\n");
        mensaje.append("Altura cm: " + personaje.getAltura() + "\n");
        mensaje.append("Alma: " + personaje.getAlma() + "\n");
        personaje.habitarPlaneta();
        personaje.sentir();


        if (personaje instanceof Heroe) {
            Heroe heroe = (Heroe) personaje;
            mensaje.append("Puede volar: " + heroe.puedeVolar() + "\n");
            mensaje.append("Puede crear fuego: " + heroe.puedeCrearFuego() + "\n");
            mensaje.append("Puede detener el tiempo: " + heroe.puedeDetenerTiempo() + "\n");
        } else if (personaje instanceof Mortal) {
            Mortal mortal = (Mortal) personaje;
            mensaje.append("Profesión: " + mortal.getProfesion() + "\n");
            mensaje.append("Familia: " + mortal.getFamilia() + "\n");
        } else if (personaje instanceof Desterrado) {
            Desterrado desterrado = (Desterrado) personaje;
            mensaje.append("Vida: " + desterrado.getVida() + "\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Características del Personaje", JOptionPane.INFORMATION_MESSAGE);
    }
}
