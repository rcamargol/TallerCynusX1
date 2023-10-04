package co.edu.unbosque.model;

@SuppressWarnings("serial")
public class ColorDeOjosInvalidoException extends Exception {
	
	public ColorDeOjosInvalidoException() {
		super("El color de ojos es inválido");
	}
	
	public ColorDeOjosInvalidoException(String msg) {
		super(msg);
	}
}
