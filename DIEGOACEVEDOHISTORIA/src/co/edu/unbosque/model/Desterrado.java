package co.edu.unbosque.model;

public class Desterrado extends Ser {
	
	private String ubicacion;
	private int esperanzaVida;
	private boolean almaFalsa;
	private boolean volar;
	
	public Desterrado(String nombre, String alma, String ubicacion, int esperanzaVida, boolean almaFalsa) {
		super(nombre, alma);
		this.ubicacion= ubicacion;
		this.esperanzaVida = esperanzaVida;
		this.almaFalsa = almaFalsa;
		
	}
	
	
	public String getUbicacion() {
		return ubicacion;
	}


	public int getEsperanzaVida() {
		return esperanzaVida;
	}


	public boolean isAlmaFalsa() {
		return almaFalsa;
	}
	public void volar() throws DesterradoException {
		//Logica para determinar si el mortal ha muerto
		if (volar) {
			throw new DesterradoException(null);
		}
	}

	//Metodo para representar el arrastre de los desterrados
	public void arrastrarse() {
		System.out.println(getNombre()+ "se arrastra de un lugar a otro");
	}

	@Override
	public void sentir() {
		System.out.println(getNombre() + " no siente a nadia más que ellos mismos");
		
	}
	
	

}
