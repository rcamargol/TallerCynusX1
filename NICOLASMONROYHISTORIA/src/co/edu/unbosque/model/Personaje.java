package co.edu.unbosque.model;

public abstract class Personaje {
 private String nombre;
 private int edad;

 public Personaje(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }

 public abstract void realizarAccion();

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

