package co.edu.unbosque.model;

public class Desterrado extends KublaKlan {
	public void EdadMaxima() {	
		String msg="error, por si acaso";
		int EdadMaxima = 1500;
		
			try {
				if (EdadMaxima>1500) {
					throw new EdadMaximaException("Ya se habría muerto");
				}
			}
			catch(EdadMaximaException e){
				msg = "no sirve";	
			}
		}
	
	public String arrastrarse(){
		return ("Mi nombre es "+super.nombre+" tengo "+super.edad+" y me arrastro mucho.");
	}
	public String sentir() {
		return ("Mi nombre es "+super.nombre+" tengo "+super.edad+" y no siento nada solo a mí mismo.");
	}

	@Override
	public String existir() {
		// TODO Auto-generated method stub
		return ("pienso, luego existo");
	}

	@Override
	public String respirar() {
		// TODO Auto-generated method stub
		return ("respiro");
	}
	public String getAlma() {
		return alma;
	}
	public void setAlma(String alma) {
		this.alma = alma;
	}
	
}
