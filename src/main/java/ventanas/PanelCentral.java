package ventanas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class PanelCentral extends JPanel {

    private JTable tabla;

    public PanelCentral(){
        super();
        iniciarPanelCentral();
    }

    private void iniciarPanelCentral(){
        this.setLayout(new GridLayout(1,1));
        this.setBorder(BorderFactory.createTitledBorder("Nombre de la lista:"));
        this.tabla = new JTable(new Object[10][5], new String[]{"Nombre","Apellido","Edad","Email","Apoderado"});
        this.add(tabla);
    }
}
