package ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBotonera extends JPanel {

    private JButton aceptar;
    private JButton volver;

    public PanelBotonera(){
        iniciarPanel();
    }

    private void iniciarPanel(){
        this.aceptar = new JButton("Aceptar");

        this.add(aceptar);
        this.volver = new JButton("Volver");

        this.add(volver);
    }



    public JButton getAceptar() {
        return aceptar;
    }

    public JButton getVolver() {
        return volver;
    }
}
