package co.edu.unbosque.model;

//Clase para representar a los Mortales
public class Mortal extends Personaje {
 private String profesion;

 public Mortal(String nombre, int edad, String profesion) {
     super(nombre, edad);
     this.profesion = profesion;
 }

 @Override
 public void realizarAccion() {
     System.out.println("Soy un Mortal y puedo adquirir conocimientos y ejercer mi profesión.");
 }

 public String getProfesion() {
     return profesion;
 }

 public void setProfesion(String profesion) {
     this.profesion = profesion;
 }
}

