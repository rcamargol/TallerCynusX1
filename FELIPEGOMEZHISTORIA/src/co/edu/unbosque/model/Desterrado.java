package co.edu.unbosque.model;

public class Desterrado extends KublaKlan{
	public void EdadMaxima() {	
		String msg="error, por si dado el caso";
		int EdadMaxima = 1500;
		
			try {
				if (EdadMaxima>1500) {
					throw new EdadMaximaException("Ya se habría muerto");
				}
			}
			catch(EdadMaximaException e){
				msg = "no funciona";	
			}
		}
	
	public String pensar() {
		return"Mi nobre es "+super.nombre+" y no dejo de pensar el porque estoy vivo ";
	}
	public String sentir() {
		return ("Mi nombre es "+super.nombre+" tengo "+super.edad+" y no siento nada solo a mí mismo.");
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
