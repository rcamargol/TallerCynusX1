package co.edu.unbosque.controller;


import co.edu.unbosque.model.CaracteristicaInvalidaException;
import co.edu.unbosque.view.Vista;
import co.edu.unbosque.model.Heroe;
import co.edu.unbosque.model.Mortal;

import co.edu.unbosque.model.Desterrado;

public class Controlador {
 private Vista vista;

 public Controlador() {
     vista = new Vista();
 }

 public void ejecutar() {
     try {
         vista.mostrarMensaje("¡Bienvenido a la historia de Cynus X1!");

         int edadInvalida = 5;
         if (edadInvalida < 0) {
             throw new CaracteristicaInvalidaException("La edad no puede ser negativa.");
         }

         Heroe heroe1 = new Heroe("Kira", 30);
         Heroe heroe2 = new Heroe("Astar", 28);
         Mortal mortal = new Mortal("TuNombre", 25, "Programador");
         Desterrado desterrado = new Desterrado("Renk", 1500);

         vista.mostrarMensaje("Acciones de los personajes:");
         heroe1.realizarAccion();
         heroe2.realizarAccion();
         mortal.realizarAccion();
         desterrado.realizarAccion();
     } catch (CaracteristicaInvalidaException e) {
         vista.mostrarMensaje("Se produjo un error: " + e.getMessage());
     } finally {
         vista.cerrar();
     }
 }

 public static void main(String[] args) {
     Controlador controlador = new Controlador();
     controlador.ejecutar();
 }
}

