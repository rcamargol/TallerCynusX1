package co.edu.unbosque.model;

public abstract class KublaKan {
	protected String nombre;
    protected int edad;
    protected double estatura;
    protected String coloro;
    protected boolean alma;

    public KublaKan(String nombre,int edad, double estatura, String coloro, boolean  alma) {
    	
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.coloro = coloro;	
        this.alma = alma;
    }
    
    
    
    public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public double getEstatura() {
		return estatura;
	}



	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}



	public String getColoro() {
		return coloro;
	}



	public void setColoro(String coloro) {
		this.coloro = coloro;
	}



	public boolean getAlma() {
		return alma ;
	}



	public void setAlma(boolean alma) {
		this.alma = alma;
	}



	public abstract String habitad();

    public abstract String tipo();

    public abstract String habilidad();
    
    public abstract String sentir();
}