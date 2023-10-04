package co.edu.unbosque.Model;

public abstract class KublaKan {
    private String nombre;
    private int edad;
    private String colorOjos;
    private int altura;
    private String alma;

    public KublaKan(String nombre, int edad, String colorOjos,int altura, String alma) {
        this.nombre = nombre;
        this.edad = edad;
        this.colorOjos = colorOjos;
        this.altura = altura;
        this.alma = alma;
    }

    public abstract void habitarPlaneta();

    public abstract void sentir();

	public String getNombre() {	
		return nombre;
	}

	public int getEdad() {		
		return edad;
	}

	public String getColorOjos() {	
		return colorOjos;
	}
	
	public int getAltura() {
		return altura;
	}

	public String getAlma() {
		return alma;
	}
}
