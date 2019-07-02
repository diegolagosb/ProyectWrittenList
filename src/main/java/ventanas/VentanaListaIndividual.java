    
package ventanas;

import dominioproblema.GestorLista;
import dominioproblema.Estudiante;
import dominioproblema.Lista;
import dominioproblema.Trabajador;
import dominioproblema.Deportista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaListaIndividual extends JFrame implements ActionListener {

    private Object[][] datoTabla;
    private GestorLista listas;
    private Lista lista;
    private PanelBotonera2 botonera;
    private PanelCentral panelCentral;

    public VentanaListaIndividual(Lista lista, GestorLista listas,Object[][] datoTabla) {
        this.datoTabla = datoTabla;
        this.listas = listas;
        this.lista = lista;
        iniciarPaneles();
        iniciarVentana();
    }

    private void iniciarVentana() {
        Toolkit tamanioPantalla = Toolkit.getDefaultToolkit();
        Dimension pantalla = tamanioPantalla.getScreenSize();
        this.setSize(pantalla.width / 2, pantalla.height / 2);
        this.setLocation(pantalla.width / 4, pantalla.height / 4);
        this.setTitle("Nombre Lista: " + this.lista.getNombreLista());
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void iniciarBotonera() {
        this.botonera = new PanelBotonera2();
        this.botonera.getIngresar().addActionListener(this);
        this.botonera.getMostrarListas().addActionListener(this);
        this.add(botonera,BorderLayout.SOUTH);
    }

    private void iniciarPanelCentral() {
        if (this.lista.getTipoLista().getClass().equals(Estudiante.class)) {
            this.panelCentral = new PanelCentral(this.lista.getNombreLista(),crearParametrosTablaEstudiante());
        }
        else if (this.lista.getTipoLista().getClass().equals(Trabajador.class)){
            this.panelCentral = new PanelCentral(this.lista.getNombreLista(),crearParametrosTablaTrabajador());
        }else{
            this.panelCentral = new PanelCentral(this.lista.getNombreLista(),crearParametrosTablaDeportista());
        }

        this.add(panelCentral,BorderLayout.CENTER);
    }

    private void iniciarPaneles() {
        this.setLayout(new BorderLayout());
        iniciarPanelCentral();
        iniciarBotonera();
    }

    private JTable crearParametrosTablaEstudiante(){
        Estudiante estudiante = new Estudiante();
        JTable tabla = new JTable(this.datoTabla,estudiante.datosTabla());
        return tabla;
    }

    private JTable crearParametrosTablaTrabajador(){
        Trabajador trabajador = new Trabajador();
        JTable tabla = new JTable(this.datoTabla,trabajador.datosTabla());
        return tabla;
    }

    private JTable crearParametrosTablaDeportista(){
        Deportista deportista = new Deportista();
        JTable tabla = new JTable(this.datoTabla,deportista.datosTabla());
        return tabla;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.botonera.getIngresar()) {
            identificarTipoLista();
        }
        if (actionEvent.getSource() == this.botonera.getMostrarListas()) {
            VentanaMostrarListas vMostrarListas = new VentanaMostrarListas(this.listas,this.datoTabla);
        }
    }

    private void identificarTipoLista(){
        if (this.lista.getTipoLista().getClass().equals(Estudiante.class)){
            VentanaEstudiante ventanaEstudiante = new VentanaEstudiante(this.listas,this.lista);
        }
        else if (this.lista.getTipoLista().getClass().equals(Trabajador.class)){
            VentanaTrabajador ventanaTrabajador = new VentanaTrabajador(this.listas,this.lista);
        }else {
            VentanaDeportista ventanaDeportista = new VentanaDeportista(this.listas,this.lista);
        }
    }
}
