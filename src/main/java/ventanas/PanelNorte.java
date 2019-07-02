package ventanas;

import dominioproblema.Lista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelNorte extends JPanel {

    private JLabel instruccion1;
    private JRadioButton educacion,trabajo,deporte;
    ButtonGroup grupoRadios;

    public PanelNorte() {
        this.grupoRadios = new ButtonGroup();
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
        this.grupoRadios.add(this.educacion);
        this.grupoRadios.add(this.trabajo);
        this.grupoRadios.add(this.deporte);
    }

    public JLabel getInstruccion1() {
        return instruccion1;
    }

    public JRadioButton getEducacion() {
        return educacion;
    }

    public JRadioButton getTrabajo() {
        return trabajo;
    }

    public JRadioButton getDeporte() {
        return deporte;
    }

    public ButtonGroup getGrupoRadios() {
        return grupoRadios;
    }
}
