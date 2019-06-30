package ventanas;

import gestionlistas.GestorLista;
import gestionlistas.Lista;
import gestionlistas.Persona;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaMostrarListas extends JFrame {

    private GestorLista listas;
    private JScrollPane barra;
    private ArrayList<JLabel> nombresListas;
    private ArrayList<JButton> ingresar;
    private ArrayList<JButton> eliminar;


    public VentanaMostrarListas() {
        this.listas = new GestorLista();
        this.listas.getListas().add(crearLista());
        this.listas.getListas().add(crearLista());
        this.listas.getListas().add(crearLista());
        this.listas.getListas().add(crearLista());
        this.listas.getListas().add(crearLista());
        this.listas.getListas().add(crearLista());
        this.listas.getListas().add(crearLista());
        this.listas.getListas().add(crearLista());
        this.listas.getListas().add(crearLista());
        this.listas.getListas().add(crearLista());
        this.listas.getListas().add(crearLista());
        this.listas.getListas().add(crearLista());
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
            this.ingresar.add(new JButton("Ingresar"));
            this.add(this.ingresar.get(i));
            this.eliminar.add(new JButton("Eliminar"));
            this.add(this.eliminar.get(i));
        }
    }

    private Lista crearLista() {
        Lista lista = new Lista();
        lista.setNombreLista("Lista1");
        lista.setTipoLista("Deportista");
        return lista;
    }
}
