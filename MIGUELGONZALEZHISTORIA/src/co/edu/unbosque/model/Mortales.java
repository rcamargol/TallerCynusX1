package co.edu.unbosque.model;

public class Mortales extends KublaKan{
	
	protected String nombre;

	public Mortales(String nombre,int edad, String estatura, String colorOjos, boolean alma) {
		super(edad, estatura, colorOjos, alma);
		this.nombre = nombre;
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	void habitar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sentir() {
		// TODO Auto-generated method stub
		
	}
	
	public String adquirirConocimientos() {
		return "yo puedo adquirir conociminetos";
	}
	
	public String tenerFamilia() {
		return "podemos tener familia";
	}
	
	public String ejercerProfesion() {
		return "podemos ejercer una profesion";
	}

}
