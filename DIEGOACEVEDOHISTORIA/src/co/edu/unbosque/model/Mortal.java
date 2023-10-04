package co.edu.unbosque.model;

public class Mortal extends Ser {
	
	private String colorOjos;
	private String ubicacion;
	private boolean haMuerto;
	
	public Mortal(String nombre, String alma, String colorOjos, String ubicacion) {
		super(nombre, alma);
		this.colorOjos = "Violeta";
		this.ubicacion = "Al Este";
		this.haMuerto = false;
	}
	
	public String getColorOjos() {
		return colorOjos;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void morir() throws MortalException {
		//Logica para determinar si el mortal ha muerto
		if (haMuerto) {
			throw new MortalException(null);
		}
	}
	
	@Override
	public void sentir() {
		System.out.println(getNombre() + "Siente su existencia así a seres de otros mundos.");
	}

	
	
	

}
