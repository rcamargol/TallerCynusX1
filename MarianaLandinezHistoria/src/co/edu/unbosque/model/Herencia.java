package co.edu.unbosque.model;

public class Herencia {
	
	private Heroe kira,astar ; 
	private Desterrado renk;
	private Mortal mariana;
	
	
	public Herencia() {

		kira= new Heroe();
		astar= new Heroe();
		renk= new Desterrado();
		mariana= new Mortal();
		
		
		
	}
	
	
	public String hacerHerenciaKira() throws HeroeException {
		
		if (kira.estatura!=3) {
			
			throw new HeroeException("Si Kira es una heroina, su altura debe ser de 3 mts");
		}
		
		
		
		return ("Nombre: Kira"+ "\n"+ "Tipo de ser: Heroe "+ " \n"+
		"Altura: " + kira.getEstatura()+ " metros"+ "\n"+  kira.habitarPlaneta()+ "\n"+ kira.sentir()+ "\n"+ "Dones especificos: " + "\n"+ kira.crearFuego()
		+ "\n"+ kira.detenerTiempo()+ "\n"+ kira.volar());
		
		
	}
	public String  hacerHerenciaAstar() throws HeroeException {
		
		if (astar.estatura!=3) {
			
			throw new HeroeException("La altura de astar no coincide con la de los heroes");
		}
		
		return ("Nombre: Astar"+ "\n"+ "Tipo de ser: Heroe "+ "\n"+
				"Altura: " +astar.getEstatura()+ " metros"+ "\n"+  kira.habitarPlaneta()+ "\n"+ astar.sentir()+ "\n"+ "Dones especificos: " + "\n"+ kira.crearFuego()
				+ "\n"+ astar.detenerTiempo()+ "\n"+
				astar.volar());
		
		
	}
	public String hacerHerenciaRenk() throws DesterradoException {
		
		if (!renk.alma.equalsIgnoreCase("Falsa"))
			
			throw new DesterradoException("Si Renk es un desterrado su alma tiene que ser falsa");
		
		
		return ("Nombre: Renk"+ "\n"+ "Tipo de ser: Desterrado "+ "\n"+
				"Edad Maxima: " + renk.edad + " anios"+ "\n"+ "Alma: "+ renk.alma + "\n"+  renk.habitarPlaneta()+ "\n"+ "Dones especificos: " + "\n"+ renk.sentir()
				+"\n"+ renk.arrastrarse());
		
		
	}
	public String hacerHerenciaMariana() throws MortalException {
		
		
		if (!mariana.colorOjos.equalsIgnoreCase("violeta") ) {
			
			throw new MortalException("Si mariana es mortal, sus color de ojos no puede ser otro que violeta");
			
		}

		return ("Nombre: Mariana"+ "\n"+ "Tipo de ser: Mortal "+ "\n"+
				"Color de Ojos: " + mariana.colorOjos + "\n"+ mariana.habitarPlaneta()+ "\n"+ mariana.sentir()+"\n"+  "Dones especificos: " + "\n"+ 
				mariana.ejercerProfesion()+"\n"+ mariana.aprender()+"\n"+ mariana.tenerFamilia() );
		
		
	}
	
	

}
