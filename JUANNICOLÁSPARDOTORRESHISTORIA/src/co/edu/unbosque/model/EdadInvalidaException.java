package co.edu.unbosque.model;

@SuppressWarnings("serial")
public class EdadInvalidaException extends Exception {

	public EdadInvalidaException() {
		super("La edad es inválida");
	}
	
	public EdadInvalidaException(String msg) {
		super(msg);
	}
}
