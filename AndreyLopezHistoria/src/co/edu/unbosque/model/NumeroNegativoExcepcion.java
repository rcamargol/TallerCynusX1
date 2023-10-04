package co.edu.unbosque.model;

public class NumeroNegativoExcepcion extends Exception {
	
	public NumeroNegativoExcepcion() {
		super.printStackTrace();
	}
	
	public NumeroNegativoExcepcion(String msg) {
		super(msg);
	}
}
