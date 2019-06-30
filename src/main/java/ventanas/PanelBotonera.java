package ventanas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBotonera extends JPanel implements ActionListener {

    private JButton aceptar;
    private JButton volver;

    public PanelBotonera(){
        iniciarPanel();
    }

    private void iniciarPanel(){
        this.aceptar = new JButton("Aceptar");
        this.aceptar.addActionListener(this);
        this.add(aceptar);
        this.volver = new JButton("Volver");
        this.volver.addActionListener(this);
        this.add(volver);
    }


    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(this.aceptar)){
            VentanaListaIndividual ventanaListaIndividual = new VentanaListaIndividual();
        }

        if (actionEvent.getSource()==this.volver){
            System.exit(0);
        }
    }
}
