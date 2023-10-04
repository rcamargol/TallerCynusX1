package co.edu.unbosque.model;

@SuppressWarnings("serial")
public class EstaturaInvalidaException extends Exception {

	public EstaturaInvalidaException() {
		super("La estatura es inválida");
	}
	
	public EstaturaInvalidaException(String msg) {
		super(msg);
	}
	
}
