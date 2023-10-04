package co.edu.unbosque.controller;
import co.edu.unbosque.model.ExcepcionDesterrado;
import co.edu.unbosque.model.ExcepcionHeroe;
import co.edu.unbosque.model.ExcepcionMortal;
import co.edu.unbosque.model.PlanetaCynusX1;
import co.edu.unbosque.view.View;

public class Controller {
	
		private PlanetaCynusX1 planetaCynusX1;
		private View view;
		
		public Controller() throws ExcepcionHeroe, ExcepcionDesterrado, ExcepcionMortal {
			
			planetaCynusX1 = new PlanetaCynusX1();
			view = new View();

			funcionar();
		}

		public void funcionar() throws ExcepcionHeroe, ExcepcionDesterrado, ExcepcionMortal {
			
			view.escribirDato(planetaCynusX1.crearHeroe1());
			view.escribirDato(planetaCynusX1.crearHeroe2());	
			view.escribirDato(planetaCynusX1.crearDesterrado());
			view.escribirDato(planetaCynusX1.crearMortal());
		}
		
	}

//Para que funcionen las execpciones toca modificar el dato del retorno en algunos metodos dentro de las clases
//respectivas, en Heroe public boolean crearFuegoConManos() return "False"  
//en Desterrado public String vivirPor1500Años() return "vive por 1501 años" 
//en Mortal public String adquirirConocimientos() "No Adquiere Conocimientos" 

