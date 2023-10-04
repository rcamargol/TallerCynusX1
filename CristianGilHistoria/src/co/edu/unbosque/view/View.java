package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {
    public void mostrarInformacion(String informacion, String titulo) {
        JOptionPane.showMessageDialog(null, informacion, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
}
