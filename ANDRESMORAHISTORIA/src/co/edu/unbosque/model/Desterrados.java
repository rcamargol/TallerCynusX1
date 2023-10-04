package co.edu.unbosque.model;

public class Desterrados extends KublaKan {
	
	protected boolean mendigar;
	protected double dinerodeldia;

	
	
	public Desterrados(String nombre,int edad, double estatura, String coloro, boolean  alma,boolean mendigar,double dinerodeldia) {
		super(nombre, edad, estatura,coloro, alma);
	
		if (edad> 1500) {
            throw new LimiteVida("los desterrados no pueden vivir mas de 1500 años");
        }
	
	}
	
	
	public boolean isMendigar() {
		return mendigar;
	}


	public void setMendigar(boolean mendigar) {
		this.mendigar = mendigar;
	}


	public double getDinerodeldia() {
		return dinerodeldia;
	}


	public void setDinerodeldia(double dinerodeldia) {
		this.dinerodeldia = dinerodeldia;
	}


	public  String oler() {
		return "todo en el suelo huele muy mal";
	}

    public  String huir() {
		return "debo huir de los demas para estar a salvo";
	}


	@Override
	public String habitad() {
		// TODO Auto-generated method stub
		return " habito al extremo sur del planeta";
	}

	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return " soy un desterrado";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return " solo me siento a mi mismo";
	}


	@Override
	public String habilidad() {
		// TODO Auto-generated method stub
		return " puedo arrastrame de un lugar a otro";
	}

}
