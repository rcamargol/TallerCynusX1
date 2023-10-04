package co.edu.unbosque.model;

public class Herencia {

	private Desterrado desterrados;
	private Heroe heroes;
	private Mortal mortales;

	public Herencia() {

	}

	public String hacerHeroe1() throws HeroeException {

		heroes = new Heroe();

		heroes.edad = 30;

		if (heroes.altura < 3) {

			throw new HeroeException("La altura no coincide con la de un heroe, no eres un heroe");
		}

		return "Hola soy Kira una heroina de CYNUSX1," + "\n" + "tengo " + heroes.edad + " anios de edad \nmido "
				+ heroes.altura + "mts " + "\npuedo hacer cosas peculiares pues: ";

	}

	public String hacerHeroe21() throws HeroeException {

		heroes = new Heroe();

		heroes.edad = 78;

		if (heroes.altura < 3) {

			throw new HeroeException("La altura de Astar no coincide con la de un heroe de su clase, no es un heroe");
		}

		return "Hola soy Astar una heroe de CYNUSX1," + "\n" + "tengo " + heroes.edad + " anios de edad \nmido "
				+ heroes.altura + "mts " + "\npuedo hacer cosas peculiares pues: ";

	}

	public String hacerDesterrado() throws DesterradoException {

		desterrados = new Desterrado();

		String siYNo = "";

		if (desterrados.alma == false) {

			siYNo = "No";

		} else {

		}

		if (desterrados.alma == true) {

			throw new DesterradoException("Usted tiene alma, eso no es posible, usted es un desterrado");

		}

		return "Hola, me presento, soy RENK, tengo " + desterrados.edad + " anios de edad" + "\n"
				+ "no es necesario saber mi estatura" + " pues es algo sin importancia " + "\n"
				+ "o eso pienso desde que " + siYNo + " tengo alma";
	}

	public String hacerHumano() throws MortalException {

		mortales = new Mortal();

		mortales.colorOjos = "violeta";
		
		if (mortales.colorOjos != "violeta") {
			
			throw new MortalException("Sus ojos no son los de un mortal, peligro >:c");
		}

		return "Hola me presento, soy Juan David Gonzalez" + "\n"
				+ "tengo algunas caracteristicas peculiares, iniciando porque mis ojos son de un color "
				+ mortales.colorOjos;

	}

	public Desterrado getDesterrados() {
		return desterrados;
	}

	public void setDesterrados(Desterrado desterrados) {
		this.desterrados = desterrados;
	}

	public Heroe getHeroes() {
		return heroes;
	}

	public void setHeroes(Heroe heroes) {
		this.heroes = heroes;
	}

	public Mortal getMortales() {
		return mortales;
	}

	public void setMortales(Mortal mortales) {
		this.mortales = mortales;
	}

	/////////////////////////////////////////////////// SUPERCLASE///////////////////////////////////////////////

}
