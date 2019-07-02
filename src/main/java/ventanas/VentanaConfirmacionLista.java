package ventanas;

import dominioproblema.GestorLista;
import dominioproblema.Estudiante;
import dominioproblema.Persona;
import dominioproblema.Lista;
import dominioproblema.Trabajador;
import dominioproblema.Deportista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaConfirmacionLista extends JFrame implements ActionListener {

    private GestorLista listas;
    private JLabel nombreLista;
    private JLabel tipoLista;
    private JPanel botonera;
    private JButton confirmar;
    private JButton volver;
    private String inputNombreLista;
    private String inputTipoLista;

    public VentanaConfirmacionLista(String nombreLista,String tipoLista){
        this.listas = new GestorLista();
        this.inputNombreLista = nombreLista;
        this.inputTipoLista = tipoLista;
        iniciarComponentes();
        iniciarVentana();
    }

    private void iniciarVentana(){
        Toolkit tamanioPantalla = Toolkit.getDefaultToolkit();
        Dimension pantalla = tamanioPantalla.getScreenSize();
        this.setSize(pantalla.width / 4, pantalla.height / 4);
        this.setLocation(pantalla.width / 4, pantalla.height / 4);
        this.setTitle("Nombre Lista:");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setVisible(true);
    }

    private void iniciarComponentes(){
        this.setLayout(new GridLayout(3,1));
        this.nombreLista = new JLabel("Su lista quedará con el siguiente nombre: "+this.inputNombreLista);
        this.add(this.nombreLista);
        this.tipoLista =new JLabel("El tipo de su lista es :"+ inputTipoLista);
        this.add(this.tipoLista);
        iniciarBotonera();
    }

    private void iniciarBotonera(){
        JPanel botonesInferiores = new JPanel();
        this.botonera = new JPanel(new BorderLayout());
        this.confirmar = new JButton("Confirmar");
        this.confirmar.addActionListener(this);
        botonesInferiores.add(this.confirmar);
        this.volver = new JButton("Volver");
        this.volver.addActionListener(this);
        botonesInferiores.add(this.volver);
        this.botonera.add(botonesInferiores,BorderLayout.SOUTH);
        this.add(this.botonera);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource()==this.confirmar){
           this.listas.agregarLista(crearLista(this.inputNombreLista,validarTipoLista(this.inputTipoLista)));
           VentanaListaIndividual vListIndividual = new VentanaListaIndividual(this.listas.getListas().get(this.listas.getListas().size()-1),this.listas,new Object[100][12]);
        }
        if (actionEvent.getSource()==this.volver){

        }
    }

    private Lista crearLista(String nombreLista,Persona tipoLista){
        return new Lista(nombreLista,tipoLista);
    }

    private Persona validarTipoLista(String tipoPersona){
        if (tipoPersona.equalsIgnoreCase("Educación")){
            return new Estudiante();
        }
        else if (tipoPersona.equalsIgnoreCase("Trabajo")){
            return new Trabajador();
        }else{
            return new Deportista();
        }
    }
}
