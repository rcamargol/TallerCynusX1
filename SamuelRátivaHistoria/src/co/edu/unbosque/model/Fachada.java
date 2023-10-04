package co.edu.unbosque.model;

public class Fachada {
	
	private Kira kira;
	private Astar astar;
	private Renk renk;
	private Samuel samuel;
	
	public String MostrarKira() {
		kira=new Kira( 45,0,"verdes" , true, "cafe", "baston");
		return " Mi nombre es Kira, soy un heroe y tengo "+kira.getEdad()+" años, "+" mido "+kira.getEstatura()+" metros, "+" mis ojos y cabellos son de color "+
				kira.getColorOjos()+" y "+kira.getColorPelo()+" ,mi arma es un "+kira.getArma()+" .Mis habilidades son "+kira.CaminarSobreAgua()+" y "+kira.HablarConAnimales();
	}
	public String MostrarAstar() {
		astar=new Astar(30, 0,"cafes", true,true, "tener vision nocturna");
		return "Mi nombre es Astar, soy un heroe y tengo " +astar.getEdad()+ ", Mido aprox " +astar.getEstatura()+" metros, mis ojos son de color "+astar.getColorOjos()
		+" mi valor de alma es "+astar.isAlma()+" soy muy musculoso y mi super poder es "+astar.getVisionNocturna()+" , "+astar.Correr()+" y "+astar.Cantar();
	}
	public String MostrarRenk() {
		renk=new Renk(0, 30, "rojos", false,"Serpiente", 3);
		return "Mi nombre es Renk, soy un desterrado y tengo "+renk.getEdad()+" años, "+" mido " +renk.getEstatura()+" cm y mis ojos son de color "+renk.getColorOjos()+ ",tengo forma de una "+renk.getForma()
		+ "y tengo "+renk.getNumeroCabezas()+" cabezas, "+" .Soy tan feo que "+renk.Asustar()+" y "+renk.Comer();
	}
	public String MostrarSamuel() {
		samuel=new Samuel(17, 170, "cafes", true,"Ingenieria de sistemas","David");
		return "Mi nombre es Samuel, soy un mortal y tengo " +samuel.getEdad()+" mido aproximadamente "+samuel.getEstatura()+" centimetros, " +" Mis ojos son de color "+samuel.getColorOjos()+ " , tiene alma "+samuel.isAlma()
		+" actualmente estoy estudiando "+samuel.getCarreraU()+" Y mi segundo nombre es "+samuel.getSegundoNombre()+" .Somos tan morales que "+samuel.Respirar()+" y somos el unico animal que"+samuel.Razonar();				
	}
	

}
