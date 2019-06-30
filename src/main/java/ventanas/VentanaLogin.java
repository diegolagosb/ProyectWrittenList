/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Diego Lagos
 */
public class VentanaLogin extends JFrame implements ActionListener {

    private JLabel instruccion1;
    private JPasswordField contra;
    private JLabel usuario;
    private JButton ingresar;
    private PanelCentro panelCentro;
    private JTextField textousuario;
    
    public VentanaLogin(){
        super();
        iniciarPanel();
        iniciarVentana();
    }
    
    private void iniciarVentana(){
        Toolkit tamanioPantalla = Toolkit.getDefaultToolkit();
        Dimension pantalla = tamanioPantalla.getScreenSize();
        this.setSize(pantalla.width / 2, pantalla.height / 2);
        this.setLocation(pantalla.width / 4, pantalla.height / 4);
        this.setTitle("Login");
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    private void iniciarPanel(){
        this.setLayout(new BorderLayout());
        
    }
    
    public void iniciarComponentes(){
        this.usuario = new JLabel("                                                                    Usuario: ");
        this.add(usuario, BorderLayout.PAGE_START);
        this.textousuario = new JTextField("           ");
        this.add(textousuario, BorderLayout.LINE_START);
        this.instruccion1 = new JLabel("                                                                     Contraseña: ");
        this.add(instruccion1,BorderLayout.CENTER);
        this.contra = new JPasswordField();
        this.add(contra,BorderLayout.CENTER);
        this.ingresar = new JButton("Ingresar");
        this.add(ingresar, BorderLayout.PAGE_END);
        this.setLocationRelativeTo(textousuario);
    }
    
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(this.ingresar)){
            VentanaDeTipoLista vl = new VentanaDeTipoLista();
        }
    }
    
}



        
