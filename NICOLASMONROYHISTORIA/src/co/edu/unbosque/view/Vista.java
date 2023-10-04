package co.edu.unbosque.view;

import java.util.Scanner;

public class Vista {
 private Scanner scanner;

 public Vista() {
     scanner = new Scanner(System.in);
 }

 public void mostrarMensaje(String mensaje) {
     System.out.println(mensaje);
 }

 public String obtenerEntrada() {
     return scanner.nextLine();
 }

 public void cerrar() {
     scanner.close();
 }
}

