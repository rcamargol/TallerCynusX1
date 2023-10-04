package co.edu.unbosque.model;

public class Desterrado extends KublaKan {
	
	protected int tiempoDeDestierro;
	protected String raza;

	public Desterrado() {

		super.alma = false;
		super.edad = 1500;
	}

	// vivian exactamente 1500 anios pero no todos van a tener 1500, verdad?

	@Override
	public String habitarPlaneta() {

		return "habito en el extremo sur del planeta";
	}

	@Override
	public String sentir() {

		return "El dios KublaKan me dio la capacidad de sentir a mi raza <:";

	}

	public String arrastrar() {

		return "nos arrastramos para sobrevivir";
	}

	public int getTiempoDeDestierro() {
		return tiempoDeDestierro;
	}

	public void setTiempoDeDestierro(int tiempoDeDestierro) {
		this.tiempoDeDestierro = tiempoDeDestierro;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	

}
