package ventanas;

import javax.swing.*;
import java.awt.*;

public class PanelCentro extends JPanel {

    private JLabel instruccion;
    private JTextField cuadroTexto;

    public PanelCentro(){
        super();
        iniciarPanelCentro();
    }

    private void iniciarPanelCentro(){
        this.setLayout(new FlowLayout(5,10,10));
        this.instruccion = new JLabel("Ingrese el nombre de la lista:");
        this.add(instruccion);
        this.cuadroTexto = new JTextField(40);
        this.add(cuadroTexto);
    }

    public JLabel getInstruccion() {
        return instruccion;
    }

    public JTextField getCuadroTexto() {
        return cuadroTexto;
    }
}
