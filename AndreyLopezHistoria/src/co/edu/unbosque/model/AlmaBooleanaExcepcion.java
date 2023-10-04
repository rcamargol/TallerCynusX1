package co.edu.unbosque.model;

public class AlmaBooleanaExcepcion extends Exception {

	public AlmaBooleanaExcepcion() {
		super.printStackTrace();
	}
	
	public AlmaBooleanaExcepcion(String msg) {
		super(msg);
	}
}
