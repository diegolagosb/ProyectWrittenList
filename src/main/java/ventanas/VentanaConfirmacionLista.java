package ventanas;

import javax.swing.*;
import java.awt.*;

public class VentanaConfirmacionLista extends JFrame {

    private JLabel nombreLista;
    private JLabel tipoLista;
    private JPanel botonera;
    private JButton confirmar;
    private JButton volver;

    public VentanaConfirmacionLista(){
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
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void iniciarComponentes(){
        this.setLayout(new GridLayout(3,1));
        this.nombreLista = new JLabel("Su lista quedará con el siguiente nombre:ajksdasd");
        this.add(this.nombreLista);
        this.tipoLista =new JLabel("El tipo de su lista es:");
        this.add(this.tipoLista);
        iniciarBotonera();
    }

    private void iniciarBotonera(){
        JPanel botonesInferiores = new JPanel();
        this.botonera = new JPanel(new BorderLayout());
        this.confirmar = new JButton("Confirmar");
        botonesInferiores.add(this.confirmar);
        this.volver = new JButton("Volver");
        botonesInferiores.add(this.volver);
        this.botonera.add(botonesInferiores,BorderLayout.SOUTH);
        this.add(this.botonera);
    }
}
