package co.edu.unbosque.model;

//Clase para representar a los Desterrados
public class Desterrado extends Personaje {
 public Desterrado(String nombre, int edad) {
     super(nombre, edad);
 }

 @Override
 public void realizarAccion() {
     System.out.println("Soy un Desterrado y me arrastro de un lugar a otro.");
 }
}
