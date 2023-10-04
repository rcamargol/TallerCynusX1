package co.edu.unbosque.view;
import co.edu.unbosque.model.*;

public class View {
    public void mostrarInformacion(Ser ser) {
        System.out.println("Nombre: " + ser.getNombre());
        System.out.println("Edad: " + ser.getEdad());
        System.out.println("Descripción: " + ser.descripcion());
        System.out.println();
    }
}
