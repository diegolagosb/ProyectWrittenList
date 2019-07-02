package ventanas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class PanelCentral extends JPanel {

    private JTable tabla;

    public PanelCentral(String nombreLista,JTable tabla){
        this.tabla = tabla;
        iniciarPanelCentral(nombreLista);
    }

    private void iniciarPanelCentral(String nombreLista){
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createTitledBorder("Lista: "+nombreLista));
        this.add(new JScrollPane(this.tabla),BorderLayout.CENTER);
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }
}
