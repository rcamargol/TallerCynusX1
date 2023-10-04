package co.edu.unbosque.model;

public abstract class KublaKan {
	
	protected static int edad;
	protected  static String estatura;
	protected static String colorOjos;
	protected  static String alma;
	
	public KublaKan (int edad, String estatura, String colorOjos, String alma) {
		
		this.edad = edad;
		this.estatura = estatura;
		this.colorOjos = colorOjos;
		this.alma = alma;
	}
	
	public static int getEdad () {
		return edad;
	}
	
	public static String getEstatura () {
		return estatura;
	}
	
	public static String getColorOjos () {
		return colorOjos;
	}
	
	public static String getAlma () {
		return alma;
	}
	
	public abstract String Habitar();
	public abstract String Sentir ();

	public abstract String getNombre();
}
