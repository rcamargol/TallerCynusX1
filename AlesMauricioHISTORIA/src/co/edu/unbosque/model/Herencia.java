package co.edu.unbosque.model;

public class Herencia {
	H�roes Kira = new H�roes(107,321, "verdes", true);
	H�roes Astar = new H�roes(203,210, "azules", true);
	Desterrados Renk = new Desterrados(1501,150, "negros");
	Mortales Ales = new Mortales(18, 174,"violetas", true);
	
	public String herenciaKira() {
		String messege = "Mi nombre es kira y tengo " + Kira.getEdad() + " a�os y mido " + Kira.getEstatura() + " centimetros entre mis poderes tengo el de " + Kira.detenerEltiempo() + " ademas " + Kira.volar(); 
		try {
			if(Kira.getEstatura() >= 300) {
				throw new H�roesExeption("!Error�, este vieja kira no es un heroe, los heroes miden 3 metros, este es severo chaparro, mandemelo a quebrar por mentiroso");
			}
		}		
		catch (H�roesExeption e) {
			messege = e.getMessage();
		}
		return messege;
	}
	
	public String herenciaAstar() {
		String messege = "Mi nombre es Astar y tengo " + Astar.getEdad() + " a�os y mido " + Astar.getEstatura() + " centimetros entre mis poderes tengo el de " + Astar.detenerEltiempo() + " y " + Astar.habitar(); 

		try {
			if(Astar.getEstatura() >= 300) {
				throw new H�roesExeption("!Error�, este man Astar no es un heroe, los heroes miden 3 metros, este es severo chaparro, mandemelo a quebrar por mentiroso");
			}
		}		
		catch (H�roesExeption e) {
			messege = e.getMessage();
		}
		return messege;
	}
	
	public String herenciaRenk() {
		String messege =  "mi nombre es renk soy un desgraciado de " + Renk.getEdad() + " a�os y mis ojos son de color " + Renk.getColorDeOjos() + ", y vivo en " + Renk.habitar() + " y " + Renk.arrastrar();

		try {
			if(Renk.getEdad() >= 1500) {
				throw new H�roesExeption("!Error�,  este man Renk no es un desterrado por que ta muy viejo, esos desgraciados no mas viven mas de 1500 a�os este tiene mas de eso asi que ni modo");
			}
		}		
		catch (H�roesExeption e) {
			messege = e.getMessage();
		}
		return messege;
	}
	
	public String herenciaAles() {
		String messege = "mi nombre es ales y tengo " + Ales.getEdad() + " a�os y mido " + Ales.getEstatura() + "cm, y no mas se que " + Ales.tenerfamilia() + " ademas de " + Ales.Profecion(); 

		try {
			if(!Ales.getColorDeOjos().equals("violetas")) {
				throw new H�roesExeption("!Error�,Ales este no es humano no tiene los ojos violetas toca funarlo por mentiroso");
			}
		}		
		catch (H�roesExeption e) {
			messege = e.getMessage();
		}
		return messege;
	}
	
	
	
	
	
	public H�roes getKira() {
		return Kira;
	}
	public void setKira(H�roes kira) {
		Kira = kira;
	}
	public H�roes getAstar() {
		return Astar;
	}
	public void setAstar(H�roes astar) {
		Astar = astar;
	}
	public Desterrados getRenk() {
		return Renk;
	}
	public void setRenk(Desterrados renk) {
		Renk = renk;
	}
	public Mortales getAles() {
		return Ales;
	}
	public void setAles(Mortales ales) {
		Ales = ales;
	}
	
	

}
