package co.edu.unbosque.model;

public class Fachada {
	
	private Heroe heroe;
	private Mortal mortal;
	private Desterrado desterrado;
	
	public Fachada() {
		heroe= new Heroe();
		mortal= new Mortal();
		desterrado= new Desterrado();
	}
	
	
	
	public String hacerHerencia()throws HeroeException {
		
		if(heroe.estatura!=3) {
			throw new HeroeException("La altura de un heroe debe ser siempre 3 metros");
		}
		
	
		return "Hola yo soy Kira soy una heroina, tengo  "+heroe.edad+" años\n y yo "+heroe.sentir()+", "
				+ "ademas nosotros "+heroe.habitar()+" y una de mis habilidades especiales es"+heroe.volar();
		
	}
	
	public String hacerHerencia2() throws HeroeException{
		
		if(heroe.estatura!=3) {
			throw new HeroeException("La altura de un heroe debe ser siempre 3 metros");
		}
		
		return "Hola soy Astar soy un heroe, una de mis habilidades es"+heroe.crearFuego()+" y "
		+heroe.detenerTiempo()+", ademas tengo "+heroe.edad+" años" ;
	}
	
	public String hacerHerencia3()throws MortalException {
		
		if(!mortal.colorOjos.toLowerCase().equals("violeta")) {
			throw new MortalException("Los ojos de los mortales deben ser siempre violeta");
		}
			
		
		return "Hola soy Juan Diego, soy un mortal, mis ojos son color "+mortal.colorOjos+" ,lo que mas me "
				+ "gusta hacer es"+mortal.adquirirConociminetos()+" y nosotros los mortales"+ mortal.tenerFamilia();
	}
	
	
	
	public String hacerHerencia4()throws  DesterradoException{
		if(desterrado.edad>1500) {
			throw new DesterradoException("Los desterrados no pueden vivir mas de 1500 años");
		}
		
		return "Hola soy Renk, soy un desterrado, las personas de mi especie viven "+desterrado.edad+" años y "
				+ "segun nuestro creador, nuestra alma es"+ desterrado.alma+" ,ademas nuestra especie"+desterrado.habitar();
	}

}



