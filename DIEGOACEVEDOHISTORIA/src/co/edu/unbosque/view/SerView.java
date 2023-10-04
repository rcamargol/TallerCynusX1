package co.edu.unbosque.view;
import javax.swing.JOptionPane;

import co.edu.unbosque.model.Mortal;
import co.edu.unbosque.model.Heroe;
import co.edu.unbosque.model.Desterrado;

public class SerView {
	
	public void mostrarHeroe(Heroe heroe) {
        String mensaje = "********** Detalles de Héroe **********\n" +
                         "Nombre: " + heroe.getNombre() + "\n" +
                         "Alma: " + heroe.getAlma() + "\n" +
                         "Altura: " + heroe.getAltura() + " metros" + "\n" +
                         "Ubicación: " + heroe.getUbicacion();

        JOptionPane.showMessageDialog(null, mensaje, "Detalles de Héroe", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarMortal(Mortal mortal) {
        String mensaje = "********** Detalles de Mortal **********\n" +
                         "Nombre: " + mortal.getNombre() + "\n" +
                         "Alma: " + mortal.getAlma() + "\n" +
                         "Color de Ojos: " + mortal.getColorOjos() + "\n" +
                         "Ubicación: " + mortal.getUbicacion();

        JOptionPane.showMessageDialog(null, mensaje, "Detalles de Mortal", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mostrarDesterrado(Desterrado desterrado) {
        String mensaje = "********** Detalles de Desterrado **********\n" +
                         "Nombre: " + desterrado.getNombre() + "\n" +
                         "Alma Falsa: " + desterrado.getAlma() + "\n" +
                         "Esperanza de vida: " + desterrado.getEsperanzaVida() + "\n" +
                         "Ubicación: " + desterrado.getUbicacion();

        JOptionPane.showMessageDialog(null, mensaje, "Detalles de Desterrado", JOptionPane.INFORMATION_MESSAGE);
    }

	public void mostrarMensaje(String string) {
		// TODO Auto-generated method stub
		
	}
}
