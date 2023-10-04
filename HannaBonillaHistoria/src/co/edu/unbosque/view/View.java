package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
	    public String pedirNombreMortal() {
	        return JOptionPane.showInputDialog("Ingresa tu nombre como Mortal:" );
	    }

	    public String pedirNombreHeroe() {
	        return JOptionPane.showInputDialog("Ingresa un nombre para tu Héroe:");
	    }

	    public String pedirNombreDesterrado() {
	        return JOptionPane.showInputDialog("Ingresa un nombre para tu Desterrado:");
	     
	    }

	    public void mostrarMensaje(String mensaje) {
	        JOptionPane.showMessageDialog(null, mensaje);
	    }
	}