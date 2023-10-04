package co.edu.unbosque.controller;

import co.edu.unbosque.model.SerFalsoException;
import co.edu.unbosque.model.SerSolitarioException;
import co.edu.unbosque.model.SerVoladorException;
import co.edu.unbosque.view.View;

public class AplMain {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);

        try {
			controller.crearYMostrarSeres();
		} catch (SerFalsoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SerSolitarioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SerVoladorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
