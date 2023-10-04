package co.edu.unbosque.model;

public class Mortales extends KublaKan {

	protected String desayuno;
	protected double sueldomensual;
	
	public Mortales(String nombre,int edad, double estatura, String coloro, boolean  alma, String desayuno, double sueldomensual) {
		super(nombre, edad, estatura,coloro, alma);
	this.desayuno = desayuno;
	this.sueldomensual = sueldomensual;
	
	
		if (coloro!= "Morado") {
            throw new Ojos("Los héroes son inmortales y no deben tener vida.");
        }
	}
	
	public  String trabajar() {
		return "toca trabajar para comer";
	}

    public  String viajar() {
		return "puedo conocer todo el planeta gracias a mi trabajo";
    }
     
    


	public String getDesayuno() {
		return desayuno;
	}

	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}

	public double getSueldomensual() {
		return sueldomensual;
	}

	public void setSueldomensual(double sueldomensual) {
		this.sueldomensual = sueldomensual;
	}





	@Override
	public String habitad() {
		// TODO Auto-generated method s tub
		return " habito al este del planeta";
	}

	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return " soy un Mortal";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return " siento la prescencia de otros mortales";
	}


	@Override
	public String habilidad() {
		// TODO Auto-generated method stub
		return " puedo aquirir conocimientos, tener una familia y ejercer una profesion";
	}

}

