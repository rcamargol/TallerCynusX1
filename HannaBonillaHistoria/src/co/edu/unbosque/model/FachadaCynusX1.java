package co.edu.unbosque.model;

import co.edu.unbosque.model.Heroe;
import co.edu.unbosque.model.Mortal;
import co.edu.unbosque.model.Desterrado;

public class FachadaCynusX1 {

    
    public Heroe crearKira() {
    	return new Heroe("Kira", 25, true, true, true, true);
    }

   
    public Heroe crearAstar() {
        return new Heroe("Astar", 30, true, true, true, true);
    }

    
    public Desterrado crearRenk() {
    	return new Desterrado("Renk", 40);
    }


    public Mortal crearMortal(String nombre, int edad) {
        
        return new Mortal(nombre, edad, "color de ojos violeta");
    }
    public static class HeroeNoPuedeVolarException extends Exception {
        public HeroeNoPuedeVolarException(String mensaje) {
            super(mensaje);
        }
    }

    public static class HeroeNoPuedeCrearFuegoException extends Exception {
        public HeroeNoPuedeCrearFuegoException(String mensaje) {
            super(mensaje);
        }
    }

    public static class DesterradoNoPuedeArrastrarseException extends Exception {
        public DesterradoNoPuedeArrastrarseException(String mensaje) {
            super(mensaje);
        }
    }
    public String realizarAccionHeroe(Heroe heroe, String accion) throws HeroeNoPuedeVolarException, HeroeNoPuedeCrearFuegoException {
        if ("volar".equalsIgnoreCase(accion)) {
            if (!heroe.puedeVolar()) {
                throw new HeroeNoPuedeVolarException("El Héroe no puede volar.");
            }
            // Lógica para realizar la acción de volar
            return heroe.getNombre() + " está volando.";
        } else if ("crearFuego".equalsIgnoreCase(accion)) {
            if (!heroe.puedeCrearFuego()) {
                throw new HeroeNoPuedeCrearFuegoException("El Héroe no puede crear fuego.");
            }
            // Lógica para realizar la acción de crear fuego
            return heroe.getNombre() + " está creando fuego.";
        } else {
            return "Acción no válida para un Héroe.";
        }
    }

    public String realizarAccionDesterrado(Desterrado desterrado, String accion) throws DesterradoNoPuedeArrastrarseException {
        if ("arrastrarse".equalsIgnoreCase(accion)) {
            if (!desterrado.seArrastra()) {
                throw new DesterradoNoPuedeArrastrarseException("El Desterrado no puede arrastrarse.");
            }
            // Lógica para realizar la acción de arrastrarse
            return desterrado.getNombre() + " se está arrastrando.";
        } else {
            return "Acción no válida para un Desterrado.";
        }
    }

    
}
    
    



