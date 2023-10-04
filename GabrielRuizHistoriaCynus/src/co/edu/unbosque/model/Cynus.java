package co.edu.unbosque.model;

public class Cynus {
	Heroes Kira = new Heroes (20, 3.20 ," azules");
	Heroes Astar = new Heroes (25, 3.28, " cafes" );
	Desterrados Renk = new Desterrados ( 1500,1.55," blancos");
	Mortales Gabriel = new Mortales (18,1.85, "cafes") ;
	
public String Kira() {
	String msg = "hola, soy Kira y tengo "+ Kira.getEdad()+ "años, soy una persona fuerte y admirada y ello es a mi altura " + Kira.getAltura()+ "metros y por mis grandes poderes " + Kira.fuego()+ ""+Kira.crear()+""+ Kira.volar();
	try {
		if(!Kira.getColorOjos().equals("violetas")) {
			throw new DesExeption("Pinchi heroe falso, mandenlo pa la monda, que ese es una decepcion");
		}
	}		
	catch (DesExeption e) {
		msg = e.getMessage();
	}
	return msg;
}
public String Aztar() {
	String msg= "hola, im Astar y tengo "+ Astar.getEdad()+ "años, soy una persona poderos y temida por la gente y ello es a mi altura " + Astar.getAltura()+ "metros y por la ventaja que me dan mis poderes " + Astar.fuego()+ ","+Astar.crear()+" y "+ Astar.volar();
	try {
		if(!Kira.getColorOjos().equals("violetas")) {
			throw new DesExeption("Pinchi heroe falso, mandenlo pa la monda, que ese es una decepcion");
		}
	}		
	catch (DesExeption e) {
		msg = e.getMessage();
	}
	return msg;
	}
public String Renk() {
	String msg= "hola, soy Renk y llevo vividos "+ Renk.getEdad()+ " años, todos se han olvidado de mi y ello es gracias a mi altura " + Renk.getAltura()+ "color de ojos "+ Renk.getColorOjos() + Renk.habitar()+" y que solo me la paso "+ Renk.arrastrar()+"ademas de ello no cuento con un"+ Renk.alma;
	try {
		if(Renk.alma (true)) {
			throw new ObjException("objecion, ese es humano... salvenlo!!!");
		}
	}		
	catch (ObjException e) {
		msg = e.getMessage();
	}
	return msg;
	}
public String Gabriel() {
	String msg= "hola, soy Gabriel y tengo "+ Gabriel.getEdad()+ "años, soy una persona trabajadora y eso se debe a mis capacidades fisicas  " + Gabriel.getAltura()+ "metros, tengo un trabajo muy divertido " + Gabriel.profecion()+ "y tengo una Hermosa Familia "+Gabriel.familia()+"y hay algo comun en mi raza que son los ojos de color"+ Gabriel.ColorOjos();
	try {
		if(Gabriel.getAltura() >=3) {
			throw new imaginException("imaginatelo... podrias ser un heroe");
		}
	}		
	catch (imaginException e) {
		msg = e.getMessage();
	}
	return msg;
	}


	public Heroes getKira() {		
		return Kira;
	}	
		public void setKira(Heroes kira) {
			Kira = kira;
		}
			public Heroes getAstar() {
				return Astar;
			}
			public void setAstar(Heroes astar) {
				Astar = astar;
			}
			public Desterrados getRenk() {
				return Renk;
			}
			public void setRenk(Desterrados renk) {
				Renk = renk;
			}
				public Mortales getGabriel() {
					return Gabriel;
			}
				public void setGabriel(Mortales gabriel) {
					Gabriel = gabriel;
		}

}