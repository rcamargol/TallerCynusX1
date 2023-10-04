package co.edu.unbosque.model;

public class Herencia {
	private Heroe h1, h2;
	private Mortal m;
	private Desterrado d;

	public Herencia() {
		h1 = new Heroe("Kira", 2000, 2, "azul", true);
		h2 = new Heroe("Astar", 1200, 3, "Negro", true);
		m = new Mortal("Juan Pablo", 17, 1.68, "Violeta", true);
		d = new Desterrado("Renk", 1400, 2.0, "Cafe", false);
	}

	public String realizarHerenciaHeroe1() {
		String salida = "Hola, mi nombre es " + h1.getNombre() + ", tengo " + h1.getEdad()
		+ " años, mis ojos son de color " + h1.getColorOjos() + " y tengo un alma autentica."+"\n"+h1.habitar()+"\n"+h1.sentir()+"\n"+h1.volar()+", "+h1.crearFuego()+", "+h1.detenerElTiempo();
try {
	if (h1.getEstatura()!=3 || h1.isAlmaAutentica() != true) {
		throw new MiExcepcion("No coincide con la descripcion de heroe");
	}
} catch (MiExcepcion e) {
	e.printStackTrace();
	salida = "Momento, este no es un heroe real!";
	}
return salida;
	}

	public String realizarHerenciaHeroe2() {
		String salida = "Hola, mi nombre es " + h2.getNombre() + ", tengo " + h2.getEdad()
		+ " años, mis ojos son de color " + h2.getColorOjos() + " y tengo un alma autentica."+"\n"+h2.habitar()+"\n"+h2.sentir()+"\n"+h2.volar()+", "+h2.crearFuego()+", "+h2.detenerElTiempo();
try {
	if (h2.getEstatura()!=3 || h2.isAlmaAutentica() != true) {
		throw new MiExcepcion("No coincide con la descripcion de heroe");
	}
} catch (MiExcepcion e) {
	e.printStackTrace();
	salida = "Momento, este no es un heroe real!";
}

return salida;
	}

	public String realizarHerenciaMortal() {
		String salida = "Hola, mi nombre es " + m.getNombre() + ", tengo " + m.getEdad()
				+ " años, mis ojos son de color " + m.getColorOjos() + " y tengo un alma autentica"+"\n"+m.habitar()+"\n"+m.sentir()+"\n"+m.adquirirConocimientos()+"\n"+m.ejercerProfesion();
		try {
			if (!m.getColorOjos().equalsIgnoreCase("Violeta") || m.isAlmaAutentica() != true) {
				throw new MiExcepcion("No coincide con la descripcion de mortal");
			}
		} catch (MiExcepcion e) {
			e.printStackTrace();
			salida = "Momento, este no es un mortal!";
		}

		return salida;
	}
	public String realizarHerenciaDesterrado() {
		String salida = "Hola, mi nombre es " + d.getNombre() + ", tengo " + d.getEdad()
		+ " años, mis ojos son de color " + d.getColorOjos() + " y tengo un alma falsa"+"\n"+d.habitar()+"\n"+d.sentir()+"\n"+d.arrastrarse();
try {
	if (d.getEdad()>1500 || d.isAlmaAutentica() != false) {
		throw new MiExcepcion("No coincide con la descripcion de desterrado");
	}
} catch (MiExcepcion e) {
	e.printStackTrace();
	salida = "Momento, este no es un desterrado!";
}

return salida;
	}
}
