package co.edu.unbosque.model;

public class Fachada {
	private Kira kira;
	private Astar astar;
	private Renk renk;
	private Andres andres;
	
	public String mostrarKira() {
		kira = new Kira(19,0, "verde",true,1000,"katana");
		return "Hola, soy Kira y tengo "+kira.getEdad()+ " años y mido "+kira.getEstatura()
		+" metros de alto, mi color de ojos es "+kira.getColorOjos()+"\n"+" y tengo un alma "
		+kira.isAlma()+", mi fuerza es de "+kira.getFuerza()+" mi arma es una "+kira.getArma()
		+"\n"+" y tengo la capacidad de "+kira.volar()+" y "+kira.superFuerza()+"\n"+" Los heroes "
		+kira.sentir();
	}
	public String mostrarAstar() {
		astar=new Astar(22,0,"azul",true,236,123);
		return"Hola, soy Astar y tengo "+astar.getEdad()+ " años y mido "+astar.getEstatura()
		+" metros de alto, mi color de ojos es "+astar.getColorOjos()+"\n"+" y tengo un alma "
		+astar.isAlma()+", mi velocidad es de "+astar.getVelocidad()+" y mi resistencia es de "+
		astar.getResistencia()+"\n"+" tengo la capacidad de "+astar.viajarTiempo()+". Los heroes "
		+astar.habitar();
	}
	public String mostrarRenk() {
		renk=new Renk(346,2.3,"magenta",false,7,345);
		return"Hola, soy Renk y tengo "+renk.getEdad()+ " años y mido "+renk.getEstatura()
		+" metros de alto, mi color de ojos es "+renk.getColorOjos()+"\n"+" y tengo un alma "
		+renk.isAlma()+", tengo"+renk.getNumeroBrazos()+" brazos y mi nivel de salto es de "
		+renk.getNivelSalto()+"\n"+" y yo "+renk.sangrar()+", como desterrado "
		+renk.habitar();
	}
	public String mostrarAndres() {
		andres=new Andres(24,1.7,null,true,2,false);
		return"Hola, soy Andres y tengo "+andres.getEdad()+ " años y mido "+andres.getEstatura()
		+" metros de alto, mi color de ojos es "+andres.getColorOjos()+"\n"+" y tengo un alma "
		+andres.isAlma()+andres.tenerFamilia()+" tengo "+andres.getNumeroHijos()+" hijos"+". Los mortales habitan en"
		+andres.habitar()+"\n y "+andres.sentir();
	}
}
