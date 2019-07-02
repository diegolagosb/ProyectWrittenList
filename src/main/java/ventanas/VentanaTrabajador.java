package ventanas;

import gestionlistas.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaTrabajador extends JFrame implements ActionListener {

    private GestorLista listas;
    private Lista lista;
    private JTextField textNombre,textApellido,textSegApellido,textRut,textCorreo;
    private JTextField textNumTelef,textEmpresa,textAreaTrabajo,textRol,textTipoContrato;
    private JPanel botonera;
    private JButton agregar;
    private JButton cancelar;

    public VentanaTrabajador(GestorLista listas,Lista lista){
        this.listas = listas;
        this.lista=lista;
        iniciarComponentes();
        iniciarPanelCentro();
        iniciarVentana();
    }

    private void iniciarVentana(){
        Toolkit tamanioPantalla = Toolkit.getDefaultToolkit();
        Dimension pantalla = tamanioPantalla.getScreenSize();
        this.setSize(pantalla.width / 2, pantalla.height / 2);
        this.setLocation(pantalla.width / 4, pantalla.height / 4);
        this.setTitle("Ingresar Parámetros trabajador:");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setVisible(true);
    }

    private void iniciarComponentes(){
        this.setLayout(new BorderLayout());
        this.botonera = new JPanel();
        this.agregar = new JButton("Agregar");
        this.agregar.addActionListener(this);
        this.botonera.add(this.agregar);
        this.cancelar = new JButton("Cancelar");
        this.cancelar.addActionListener(this);
        this.botonera.add(this.cancelar);
        this.add(this.botonera,BorderLayout.SOUTH);
    }

    private void iniciarPanelCentro(){
        JPanel panelCentro = new JPanel(new GridLayout(11,2));
        panelCentro.add(new JLabel("DATOS TRABAJADOR"));
        panelCentro.add(new JLabel());
        panelCentro.add(new JLabel("Nombre Trabajador:"));
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
        panelCentro.add(new JLabel("Empresa:"));
        this.textEmpresa = new JTextField(30);
        panelCentro.add(textEmpresa);
        panelCentro.add(new JLabel("AreaTrabajo:"));
        this.textAreaTrabajo = new JTextField(30);
        panelCentro.add(textAreaTrabajo);
        panelCentro.add(new JLabel("Rol:"));
        this.textRol = new JTextField(30);
        panelCentro.add(textRol);
        panelCentro.add(new JLabel("Tipo Contrato:"));
        this.textTipoContrato = new JTextField(30);
        panelCentro.add(textTipoContrato);
        this.add(panelCentro,BorderLayout.CENTER);
    }

    private Trabajador ingresarPersona(){
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre(this.textNombre.getText().trim());
        trabajador.setApellido(this.textApellido.getText().trim());
        trabajador.setSegundoApellido(this.textSegApellido.getText().trim());
        trabajador.setRut(this.textRut.getText().trim());
        trabajador.setCorreo(this.textCorreo.getText().trim());
        trabajador.setNumTelefonico(this.textNumTelef.getText().trim());
        trabajador.setEmpresa(this.textEmpresa.getText().trim());
        trabajador.setAreaTrabajo(this.textAreaTrabajo.getText().trim());
        trabajador.setRol(this.textRol.getText().trim());
        trabajador.setTipoContrato(this.textTipoContrato.getText().trim());
        return trabajador;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==this.agregar){
            this.lista.getIntegranteListasTrabajadores().add(ingresarPersona());
            VentanaListaIndividual ventanaListaIndividual = new VentanaListaIndividual(this.lista,this.listas,ingresarUsuario());
        }if (actionEvent.getSource()==this.cancelar){

        }
    }

    private Object[][] ingresarUsuario(){
        Object[][] fila = new Object[this.lista.getIntegranteListasTrabajadores().size()][10];
        for (int i=0;i<fila.length;i++){
            fila[i][0] =  this.lista.getIntegranteListasTrabajadores().get(i).getNombre();
            fila[i][1] = this.lista.getIntegranteListasTrabajadores().get(i).getApellido();
            fila[i][2] = this.lista.getIntegranteListasTrabajadores().get(i).getSegundoApellido();
            fila[i][3] = this.lista.getIntegranteListasTrabajadores().get(i).getRut();
            fila[i][4] = this.lista.getIntegranteListasTrabajadores().get(i).getCorreo();
            fila[i][5] = this.lista.getIntegranteListasTrabajadores().get(i).getNumTelefonico();
            fila[i][6] = this.lista.getIntegranteListasTrabajadores().get(i).getEmpresa();
            fila[i][7] = this.lista.getIntegranteListasTrabajadores().get(i).getAreaTrabajo();
            fila[i][8] = this.lista.getIntegranteListasTrabajadores().get(i).getRol();
            fila[i][9] = this.lista.getIntegranteListasTrabajadores().get(i).getTipoContrato();
        }
        return fila;
    }

}