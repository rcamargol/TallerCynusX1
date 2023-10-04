package co.edu.unbosque.model;

public abstract class KublaKan {
	   
		protected String nombre;
	    protected int edad;
	    protected double estatura;
	    protected String colorDeOjos;
	    protected String alma;
	    
	    public abstract void sentir();
	    public abstract void habitar();
		
	    
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
		public String getColorDeOjos() {
			return colorDeOjos;
		}
		public void setColorDeOjos(String colorDeOjos) {
			this.colorDeOjos = colorDeOjos;
		}
		public String getAlma() {
			return alma;
		}
		public void setAlma(String alma) {
			this.alma = alma;
		}

	    
}
