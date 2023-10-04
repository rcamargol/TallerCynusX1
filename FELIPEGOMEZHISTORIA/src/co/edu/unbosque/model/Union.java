package co.edu.unbosque.model;

import java.util.Set;

public class Union {
	private Heroes heroes;
	private Mortal mortal;
	private Desterrado desterrado; 

	public String hacerUnion() {
		heroes = new Heroes();
		heroes.setNombre("Kira y Astar");
		heroes.setEdad(20);
		heroes.setAlma("pura");;
		heroes.setEstatura(3);
		heroes.setColorDeOjos("miel");
		
		mortal = new Mortal();
		mortal.setNombre("Felipe");
		mortal.setEdad(18);
		mortal.setColorDeOjos("cafe");
		mortal.setAlma("honesta");
		mortal.setEstatura(2);
		
		desterrado = new Desterrado();
		desterrado.setNombre("Renk");
		desterrado.setEdad(1111);
		desterrado.setColorDeOjos("azul");
		desterrado.setAlma("oscura");
		desterrado.setEstatura(2);
		
		return "En este mundo habitan "+heroes.getNombre()+" que son dos heroes los cuales tiene"+heroes.getEdad()+" años y tienen un alma \n "+heroes.getAlma()+
				" y tambien vive un mortal que se llams"+mortal.getNombre()+" que tiene unos hojos "+mortal.getColorDeOjos()+" y el estudia y trbaja para ahcer avanzar al planeta, \n"
				+desterrado.getNombre()+" es un desterrado de este planeta, tiene una estatura de "+desterrado.getEstatura()+" y se arrastran y solo se sienten a ellos mismos";
}
}