package co.edu.unbosque.model;

import javax.swing.JOptionPane;

public class Fachada {

	private Heroes heroes;
	private Mortales mortales;
	private Desterrados desterrados;
	private Kira kira;
	private Astar astar;
	private Renk renk;
	private David david;
	
	//Heroes
	public String generarHeroes() {
		Heroes h = new Heroes(500, 4, "azules", true);
		String h1=h.crearFuego() +" y "+ h.detenerTiempo();;
		return h1;
	}
	
	public String generarKira() {
		Kira k = new Kira(429, 3, "azules", true);
		String k1 = "Mi nombre es "+k.getNombre()+" y soy una heroina. Tengo "+k.edad+" años, mido "+k.estatura+" metros, tengo los ojos "+k.colorDeOjos+" y como todos los de mi especie "+k.crearFuego()+", "+k.detenerTiempo()+"\n y "+k.volar();
		return k1;
	}
	
	public String generarAstar() {
		Astar a = new Astar(454, 3, "rojos", true);
		String a1 = "Mi nombre es "+a.getNombre()+" y soy un heroe. Tengo "+a.edad+" años, mido "+a.estatura+" metros, tengo los ojos "+a.colorDeOjos+" y como todos los de mi especie "+a.crearFuego()+", "+a.detenerTiempo()+"\n y "+a.volar();
		return a1;
	}
	
	public void AlturaHeroesException() throws AlturaHeroesException{
		Heroes h = new Heroes(500, 4, "azules", true);
		String msj = "Altura no correspondiente al tipo de especie";
		if(h.estatura!=3) {
			JOptionPane.showMessageDialog(null, msj, "Algo salio mal con los heroes", 2);
		}
	}
	
	//Mortales
	public String generarMortales() {
		Mortales m = new Mortales(38, 1.75, "violeta", true);
		String m1 = "La edad promedio de nosotros los mortales es de "+m.edad+" años. Nuestro promedio de estatura es de "+m.estatura+". Nos caracterizamos principalmente por nuestro color "+m.colorDeOjos+" de ojos. \n"+m.adquirirConocimientos()+", "+m.tenerFamilia()+" y "+m.ejercerProfesion();
		return m1;
	}
	
	public String generarDavid() {
		David d = new David(18, 1.71, "marrones", true);
		String d1 = "Mi nombre es "+d.getNombre()+" y soy un mortal. Tengo "+d.edad+" años, mido "+d.estatura+" metros, tengo los ojos "+d.colorDeOjos+" y como todos los de mi especie "+d.adquirirConocimientos()+", "+d.ejercerProfesion()+"\n y "+d.tenerFamilia();
		return d1;
	}
	public void colorOjosException() throws ColorOjosException {
		David d = new David(18, 1.71, "marrones", true);
		String msj2 = "El color de ojos no corresponde al tipo de especie";
		if(d.colorDeOjos!="violeta") {
			JOptionPane.showMessageDialog(null, msj2, "Algo salio mal con David",2);
		}
	}
	
	//Desterrados
	public String generarDesterrados() {
		Desterrados d = new Desterrados(1346, 2.13, "marrones", false);
		String d1 = "Nuestro el pueblo es el mas triste, tengo "+d.edad+" años, y puedo vivir solo hasta los 1500 años. La estatura promedio de nuestra gente es de "+d.estatura+" m. \n Tenemos los ojos "+d.colorDeOjos+" y ademas no tenemos alma. En vez de caminar nosotros "+d.arrastrar();
		return d1;
	}
	
	public String generarRenk() {
		Renk r = new Renk(1256, 1.98, "verdes", false);
		String r1 = "Mi nombre es "+r.getNombre()+" y soy un ser desterrado. Tengo "+r.edad+" años, mido "+r.estatura+" metros, tengo los ojos "+r.colorDeOjos+" y como todos los de mi especie "+r.arrastrar();
		return r1;
	}
	public void almaException() throws AlmaException{
		Renk r = new Renk(1256, 1.98, "verdes", true);
		String msj3 = "El alma de Derk es autentica y esto no coincide con los de su especie";
		if(r.alma !=false) {
			JOptionPane.showMessageDialog(null, msj3, "Algo salio mal con Derk", 2);
		}
	}
	
}
