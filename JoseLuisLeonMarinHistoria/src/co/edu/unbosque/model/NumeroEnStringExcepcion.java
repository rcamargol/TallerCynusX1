package co.edu.unbosque.model;

public class NumeroEnStringExcepcion extends Exception {

	public NumeroEnStringExcepcion() {
		super.printStackTrace();
	}
	
	public NumeroEnStringExcepcion(String msg) {
		super(msg);
	}
}
