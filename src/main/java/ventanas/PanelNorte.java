package ventanas;

import javax.swing.*;
import java.awt.*;

public class PanelNorte extends JPanel {

    private JLabel instruccion1;
    private JRadioButton educacion;
    private JRadioButton trabajo;
    private JRadioButton deporte;
    private JPasswordField contra;
    private JLabel instruccion2;

    public PanelNorte() {
        super();
        iniciarPanelCentro();
        iniciarComponentes();
    }

    private void iniciarPanelCentro() {
        this.setLayout(new GridLayout(4, 1));
        this.setBorder(BorderFactory.createTitledBorder("Tipo de listas disponibles:"));
    }

    private void iniciarComponentes() {
        this.instruccion1 = new JLabel("Seleccione el tipo de lista que desea crear:");
        this.add(instruccion1);
        this.educacion = new JRadioButton("1.-Educación:");
        this.add(educacion);
        this.trabajo = new JRadioButton("2.-Trabajo:");
        this.add(trabajo);
        this.deporte = new JRadioButton("3.-Deportes:");
        this.add(deporte);
    }
}
