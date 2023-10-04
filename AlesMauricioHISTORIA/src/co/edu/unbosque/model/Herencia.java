package co.edu.unbosque.model;

public class Herencia {
	Héroes Kira = new Héroes(107,321, "verdes", true);
	Héroes Astar = new Héroes(203,210, "azules", true);
	Desterrados Renk = new Desterrados(1501,150, "negros");
	Mortales Ales = new Mortales(18, 174,"violetas", true);
	
	public String herenciaKira() {
		String messege = "Mi nombre es kira y tengo " + Kira.getEdad() + " años y mido " + Kira.getEstatura() + " centimetros entre mis poderes tengo el de " + Kira.detenerEltiempo() + " ademas " + Kira.volar(); 
		try {
			if(Kira.getEstatura() >= 300) {
				throw new HéroesExeption("!Error¡, este vieja kira no es un heroe, los heroes miden 3 metros, este es severo chaparro, mandemelo a quebrar por mentiroso");
			}
		}		
		catch (HéroesExeption e) {
			messege = e.getMessage();
		}
		return messege;
	}
	
	public String herenciaAstar() {
		String messege = "Mi nombre es Astar y tengo " + Astar.getEdad() + " años y mido " + Astar.getEstatura() + " centimetros entre mis poderes tengo el de " + Astar.detenerEltiempo() + " y " + Astar.habitar(); 

		try {
			if(Astar.getEstatura() >= 300) {
				throw new HéroesExeption("!Error¡, este man Astar no es un heroe, los heroes miden 3 metros, este es severo chaparro, mandemelo a quebrar por mentiroso");
			}
		}		
		catch (HéroesExeption e) {
			messege = e.getMessage();
		}
		return messege;
	}
	
	public String herenciaRenk() {
		String messege =  "mi nombre es renk soy un desgraciado de " + Renk.getEdad() + " años y mis ojos son de color " + Renk.getColorDeOjos() + ", y vivo en " + Renk.habitar() + " y " + Renk.arrastrar();

		try {
			if(Renk.getEdad() >= 1500) {
				throw new HéroesExeption("!Error¡,  este man Renk no es un desterrado por que ta muy viejo, esos desgraciados no mas viven mas de 1500 años este tiene mas de eso asi que ni modo");
			}
		}		
		catch (HéroesExeption e) {
			messege = e.getMessage();
		}
		return messege;
	}
	
	public String herenciaAles() {
		String messege = "mi nombre es ales y tengo " + Ales.getEdad() + " años y mido " + Ales.getEstatura() + "cm, y no mas se que " + Ales.tenerfamilia() + " ademas de " + Ales.Profecion(); 

		try {
			if(!Ales.getColorDeOjos().equals("violetas")) {
				throw new HéroesExeption("!Error¡,Ales este no es humano no tiene los ojos violetas toca funarlo por mentiroso");
			}
		}		
		catch (HéroesExeption e) {
			messege = e.getMessage();
		}
		return messege;
	}
	
	
	
	
	
	public Héroes getKira() {
		return Kira;
	}
	public void setKira(Héroes kira) {
		Kira = kira;
	}
	public Héroes getAstar() {
		return Astar;
	}
	public void setAstar(Héroes astar) {
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
