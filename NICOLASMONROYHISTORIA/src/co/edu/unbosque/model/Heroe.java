package co.edu.unbosque.model;

public class Heroe extends Personaje {
 public Heroe(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void realizarAccion() {
     System.out.println("Soy un Héroe y puedo volar, crear fuego y detener el tiempo.");
 }
}

