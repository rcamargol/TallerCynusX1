package co.edu.unbosque.model;

public class Desterrado extends Kublakan {
	
	public Desterrado() {
		super.alma= "falsa";
		super.edad=1500;
		
	}

	@Override
	public String habitar() {
		return "habitamos el extremo sur del planeta";
	}

	@Override
	public String sentir() {
		return "Solo nos sentios a nosotros mismos";
	}
	
	public String arrastrarse() {
		return "nosotros nos arrastramos";
	}
	
	

}
