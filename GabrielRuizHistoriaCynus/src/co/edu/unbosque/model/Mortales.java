package co.edu.unbosque.model;

public class Mortales extends KublaKan {
	
	public Mortales(int edad,double altura,String colorOjos) {
		super.edad = edad;
		super.altura = altura;
		super.colorOjos = "violeta";
		super.alma= true;
	}
	
	public String ColorOjos() {
		return "mis ojos son violetas";
	}
	public 	String conocimiento() {
		return "aprendo para compensar mi debilidad fisica";
	}
	public String familia() {
		return "yo amo a mi familia";
	}
	public String profecion() {
		return "trabajo para el bien comun";
	}

	public String sentir() {
		return " puedo sentir la presencia de otros mortales";
	}

	public String habitar() {
		return "yo amo mi tierra";
	}
		
}
