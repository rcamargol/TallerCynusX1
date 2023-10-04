package co.edu.unbosque.model;

public class MortalException extends Exception {
	public MortalException(String mensaje) {
		super("El mortal ha muerto.");
	}
}
