package co.edu.unbosque.model;

public class Mortal extends KublaKan {
	
	
	 public Mortal() {
		 

		 super.setColorOjos("Violeta");
		 
	 }
	 
	 public String aprender() {
		 
	return "Solo los mortales tienen el don de adquirir conocimiento.";	 
	 }
	 
	 public String tenerFamilia() {
		 
		 return "El Mejor don le pertenece a los mortales, solo ellos pueden tener familia.";
	 }
	 
	 public String ejercerProfesion() {
		 
		 return "Solo los mortales pueden ejercer una profesion.";
	 }
	 
	 
	
	@Override
		public String habitarPlaneta() {
			// TODO Auto-generated method stub
			return "Los mortales habitan en el este del planeta";
		}

	@Override
		public String sentir() {
			// TODO Auto-generated method stub
			return "Los mortales sienten la presencia de otros mortales";
		}
}
