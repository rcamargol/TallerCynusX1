package co.edu.unbosque.model;

public class CynusX1 {
	// Clase fachada
	private Héroes kira;
	private Héroes astar;
	private Desterrados renk;
	private Mortales camilo;
	
	public CynusX1() {
		kira = new Héroes(42, "Amarillos");
		astar = new Héroes(30, "Grises");
		renk = new Desterrados(1.52, "Cafes");
		camilo = new Mortales(21, 1.70);
		
	}
	
	public String hacerHerencia() {
		String mn = "Nombre del héroe: Kira"+
				"\nEdad: "+kira.getEdad()+" años"+
				"\nEstatura: "+kira.getEstatura()+" metros"+
				"\nColor de ojos: "+kira.getColorDeOjos()+
				"\nDones:"+
				"\nVolar: "+kira.volar()+
				"\nCrear fuego: "+kira.crearFuego()+
				"\nDetener el tiempo: "+kira.detenerElTiempo();
			try {
				if(kira.getEstatura() != 3.0 || kira.getAlma() != true)
				throw new MiExcepcion();
			} catch (MiExcepcion e) {
				e.printStackTrace();
				mn = "No eres un Héroe";
			}
		return mn;
	}
	
	public String hacerHerencia1() {
		String mn = "Nombre del héroe: Astar"+
				"\nEdad: "+astar.getEdad()+" años"+
				"\nEstatura: "+astar.getEstatura()+" metros"+
				"\nColor de ojos: "+astar.getColorDeOjos()+
				"\nDones:"+
				"\nVolar: "+astar.volar()+
				"\nCrear fuego: "+astar.crearFuego()+
				"\nDetener el tiempo: "+astar.detenerElTiempo();
			try {
				if(astar.getEstatura() != 3.0 || astar.getAlma() != true)
				throw new MiExcepcion();
			} catch (MiExcepcion e) {
				e.printStackTrace();
				mn = "No eres un Héroe";
			}
		return mn;
	}
	
	public String hacerHerencia2() {	
		String mn = "Nombre del desterrado: Renk"+
				"\nEdad: "+renk.getEdad()+" años"+
				"\nEstatura: "+renk.getEstatura()+" metros"+
				"\nColor de ojos: "+renk.getColorDeOjos()+
				"\nDones:"+
				"\nArrastrar: "+renk.arrastrar();
			try {
				if(renk.getEdad() != 1500 || renk.getAlma() != false)
				throw new MiExcepcion();
			} catch (MiExcepcion e) {
				e.printStackTrace();
				mn = "No eres un Desterrado";
			}
		return mn;
	}
	
	public String hacerHerencia3() {					
		String mn = "Nombre del mortal: Camilo"+
				"\nEdad: "+camilo.getEdad()+" años"+
				"\nEstatura: "+camilo.getEstatura()+" metros"+
				"\nColor de ojos: "+camilo.getColorDeOjos()+
				"\nDones:"+
				"\nAdquerir conocimiento: "+camilo.adquerirConocimiento()+
				"\nTener familia: "+camilo.tenerFamilia()+
				"\nEjercer profesión: "+camilo.ejercerProfesión();
			try {
				if(camilo.getColorDeOjos() != "Violeta" || camilo.getAlma() != true)
				throw new MiExcepcion();
			} catch (MiExcepcion e) {
				e.printStackTrace();
				mn = "No eres un Mortal";
			}
		return mn;
				
	}
}
