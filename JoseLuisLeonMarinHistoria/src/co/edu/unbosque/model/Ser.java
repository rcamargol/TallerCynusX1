package co.edu.unbosque.model;

public class Ser {
	
	private Kira kira;
	private Astar astar;
	private Renk renk;
	private Jose jose;
	
	public Ser() {
		kira = new Kira(20, "rojos", "Falsa");
		astar = new Astar(90, "morados", "Verdadera");
		renk = new Renk(1.50, "negros");
		jose = new Jose(18, 1.80, "Verdadera");
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

	public Jose getJose() {
		return jose;
	}

	public void setJose(Jose jose) {
		this.jose = jose;
	}

	public KublaKan getJose1() {
		return null;
	}
}
