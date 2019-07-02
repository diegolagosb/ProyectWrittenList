package ventanas;

import dominioproblema.GestorLista;
import dominioproblema.Estudiante;
import dominioproblema.Lista;
import dominioproblema.Apoderado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaEstudiante extends JFrame implements ActionListener {

    private GestorLista listas;
    private Lista lista;
    private JTextField textNombre,textApellido,textSegApellido,textRut,textCorreo,textMatricula;
    private JTextField textNombreApoderado,textApellidoApoderado,textSegApeApo,textRutApoderado,textCorreoApoderado,textNumTelef;
    private JPanel botonera;
    private JButton agregar;
    private JButton cancelar;

    public VentanaEstudiante(GestorLista listas,Lista lista){
        this.listas =listas;
        this.lista = lista;
        iniciarComponentes();
        iniciarPanelCentro();
        iniciarVentana();
    }

    private void iniciarVentana(){
        Toolkit tamanioPantalla = Toolkit.getDefaultToolkit();
        Dimension pantalla = tamanioPantalla.getScreenSize();
        this.setSize(pantalla.width / 2, pantalla.height / 2);
        this.setLocation(pantalla.width / 4, pantalla.height / 4);
        this.setTitle("Ingresar Parámetros estudiante:");
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
        JPanel panelCentro = new JPanel(new GridLayout(14,2));
        panelCentro.add(new JLabel("DATOS ALUMNO"));
        panelCentro.add(new JLabel());
        panelCentro.add(new JLabel("Nombre Alumno:"));
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
        panelCentro.add(new JLabel("Mátricula:"));
        this.textMatricula = new JTextField(30);
        panelCentro.add(textMatricula);
        panelCentro.add(new JLabel("DATOS APODERADO"));
        panelCentro.add(new JLabel());
        panelCentro.add(new JLabel("Nombre apoderado:"));
        this.textNombreApoderado = new JTextField(30);
        panelCentro.add(textNombreApoderado);
        panelCentro.add(new JLabel("Apellido:"));
        this.textApellidoApoderado = new JTextField(30);
        panelCentro.add(textApellidoApoderado);
        panelCentro.add(new JLabel("Sgdo.Apellido:"));
        this.textSegApeApo = new JTextField(30);
        panelCentro.add(textSegApeApo);
        panelCentro.add(new JLabel("Rut:"));
        this.textRutApoderado = new JTextField(30);
        panelCentro.add(textRutApoderado);
        panelCentro.add(new JLabel("Correo:"));
        this.textCorreoApoderado = new JTextField(30);
        panelCentro.add(textCorreoApoderado);
        panelCentro.add(new JLabel("Num.Teléfono:"));
        this.textNumTelef = new JTextField(30);
        panelCentro.add(textNumTelef);
        this.add(panelCentro,BorderLayout.CENTER);
    }

    private Estudiante ingresarPersona(){
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(this.textNombre.getText().trim());
        estudiante.setApellido(this.textApellido.getText().trim());
        estudiante.setSegundoApellido(this.textSegApellido.getText().trim());
        estudiante.setRut(this.textRut.getText().trim());
        estudiante.setCorreo(this.textCorreo.getText().trim());
        estudiante.setMatricula(this.textMatricula.getText().trim());
        estudiante.setApoderado(ingresarApoderadoEstudiante());
        return estudiante;
    }

    private Apoderado ingresarApoderadoEstudiante(){
        Apoderado apoderado = new Apoderado();
        apoderado.setNombre(this.textNombreApoderado.getText().trim());
        apoderado.setApellido(this.textApellidoApoderado.getText().trim());
        apoderado.setSegundoApellido(this.textSegApeApo.getText().trim());
        apoderado.setRut(this.textRutApoderado.getText().trim());
        apoderado.setCorreo(this.textCorreoApoderado.getText().trim());
        apoderado.setNumTelefonica(this.textNumTelef.getText().trim());
        return apoderado;
    }




    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==this.agregar){
            this.lista.getIntegranteListasEstudiantes().add(ingresarPersona());
            VentanaListaIndividual ventanaListaIndividual = new VentanaListaIndividual(this.lista,this.listas,ingresarUsuario());
        }if (actionEvent.getSource()==this.cancelar){

        }
    }

    private Object[][] ingresarUsuario(){
        Object[][] fila = new Object[this.lista.getIntegranteListasEstudiantes().size()][12];
        for (int i=0;i<fila.length;i++){
            fila[i][0] =  this.lista.getIntegranteListasEstudiantes().get(i).getNombre();
            fila[i][1] = this.lista.getIntegranteListasEstudiantes().get(i).getApellido();
            fila[i][2] = this.lista.getIntegranteListasEstudiantes().get(i).getSegundoApellido();
            fila[i][3] = this.lista.getIntegranteListasEstudiantes().get(i).getRut();
            fila[i][4] = this.lista.getIntegranteListasEstudiantes().get(i).getCorreo();
            fila[i][5] = this.lista.getIntegranteListasEstudiantes().get(i).getMatricula();
            fila[i][6] = this.lista.getIntegranteListasEstudiantes().get(i).getApoderado().getNombre();
            fila[i][7] = this.lista.getIntegranteListasEstudiantes().get(i).getApoderado().getApellido();
            fila[i][8] = this.lista.getIntegranteListasEstudiantes().get(i).getApoderado().getSegundoApellido();
            fila[i][9] = this.lista.getIntegranteListasEstudiantes().get(i).getApoderado().getRut();
            fila[i][10] = this.lista.getIntegranteListasEstudiantes().get(i).getApoderado().getCorreo();
            fila[i][11] = this.lista.getIntegranteListasEstudiantes().get(i).getApoderado().getNumTelefonica();
        }
        return fila;
    }


}
