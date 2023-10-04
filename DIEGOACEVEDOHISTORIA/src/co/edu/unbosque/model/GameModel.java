package co.edu.unbosque.model;

public class GameModel {
	private Heroe kira;
	private Heroe astar;
	private Desterrado renk;
	private Mortal alejandro;
	
	public void JuegoModel() {
		//Crear las instancias de los seres
		kira = new Heroe("Kira", "Alma de Héroe", 300, "Norte");
		astar = new Heroe("Astar", "Alma de Héroe", 300, "Norte");
		renk = new Desterrado("Renk", "Alma de Desterrado","Alsur" ,1500 , false);
		alejandro = new Mortal("Alejandro", "Alma de Mortal", "Violeta", "Este");
	}
	//Metodos para obtener información de cada uno de los personajes
	
	public Heroe getKira() {
		return kira;
	}
	
	public Heroe getAstar() {
		return astar;
	}
	public Desterrado getRenk() {
		return renk;
	}
	public Mortal getAlejandro() {
		return alejandro;
		
	}

}
