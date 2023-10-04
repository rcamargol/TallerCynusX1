package co.edu.unbosque.model;

public class Heroes extends KublaKlan {
	
	public void NombreHeroes() {	
		String msg="error, por si dado el caso";
		String NombreHeroes = "Kira y Astar";
		
			try {
				if (NombreHeroes!="Kira y Astar") {
					throw new NombreHeroeException("Esos no son los nombres");
				}
			}
			catch(NombreHeroeException e){
				msg = "no funciona";	
			}
		}
	
	public String detenerElTiempo() {
		return "Mi nombre es"+super.nombre+"y detuve el tiempo por primera vez cuando tenia"+super.edad;
	}
	public String volar() {
		return "Mi nombre es"+super.nombre+"y puedo volar desde que tuve"+super.edad;
	}
	
	@Override
	public String vivir() {
		// TODO Auto-generated method stub
		return "Vivir feliz";
	}

	@Override
	public String observar() {
		// TODO Auto-generated method stub
		return "Obseravar y luego actuar";
	}
	}
