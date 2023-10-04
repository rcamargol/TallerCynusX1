package co.edu.unbosque.model;

public class Heroes extends KublaKan {

	protected String revisar;
	protected double totalrescates;
	
	public Heroes(String nombre,int edad, double estatura, String coloro, boolean  alma, String revisar, double totalrescates) {
		super(nombre, edad, estatura,coloro, alma);
		
	this.revisar = revisar;
	this.totalrescates = totalrescates;
	
	
	
	if (estatura!= 3) {
        throw new Altura("Los héroes son inmortales y no deben tener vida.");
    }
}

	public  String proteger() {
		return "debo usar mis poderes para cuidar el planeta";
	}

    public  String conocer() {
		return "debo conocer a la perfeccion el planeta para poder protegerlo";
    }

	@Override
	public String habitad() {
		// TODO Auto-generated method stub
		return " habito al norte del planeta";
	}

	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return " soy un heroe";
	}

	@Override
	public String sentir() {
		// TODO Auto-generated method stub
		return " sentirme a mi mismo y a seres de otros mundos";
	}


	@Override
	public String habilidad() {
		// TODO Auto-generated method stub
		return " puedo volar por los aires, crear fuego con mis manos y detener el tiempo";
	}

}

