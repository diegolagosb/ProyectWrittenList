package ventanas;

import org.omg.PortableInterceptor.SUCCESSFUL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaDeTipoLista extends JFrame implements ActionListener{

    private PanelBotonera botonera;
    private PanelNorte panelNorte;
    private PanelCentro panelCentro;

    public VentanaDeTipoLista() {
        iniciarPaneles();
        iniciarVentana();
    }

    private void iniciarVentana() {
        Toolkit tamanioPantalla = Toolkit.getDefaultToolkit();
        Dimension pantalla = tamanioPantalla.getScreenSize(); // detecta el tama�o de pantalla
        this.setSize(pantalla.width / 4, pantalla.height / 4);
        this.setLocation(pantalla.width / 4, pantalla.height / 4);
        this.setTitle("Tipo de Lista");// establece el titulo de la ventana
        this.setResizable(false); // Hace que la ventana sea ajustable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define la operacion de la x en la ventana
        this.setVisible(true); // hace visible la ventana
    }

    private void iniciarPaneles() {
        this.setLayout(new BorderLayout());
        iniciarBotonera();
        iniciarPanelCentral();
        iniciarPanelNorte();
    }

    private void iniciarBotonera() {
        botonera = new PanelBotonera();
        this.add(this.botonera, BorderLayout.SOUTH);
        this.botonera.getAceptar().addActionListener(this);
        this.botonera.getVolver().addActionListener(this);
        this.botonera.getComponent(0);
    }

    private void iniciarPanelNorte() {
        this.panelNorte = new PanelNorte();
        this.add(this.panelNorte, BorderLayout.NORTH);
    }

    private void iniciarPanelCentral() {
        this.panelCentro = new PanelCentro();
        this.add(this.panelCentro, BorderLayout.CENTER);
    }


    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==this.botonera.getAceptar()){
            validarRadioButtons();
        }
        if (actionEvent.getSource()==this.botonera.getVolver()){
            this.getDefaultCloseOperation();
        }
    }

    private void validarRadioButtons(){
        if (this.panelNorte.getEducacion().isSelected()){
            VentanaConfirmacionLista ventanaConfirmacionLista = new VentanaConfirmacionLista(this.panelCentro.getCuadroTexto().getText().trim(),"Educaci�n");
        }
        if (this.panelNorte.getTrabajo().isSelected()){
            VentanaConfirmacionLista ventanaConfirmacionLista = new VentanaConfirmacionLista(this.panelCentro.getCuadroTexto().getText().trim(),"Trabajo");
        }
        if (this.panelNorte.getDeporte().isSelected()){
            VentanaConfirmacionLista ventanaConfirmacionLista = new VentanaConfirmacionLista(this.panelCentro.getCuadroTexto().getText().trim(),"Deporte");
        }
    }

}
