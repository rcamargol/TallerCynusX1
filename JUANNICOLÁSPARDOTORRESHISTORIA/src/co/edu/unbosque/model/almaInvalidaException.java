package co.edu.unbosque.model;

@SuppressWarnings("serial")
public class AlmaInvalidaException extends Exception {
	
	public AlmaInvalidaException() {
		super("El alma es inválida");
	}
	
	public AlmaInvalidaException(String msg) {
		super(msg);
	}
}
