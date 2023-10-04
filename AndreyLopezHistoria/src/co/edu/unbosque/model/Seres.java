package co.edu.unbosque.model;

public class Seres {
	
	private Kira kira;
	private Astar astar;
	private Renk renk;
	private Andrey andrey;
	
	public Seres() {
		kira = new Kira(20, "rojos", "Falsa");
		astar = new Astar(90, "morados", "Verdadera");
		renk = new Renk(1.50, "negros");
		andrey = new Andrey(18, 1.80, "Verdadera");
	}

	public Kira getKira() {
		return kira;
	}

	public void setKira(Kira kira) {
		this.kira = kira;
	}

	public Astar getAstar() {
		return astar;
	}

	public void setAstar(Astar astar) {
		this.astar = astar;
	}

	public Renk getRenk() {
		return renk;
	}

	public void setRenk(Renk renk) {
		this.renk = renk;
	}

	public Andrey getAndrey() {
		return andrey;
	}

	public void setAndrey(Andrey andrey) {
		this.andrey = andrey;
	}
}
