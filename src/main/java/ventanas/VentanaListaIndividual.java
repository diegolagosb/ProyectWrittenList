package ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaListaIndividual extends JFrame {

    private PanelBotonera2 botonera;
    private PanelCentral panelCentral;

    public VentanaListaIndividual(){
        super();
        iniciarPaneles();
        iniciarVentana();
    }

    private void iniciarVentana(){
        Toolkit tamanioPantalla = Toolkit.getDefaultToolkit();
        Dimension pantalla = tamanioPantalla.getScreenSize();
        this.setSize(pantalla.width / 2, pantalla.height / 2);
        this.setLocation(pantalla.width / 4, pantalla.height / 4);
        this.setTitle("Nombre Lista:");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void iniciarBotonera(){
        this.botonera = new PanelBotonera2();
        this.add(botonera);
    }

    private void iniciarPanelCentral(){
        this.panelCentral = new PanelCentral();
        this.add(panelCentral);
    }

    private void iniciarPaneles(){
        this.setLayout(new GridLayout(2,1));
        iniciarPanelCentral();
        iniciarBotonera();
    }
}
