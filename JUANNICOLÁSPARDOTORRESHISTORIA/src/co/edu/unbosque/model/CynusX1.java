package co.edu.unbosque.model;

public class CynusX1 {
	
	private Heroe kira, astar;
	private Desterrado renk;
	private Mortal nicolas;
	
	public CynusX1() {
		kira = new Heroe();
		astar = new Heroe();
		renk = new Desterrado();
		nicolas = new Mortal();
	}
	
	public void agregarInformacionKira(int edad, String colorDeOjos, String alma) {
		kira.setEdad(edad);
		kira.setColorDeOjos(colorDeOjos);
		kira.setAlma(alma);
	}
	
	public String obtenerInformacionKira() {
		
		String informacionKira = "Soy Kira.\n";
		
		// Atributos
		informacionKira += "Tengo " + kira.getEdad() + " años.\n";
		informacionKira += "Mi estatura es de " + kira.getEstatura() + " metros.\n";
		informacionKira += "Mi color de ojos es " + kira.getColorDeOjos() + "\n";
		informacionKira += "Mi alma es " + kira.getAlma() + "\n\n";
		
		// Métodos
		informacionKira += kira.habitar() + "\n";
		informacionKira += kira.sentir() + "\n";
		informacionKira += kira.volar() + "\n";
		informacionKira += kira.crearFuego() + "\n";
		informacionKira += kira.detenerElTiempo();
		
		return informacionKira;
	}
	
	public void agregarInformacionAstar(int edad, String colorDeOjos, String alma) {
		astar.setEdad(edad);
		astar.setColorDeOjos(colorDeOjos);
		astar.setAlma(alma);
	}
	
	public String obtenerInformacionAstar() {
		
		String informacionAstar = "Soy Astar.\n";
		
		// Atributos
		informacionAstar += "Tengo " + astar.getEdad() + " años.\n";
		informacionAstar += "Mi estatura es de " + astar.getEstatura() + " metros.\n";
		informacionAstar += "Mi color de ojos es " + astar.getColorDeOjos() + "\n";
		informacionAstar += "Mi alma es " + astar.getAlma() + "\n\n";
		
		// Métodos
		informacionAstar += astar.habitar() + "\n";
		informacionAstar += astar.sentir() + "\n";
		informacionAstar += astar.volar() + "\n";
		informacionAstar += astar.crearFuego() + "\n";
		informacionAstar += astar.detenerElTiempo();
		
		return informacionAstar;
	}
	
	public void agregarInformacionRenk(double estatura, String colorDeOjos) {
		renk.setEstatura(estatura);
		renk.setColorDeOjos(colorDeOjos);
	}
	
	public String obtenerInformacionRenk() {
		
		String informacionRenk = "Soy Renk.\n";
		
		// Atributos
		informacionRenk += "Tengo " + renk.getEdad() + " años.\n";
		informacionRenk += "Mi estatura es de " + renk.getEstatura() + " metros.\n";
		informacionRenk += "Mi color de ojos es " + renk.getColorDeOjos() + "\n";
		informacionRenk += "Mi alma es " + renk.getAlma() + "\n\n";
		
		// Métodos
		informacionRenk += renk.habitar() + "\n";
		informacionRenk += renk.sentir() + "\n";
		informacionRenk += renk.arrastrar();
		
		return informacionRenk;
	}
	
	public void agregarInformacionNicolas() {
		nicolas.setEdad(18);
		nicolas.setEstatura(1.72);
		nicolas.setAlma("Verdadera");
	}
	
	public String obtenerInformacionNicolas() {
		
		String informacionNicolas = "Soy Nicolas.\n";
		
		// Atributos
		informacionNicolas += "Tengo " + nicolas.getEdad() + " años.\n";
		informacionNicolas += "Mi estatura es de " + nicolas.getEstatura() + " metros.\n";
		informacionNicolas += "Mi color de ojos es " + nicolas.getColorDeOjos() + "\n";
		informacionNicolas += "Mi alma es " + nicolas.getAlma() + "\n\n";
		
		// Métodos
		informacionNicolas += nicolas.habitar() + "\n";
		informacionNicolas += nicolas.sentir() + "\n";
		informacionNicolas += nicolas.adquirirConocimientos() + "\n";
		informacionNicolas += nicolas.tenerUnaFamilia() + "\n";
		informacionNicolas += nicolas.ejercerUnaProfesion() + "\n";
		
		return informacionNicolas;
	}

	public Heroe getKira() {
		return kira;
	}

	public void setKira(Heroe kira) {
		this.kira = kira;
	}

	public Heroe getAstar() {
		return astar;
	}

	public void setAstar(Heroe astar) {
		this.astar = astar;
	}

	public Desterrado getRenk() {
		return renk;
	}

	public void setRenk(Desterrado renk) {
		this.renk = renk;
	}

	public Mortal getNicolas() {
		return nicolas;
	}

	public void setNicolas(Mortal nicolas) {
		this.nicolas = nicolas;
	}
}
