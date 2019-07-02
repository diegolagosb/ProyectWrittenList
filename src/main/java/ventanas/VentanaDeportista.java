package ventanas;

import gestionlistas.Deportista;
import gestionlistas.GestorLista;
import gestionlistas.Lista;
import gestionlistas.Trabajador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaDeportista extends JFrame implements ActionListener {

    private GestorLista listas;
    private Lista lista;
    private JTextField textNombre, textApellido, textSegApellido, textRut, textCorreo;
    private JTextField textNumTelef, textPlanAsignado, textMatricula, textFechaMatricula;
    private JPanel botonera;
    private JButton agregar;
    private JButton cancelar;

    public VentanaDeportista(GestorLista listas, Lista lista) {
        this.listas = listas;
        this.lista = lista;
        iniciarComponentes();
        iniciarPanelCentro();
        iniciarVentana();
    }

    private void iniciarVentana() {
        Toolkit tamanioPantalla = Toolkit.getDefaultToolkit();
        Dimension pantalla = tamanioPantalla.getScreenSize();
        this.setSize(pantalla.width / 2, pantalla.height / 2);
        this.setLocation(pantalla.width / 4, pantalla.height / 4);
        this.setTitle("Ingresar Parámetros individuo:");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setVisible(true);
    }

    private void iniciarComponentes() {
        this.setLayout(new BorderLayout());
        this.botonera = new JPanel();
        this.agregar = new JButton("Agregar");
        this.agregar.addActionListener(this);
        this.botonera.add(this.agregar);
        this.cancelar = new JButton("Cancelar");
        this.cancelar.addActionListener(this);
        this.botonera.add(this.cancelar);
        this.add(this.botonera, BorderLayout.SOUTH);
    }

    private void iniciarPanelCentro() {
        JPanel panelCentro = new JPanel(new GridLayout(10, 2));
        panelCentro.add(new JLabel("DATOS INDIVIDUO"));
        panelCentro.add(new JLabel());
        panelCentro.add(new JLabel("Nombre:"));
        this.textNombre = new JTextField(30);
        panelCentro.add(textNombre);
        panelCentro.add(new JLabel("Apellido:"));
        this.textApellido = new JTextField(30);
        panelCentro.add(textApellido);
        panelCentro.add(new JLabel("Sgdo.Apellido:"));
        this.textSegApellido = new JTextField(30);
        panelCentro.add(textSegApellido);
        panelCentro.add(new JLabel("Rut:"));
        this.textRut = new JTextField(30);
        panelCentro.add(textRut);
        panelCentro.add(new JLabel("Correo:"));
        this.textCorreo = new JTextField(30);
        panelCentro.add(textCorreo);
        panelCentro.add(new JLabel("Num.Teléfono:"));
        this.textNumTelef = new JTextField(30);
        panelCentro.add(textNumTelef);
        panelCentro.add(new JLabel("Plan asignado:"));
        this.textPlanAsignado = new JTextField(30);
        panelCentro.add(textPlanAsignado);
        panelCentro.add(new JLabel("Matrícula:"));
        this.textMatricula = new JTextField(30);
        panelCentro.add(textMatricula);
        panelCentro.add(new JLabel("Fecha Matrícula:"));
        this.textFechaMatricula = new JTextField(30);
        panelCentro.add(textFechaMatricula);
        this.add(panelCentro, BorderLayout.CENTER);
    }

    private Deportista ingresarPersona() {
        Deportista deportista = new Deportista();
        deportista.setNombre(this.textNombre.getText().trim());
        deportista.setApellido(this.textApellido.getText().trim());
        deportista.setSegundoApellido(this.textSegApellido.getText().trim());
        deportista.setRut(this.textRut.getText().trim());
        deportista.setCorreo(this.textCorreo.getText().trim());
        deportista.setNumTelefonico(this.textNumTelef.getText().trim());
        deportista.setPlanAsignado(this.textPlanAsignado.getText().trim());
        deportista.setMatricula(Double.parseDouble(this.textMatricula.getText().trim()));
        deportista.setFechaMatricula(this.textFechaMatricula.getText().trim());
        return deportista;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.agregar) {
            this.lista.getIntegranteListasDeportistas().add(ingresarPersona());
            VentanaListaIndividual ventanaListaIndividual = new VentanaListaIndividual(this.lista, this.listas, ingresarUsuario());
        }
        if (actionEvent.getSource() == this.cancelar) {

        }
    }

    private Object[][] ingresarUsuario() {
        Object[][] fila = new Object[this.lista.getIntegranteListasDeportistas().size()][9];
        for (int i = 0; i < fila.length; i++) {
            fila[i][0] = this.lista.getIntegranteListasDeportistas().get(i).getNombre();
            fila[i][1] = this.lista.getIntegranteListasDeportistas().get(i).getApellido();
            fila[i][2] = this.lista.getIntegranteListasDeportistas().get(i).getSegundoApellido();
            fila[i][3] = this.lista.getIntegranteListasDeportistas().get(i).getRut();
            fila[i][4] = this.lista.getIntegranteListasDeportistas().get(i).getCorreo();
            fila[i][5] = this.lista.getIntegranteListasDeportistas().get(i).getNumTelefonico();
            fila[i][6] = this.lista.getIntegranteListasDeportistas().get(i).getPlanAsignado();
            fila[i][7] = this.lista.getIntegranteListasDeportistas().get(i).getMatricula();
            fila[i][8] = this.lista.getIntegranteListasDeportistas().get(i).getFechaMatricula();
        }
        return fila;
    }
}
