package co.edu.unbosque.model;

public class Herencia {
	
	ClaseF bd;
	private Heroes heroe;
	private Mortales mortal;
	private Desterrados desterrado;
	
	
	public Herencia() {
		
	}
	
	public String hacerHerencia() {
		
		heroe = new Heroes ("Kira", 20,3, "verde", true,"reviso el planeta 3 veces al dia",3);
		
		return heroe.getNombre() + ", "+heroe.tipo()+ "  y protejo al planeta\n "+ heroe.habilidad() + "\n mi altura como la de todos los heroes es de "+ heroe.getEstatura()+" metros y "+heroe.habitad()+"\n"+ "tengo la habilidad de"+heroe.sentir()+"\n"+ heroe.revisar+ " y he realizado "+ heroe.totalrescates+ " rescates hoy";	
		}
	
	public String hacerOtraHerencia() {
	    Heroes Heroe2 = new Heroes("Astar", 258, 3, "rojo", true,"reviso la ciudad 5 veces al dia", 7);

	    return Heroe2.getNombre() + ", " + Heroe2.tipo() + " y protejo al planeta\n " +
	        Heroe2.habilidad() + "\n mi altura como la de todos los héroes es de " +
	        Heroe2.getEstatura() + " metros y " + Heroe2.habitad() +
	        "\n tengo la habilidad de " + Heroe2.sentir()+"\n"+Heroe2.revisar+"y he realizado "+ Heroe2.totalrescates+ " rescates hoy";
	    }
	public String herencia3() {
	    Desterrados desterrado = new Desterrados("Renk", 258, 1.3, "rojo", false,true,300);

	    return desterrado.getNombre() + ", " + desterrado.tipo() + " y somos los seres mas tristes del planeta\n " +
	        desterrado.habilidad() + "\n mi altura es de " +
	        desterrado.getEstatura() + " metros y " + desterrado.habitad() +
	        "\n " + desterrado.sentir()+"\n"+"segun la leyenda mi alma es "+desterrado.getAlma()+" por tanto KublaKan me rechaza";
	}

	public String herencia4() {
	    Mortales mortal = new Mortales("Andres", 18, 1.76, "Morado", true, "cafe y pan", 30000);

	    return mortal.getNombre() + ", " + mortal.tipo() + " y trabajo para el planeta\n " +
	        mortal.habilidad() +"\n"+"actualmente soy programador, no tengo descendencia y trabajo desarrollando un robot que pueda navegar facilmente en otros planetas"+"\nmi altura es de " +
	        mortal.getEstatura() + " metros y " + mortal.habitad() +
	        "\n " + mortal.sentir();
	}
	

}
