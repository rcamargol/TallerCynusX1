package co.edu.unbosque.controller;
import co.edu.unbosque.view.View;
import co.unbosque.model.Fachada;

public class Controller {
    View view = new View();
    Fachada fachada = new Fachada();

    public Controller() {
        ejecutar();
    }

    public void ejecutar() {
        // Obtener información de los héroes, mortales y desterrados usando la Fachada
  
        String infoHeroes1 = "";
		try {
			infoHeroes1 = fachada.obtenerInformacionHeroes();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String infoMortales = "";
		try {
			infoMortales = fachada.obtenerInformacionMortales();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        String infoDesterrados = "";
		try {
			infoDesterrados = fachada.obtenerInformacionDesterrados();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


        // Mostrar información en JOptionPane
        view.mostrarInformacion(infoHeroes1, "Información de Héroes");
        view.mostrarInformacion(infoMortales, "Información de Mortal");
        view.mostrarInformacion(infoDesterrados, "Información de Desterrado");
    
    }
}
