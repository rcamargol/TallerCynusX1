package co.edu.unbosque.model;

public class LimiteVida extends RuntimeException {
    public LimiteVida(String mensaje) {
        super(mensaje);
    }
}
