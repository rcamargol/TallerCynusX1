package co.edu.unbosque.controller.Controller;
import java.util.Scanner;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.*;
public class Controller {
	 
    Scanner sc = new Scanner (System.in);




    public void Mostrar() {
        Ser heroe = Fachada.crearHeroe("Kira");
        Ser otroHeroe = Fachada.crearHeroe("Astar");
        Ser mortal = Fachada.crearMortal("Alejandro", "cafes");
        Ser desterrado = Fachada.crearDesterrado("Renk");

       String mensaje = "La histria de cynus x1 " +"\n"+
       
       "Héroe 1: " + heroe.getNombre()+"  : " + heroe.habitar() + "\n"+
       "Héroe 2: " + otroHeroe.getNombre() +" : "+ otroHeroe.habitar()+ "\n" +
       "Mortal: " + mortal.getNombre() +" : "+  mortal.habitar()+"\n" + 
       "Desterrado: " + desterrado.getNombre()+" : " +desterrado.habitar();
       
       
        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    public Controller() {
        Mostrar();
    }

    public static void main(String[] args) {
        new Controller();
    }
}
