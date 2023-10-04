package co.edu.unbosque.model;

public class PlanetaCynusX1 {

	private Heroe heroe;
	private Mortal mortal;
	private Desterrado desterrado;

	public String crearHeroe1()throws ExcepcionHeroe {
	   
		heroe = new Heroe();

		heroe.nombre = "Kira";
		heroe.edad = 22;
		heroe.estatura = 3.1;
		heroe.colorDeOjos = "Verde";
		heroe.alma = "Alma Autentica";
		heroe.habilidadDeCreacionDeFuego = "si";
		heroe.habilidadDeDetenerElTiempo = "si";
		heroe.habilidadDeVuelo = "si";
		
		if (!heroe.crearFuegoConManos()) {
	        throw new ExcepcionHeroe("Este Héroe no puede crear fuego con sus manos.");
	    } 
	
		return "Heroe: "+ "\n" +"Nombre: "+ heroe.getNombre() + "\n" + "Edad: "+  heroe.getEdad() + "\n" +"Estatura: "+ heroe.getEstatura() + "\n" +"Color de ojos: "+ heroe.getColorDeOjos() + "\n"
				+ "Alma: "+ heroe.getAlma() + "\n" +"Habilidad de Creacion de Fuego: "+ heroe.getHabilidadDeCreacionDeFuego() +  "\n" + "Habilidad de detener el tiempo: "+heroe.getHabilidadDeDetenerElTiempo() +  "\n" +"Habilidad de volar: "+heroe.getHabilidadDeVuelo()
				+  "\n" +"METODO 1: "+heroe.crearFuegoConManos()  +  "\n" +"METODO 2: " +heroe.volarPorLosAires();
	}

	public String crearHeroe2()throws ExcepcionHeroe {

		heroe = new Heroe();
		
		heroe.nombre = "Astar";
		heroe.edad = 32;
		heroe.estatura = 3.3;
		heroe.colorDeOjos = "Violeta";
		heroe.alma = "Alma Autentica";
		heroe.habilidadDeCreacionDeFuego = "si";
		heroe.habilidadDeDetenerElTiempo = "si";
		heroe.habilidadDeVuelo = "si";
		
		if (!heroe.crearFuegoConManos()) {
	        throw new ExcepcionHeroe("Este Héroe no puede crear fuego con sus manos.");
	    } 
		
		 return  "Heroe: " + "\n" + "Nombre: "+ heroe.getNombre() + "\n" +"Edad: "+ heroe.getEdad() + "\n" + "Estatura: "+ heroe.getEstatura() + "\n" + "Color de ojos: "+ heroe.getColorDeOjos()
				+ "\n" + "Alma: "+ heroe.getAlma()+ "\n" + "Habilidad de Creacion de Fuego: "+ heroe.getHabilidadDeCreacionDeFuego() +  "\n" +"Habilidad de detener el tiempo: "+ heroe.getHabilidadDeDetenerElTiempo() +  "\n" +"Habilidad de volar: "+heroe.getHabilidadDeVuelo()
				 +  "\n" +"METODO 1: "+heroe.crearFuegoConManos()  +  "\n" +"METODO 2: " +heroe.volarPorLosAires();
		 
		
		 }
		
	
	
		 

	public String crearMortal()throws ExcepcionMortal{

		mortal = new Mortal();
		
		mortal.nombre = "Johann";
		mortal.edad = 18;
		mortal.estatura = 1.74;
		mortal.colorDeOjos = "marrones";
		mortal.alma = "Alma Autentica";
		mortal.conocimiento = "si";
		mortal.familiares = "si";
		mortal.profesion = "Estudiante";
		
		if (mortal.adquirirConocimientos()== "No Adquiere Conocimientos") {
	        throw new ExcepcionMortal("Error no es mortal, No adquiere conocimientos.");
	    } 

		return "Mortal: " +"\n" + "Nombre: "+ mortal.getNombre() + "\n" +"Edad: "+ mortal.getEdad() + "\n" +"Estatura: "+ mortal.getEstatura() +"\n" + "Color de ojos: "+  mortal.getColorDeOjos()
				+"\n" + "Alma: "+ mortal.getAlma()+"\n" +"Conocimiento: "+ mortal.getConocimiento() +"\n" +"Familiares: "+ mortal.getFamiliares() + "\n" +"Profesion: "+ mortal.getProfesion()
		 		+  "\n" +"METODO 1: "+mortal.adquirirConocimientos()  +  "\n" +"METODO 2: " +mortal.formarFamilia();
	}

	

	
	public String crearDesterrado() throws ExcepcionDesterrado {
        
	
		desterrado = new Desterrado();
		desterrado.nombre = "Renk";
		desterrado.edad = 1250;
		desterrado.estatura = 2.5;
		desterrado.colorDeOjos = "morado";
		desterrado.alma = "Alma falsa";
		desterrado.tiempoDeVidaRestante = 250; 
		
		if (desterrado.vivirPor1500Años()== "vive por 1501 años") {
	        throw new ExcepcionDesterrado("Este Desterrado no puede vivir mas de 1500 años.");
	    } 
			    
		return "Desterrado : "  +"\n" + "Nombre: "+ desterrado.getNombre()  +"\n" +"Edad: "+ desterrado.getEdad()  +"\n" + "Estatura: " + desterrado.getEstatura()
		 +"\n" + "Color de ojos: "+ desterrado.getColorDeOjos()  +"\n" + "Alma: "+ desterrado.getAlma()  +"\n" +  "Tiempo de vida restante: "+ desterrado.getTiempoDeVidaRestante()
		 +  "\n" +"METODO 1: "+desterrado.arrastrarse()  +  "\n" +"METODO 2: " + desterrado.vivirPor1500Años();
	    
	
	}

	public Heroe getHeroe() {
		return heroe;
	}

	public void setHeroe(Heroe heroe) {
		this.heroe = heroe;
	}

	public Mortal getMortal() {
		return mortal;
	}

	public void setMortal(Mortal mortal) {
		this.mortal = mortal;
	}

	public Desterrado getDesterrado() {
		return desterrado;
	}

	public void setDesterrado(Desterrado desterrado) {
		this.desterrado = desterrado;
	}

}
