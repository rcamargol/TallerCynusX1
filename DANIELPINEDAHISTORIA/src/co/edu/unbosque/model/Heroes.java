package co.edu.unbosque.model;

public class Heroes extends KublaKlan{
	public void NombreHeroes() {	
		String msg="error, por si acaso";
		String NombreHeroes = "Kira y Astar";
		
			try {
				if (NombreHeroes!="Kira y Astar") {
					throw new NombreHeroeException("Esos no son los nombres");
				}
			}
			catch(NombreHeroeException e){
				msg = "no sirve";	
			}
		}
	
	public String crearfuego() {
		return ("Mi nombre es "+super.nombre+" tengo "+super.edad+" y hago fuego.");
	}
	public String volar(){
		return ("Mi nombre es "+super.nombre+" tengo "+super.edad+" y vuelo.");
	}
	
	

	@Override
	public String existir() {
		// TODO Auto-generated method stub
		return ("pienso, luego existo");
	}

	@Override
	public String respirar() {
		// TODO Auto-generated method stub
		return ("respiro hondo");
	}

}
