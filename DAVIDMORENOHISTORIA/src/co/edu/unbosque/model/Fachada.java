package co.edu.unbosque.model;

public class Fachada {
	
	private Heroe hero;
	private Mortal mort;
	private Desterrado dest;
	
	public void Herencia () {
		
		hero = new Heroe (18, "3 mts", "Negro", "Sí tengo alma", "Kira");
		hero = new Heroe (35, "3 mts", "Cafe", "Sí tengo alma", "Astar");
		mort = new Mortal (30, "1.8 mts", "Violeta", "Si tengo alma", "Santiago");
		dest = new Desterrado (1500, "2.5 mts", "Azul", "No tengo alma", "Renk");		
	}	
}
