package co.edu.unbosque.model;

public class Heroe extends Ser{
	
	//Eran muy altos por que todos median 3m
	private int altura;
	private String ubicacion;
	private boolean perder;
	
	public Heroe(String nombre, String alma, int altura, String ubicacion) {
		super(nombre, alma);
		this.altura = 3;
		this.ubicacion = "Al Norte";
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public int getAltura() {
		return altura;
	}
	public void perder() throws HeroeException {
		//Logica para determinar si el mortal ha muerto
		if (perder) {
			throw new HeroeException(null);
		}
	}
	
	//Metodo para volar
	public void volar() {
		System.out.println(getNombre() + " vuelo por los aires");
	}
	//Metodo para crear fuego
	public void crearFuego() {
		System.out.println(getNombre() + " puedo creando fuego con las manos");
	}
	//Metodo para detener el tiempo
	public void detenerTiempo() {
		System.out.println(getNombre() + " estoy deteniendo el tiempo");
	}

	@Override
	public void sentir() {
		System.out.println(getNombre() + " siente a si mismo y a seres de otros mundos");
		
	}	
	

}
