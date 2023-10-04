package co.edu.unbosque.model;

public class Excepciones extends Exception {

	public Excepciones(String mensaje) {
		super(mensaje);
	}
	
	public void EdadInvalidaException(String mensaje) throws Exception {
		throw new Exception("La edad no puede ser negativa.");

	}
}