package ventanas;

import dominioproblema.Deportista;
import dominioproblema.GestorLista;
import dominioproblema.Lista;
import dominioproblema.Persona;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaMostrarListas extends JFrame implements ActionListener {

    private GestorLista listas;
    private Object[][] datosTabla;
    private JScrollPane barra;
    private ArrayList<JLabel> nombresListas;
    private ArrayList<JButton> ingresar;
    private ArrayList<JButton> eliminar;


    public VentanaMostrarListas(GestorLista listas,Object[][] datosTabla) {
        this.datosTabla = datosTabla;
        this.listas = listas;
        this.nombresListas = new ArrayList<JLabel>();
        this.ingresar = new ArrayList<JButton>();
        this.eliminar = new ArrayList<JButton>();
        iniciarComponentes();
        iniciarVentana();
    }

    private void iniciarVentana() {
        Toolkit tamanioPantalla = Toolkit.getDefaultToolkit();
        Dimension pantalla = tamanioPantalla.getScreenSize();
        this.setSize(pantalla.width / 2, pantalla.height / 2);
        this.setLocation(pantalla.width / 4, pantalla.height / 4);
        this.setTitle("Listas agregadas:");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void iniciarComponentes() {
        this.setLayout(new GridLayout(this.listas.getListas().size(), 3));
        for (int i = 0; i < this.listas.getListas().size(); i++) {
            this.nombresListas.add(new JLabel("Nombre de la lista :"+this.listas.getListas().get(i).getNombreLista()));
            this.add(this.nombresListas.get(i));
            this.ingresar.add(new JButton("Ingresar a lista"));
            this.ingresar.get(i).addActionListener(this);
            this.add(this.ingresar.get(i));
            this.eliminar.add(new JButton("Eliminar"));
            this.eliminar.get(i).addActionListener(this);
            this.add(this.eliminar.get(i));
        }
    }


    public void actionPerformed(ActionEvent actionEvent) {
        for (int i=0;i<this.listas.getListas().size();i++){
            if (actionEvent.getSource()==this.ingresar.get(i)){
                VentanaListaIndividual ventanaListaIndividual = new VentanaListaIndividual(this.listas.getListas().get(i),this.listas,this.datosTabla);
            }
            else if (actionEvent.getSource()==this.eliminar.get(i)){
                this.listas.getListas().remove(i);
                JOptionPane.showMessageDialog(null,"Se ha eliminado la lista correctamente");
            }
        }

    }
}
