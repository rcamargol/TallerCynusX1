package co.edu.unbosque.controller;

import co.edu.unbosque.model.DesterradoException;
import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.model.HeroeException;
import co.edu.unbosque.model.MortalException;
import co.edu.unbosque.view.View;

public class Controller {
	
	private Fachada fachada;
	private View view;
	
	
	public Controller() throws HeroeException, MortalException, DesterradoException{
		fachada= new Fachada();
		view= new View();
		
		ejecutar();
		
		
	}
	
	public void ejecutar() throws HeroeException, MortalException, DesterradoException {
	    
	        String Kira = fachada.hacerHerencia();
	        String Astar = fachada.hacerHerencia2();
	        String JuanDiego= fachada.hacerHerencia3();
	        String Renk = fachada.hacerHerencia4();
	        
	        
	        
	        view.mostrarResultado(Astar);
	        view.mostrarResultado(Kira);
	        view.mostrarResultado(Renk);
	        view.mostrarResultado(JuanDiego);
	        view.mostrarResultado(Renk);

	        
	    }
	}



	
	
