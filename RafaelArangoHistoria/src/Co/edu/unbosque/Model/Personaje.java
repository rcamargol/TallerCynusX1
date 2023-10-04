	package Co.edu.unbosque.Model;

	public abstract class Personaje {
		private String nombre;
		private int edad;
		private double altura;
		private String colorDeOjos;
		private boolean alma;
		private String planeta;
	
		public Personaje(String nombre, int edad, double altura, String colorDeOjos, boolean alma, String planeta) {
			this.nombre = nombre;
			this.edad = edad;
			this.altura = altura;
			this.colorDeOjos = colorDeOjos;
			this.alma = alma;
			this.planeta = planeta;
		}
	
		public String getPlaneta() {
			return planeta;
		}
	
		public void setPlaneta(String planeta) {
			this.planeta = planeta;
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
	
		public double getAltura() {
			return altura;
		}
	
		public void setAltura(double altura) {
			this.altura = altura;
		}
	
		public String getColorDeOjos() {
			return colorDeOjos;
		}
	
		public void setColorDeOjos(String colorDeOjos) {
			this.colorDeOjos = colorDeOjos;
		}
		
		public boolean isAlma() {
			return alma;
		}
		
		public void setAlma(boolean alma) {
			this.alma = alma;
		}
	
		public abstract String ser();
		public abstract String habilidad();
	
	}
