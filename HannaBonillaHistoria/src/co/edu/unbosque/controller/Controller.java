package co.edu.unbosque.controller;

import co.edu.unbosque.view.View;
import co.edu.unbosque.model.FachadaCynusX1;
import co.edu.unbosque.model.Heroe;
import co.edu.unbosque.model.Desterrado;
import co.edu.unbosque.model.Mortal;

public class Controller {
    private View view;
    private FachadaCynusX1 fachada;

    public Controller() {
        view = new View();
        fachada = new FachadaCynusX1();
    }

    public void iniciar() {
        view.mostrarMensaje("Bienvenido a Cynus X1");

        // Crear un Héroe llamado Kira
        Heroe kira = fachada.crearKira();
        view.mostrarMensaje("Se ha creado un Héroe llamado Kira");

        // Realizar acciones con Kira
        try {
            realizarAccionHeroe(kira, "volar");
            realizarAccionHeroe(kira, "crearFuego");
        } catch (Exception e) {
            view.mostrarMensaje("Error: " + e.getMessage());
        }

        // Crea un Héroe llamado Astar
        Heroe astar = fachada.crearAstar();
        view.mostrarMensaje("Se ha creado un Héroe llamado Astar");

        // Realiza acciones con Astar
        try {
            realizarAccionHeroe(astar, "detenerTiempo");
        } catch (Exception e) {
            view.mostrarMensaje("Error: " + e.getMessage());
        }

        // Crear un Desterrado llamado Renk
        Desterrado renk = fachada.crearRenk();
        view.mostrarMensaje("Se ha creado un Desterrado llamado Renk");

        // Realizar acciones con Renk
        try {
            realizarAccionDesterrado(renk, "arrastrarse");
        } catch (Exception e) {
            view.mostrarMensaje("Error: " + e.getMessage());
        }

        // Crea un Mortal 
        Mortal mortal = fachada.crearMortal("TuNombre", 35);
        view.mostrarMensaje("Se ha creado un Mortal llamado Hanna");
    }

    public void realizarAccionHeroe(Heroe heroe, String accion) throws Exception {
        if (heroe != null) {
            if ("volar".equalsIgnoreCase(accion)) {
                view.mostrarMensaje(heroe.getNombre() + " está volando.");
            } else if ("crearFuego".equalsIgnoreCase(accion)) {
                view.mostrarMensaje(heroe.getNombre() + " está creando fuego.");
            } else {
                throw new Exception("Acción no válida para un Héroe.");
            }
        }
    }

    public void realizarAccionDesterrado(Desterrado desterrado, String accion) throws Exception {
        if (desterrado != null) {
            if ("arrastrarse".equalsIgnoreCase(accion)) {
                view.mostrarMensaje(desterrado.getNombre() + " se está arrastrando.");
            } else {
                throw new Exception("Acción no válida para un Desterrado.");
            }
        }
    }
}

    

   


