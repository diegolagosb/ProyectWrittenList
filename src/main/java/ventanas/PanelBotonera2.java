package ventanas;

import javax.swing.*;
import java.awt.*;

public class PanelBotonera2 extends JPanel {

    private JButton ingresar;
    private JButton mostrarListas;

    public PanelBotonera2(){
        super();
        iniciarBotonera();
    }

    private void iniciarBotonera(){
        this.setLayout(new BorderLayout());
        this.add(iniciarBotones(),BorderLayout.SOUTH);
    }

    private JPanel iniciarBotones(){
        JPanel botones = new JPanel();
        this.ingresar = new JButton("Ingresar persona");
        botones.add(ingresar);
        this.mostrarListas = new JButton("Mostrar listas agregadas");
        botones.add(mostrarListas);
        return botones;
    }

    public JButton getIngresar() {
        return ingresar;
    }

    public JButton getMostrarListas() {
        return mostrarListas;
    }
}
