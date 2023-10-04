package co.edu.unbosque.model;

public  class Desterrado extends KublaKan {
	
	public Desterrado() {
		
		super.setAlma("Falsa");
		super.setEdad(1500);
	}
	
	public String arrastrarse() {
		return "Son tan miserables que su unico don es arrastrarse en sufrimiento";
		
	}


	
	@Override
		public String habitarPlaneta() {
			// TODO Auto-generated method stub
			return "Los desterrados habitan en el sur del planeta";
			
		
		}
	
	@Override
		public String sentir() {
			// TODO Auto-generated method stub
			return "Los desterrados no pueden sentir a nadie mas que ellos, pobres.";
		}
}
