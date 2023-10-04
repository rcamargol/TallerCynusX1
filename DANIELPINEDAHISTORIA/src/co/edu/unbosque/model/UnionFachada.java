package co.edu.unbosque.model;

public class UnionFachada {
	private Heroes heroes;
	private Mortal mortal;
	private Desterrado desterrado;
	
	public String hacerUnion() {
		heroes = new Heroes();
		heroes.setNombre("Kira y Astar");
		heroes.setEdad(23);
		heroes.setAlma("honesta");;
		heroes.setEstatura(3);
		heroes.setColorDeOjos("Café");
		mortal = new Mortal();
		mortal.setNombre("Daniel");
		mortal.setEdad(17);
		mortal.setColorDeOjos("negro");
		mortal.setAlma("oscura");
		mortal.setEstatura(1);
		desterrado = new Desterrado();
		desterrado.setNombre("Renk");
		desterrado.setEdad(1190);
		desterrado.setColorDeOjos("azul");
		desterrado.setAlma("falsa");
		desterrado.setEstatura(2);
		
		return "\nLos heroes que creé se llaman "+heroes.getNombre()+", tienen "+heroes.getEdad()+" años, miden "+heroes.getEstatura()+" metros y ambos hacen fuego y vuelan.\n"+"El mortal que creé se llama "
		+mortal.getNombre()+", tiene "+mortal.getEdad()+" años, tiene los ojos de color "+mortal.getColorDeOjos()+" y él puede estudiar y trabajar.\n"+"Por último el desterrado que creé se llama "+desterrado.getNombre()
		+", tiene "+desterrado.getEdad()+" años de edad. También tienen un alma "+desterrado.getAlma() +", se arrastran mucho y solo se sienten a ellos mismos.";
	}

}
