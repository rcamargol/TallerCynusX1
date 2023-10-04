package co.edu.unbosque.model;

public class Seres {
	
	private Kiara kiara;
	private Astar astar;
	private Renk renk;
	private LuisLeguizamon luisleguizamon;
	
	public Seres() {
		kiara = new Kiara(30,"verde", "verdadero");
		astar = new Astar(50, "Azul", "Falso");
		renk = new Renk(50,1.50, "negros");
		luisleguizamon = new LuisLeguizamon(18,1.85,"verdadero");
		
	}

	public Kiara getKira() {
		return kiara;
	}

	public void setKira(Kiara kiara) {
		this.kiara = kiara;
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

	public Kiara getKiara() {
		return kiara;
	}

	public void setKiara(Kiara kiara) {
		this.kiara = kiara;
	}

	public LuisLeguizamon getLuisleguizamon() {
		return luisleguizamon;
	}

	public void setLuisleguizamon(LuisLeguizamon luisleguizamon) {
		this.luisleguizamon = luisleguizamon;
	}


	}

