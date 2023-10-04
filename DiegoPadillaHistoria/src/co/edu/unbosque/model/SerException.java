package co.edu.unbosque.model;

public class SerException  extends Exception {

	   public SerException(String message) {
	        super(message);
	    }
	

	public class HeroeException extends SerException {
	    public HeroeException(String message) {
	        super(message);
	    }
	}

	public class MortalException extends SerException {
	    public MortalException(String message) {
	        super(message);
	    }
	}

	public class DesterradoException extends SerException {
	    public DesterradoException(String message) {
	        super(message);
	    }
	
	}
}
