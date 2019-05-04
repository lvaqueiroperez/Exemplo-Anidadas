package aplicacionanidadas;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//***CREAR EVENTO SIN CLASE INTERNA***
//IMPLEMENTAMOS EN LA CLASE LA INTERFAZ QUE NECESITARÁN LOS EVENTOS

public class SenInternas implements ActionListener {

    JPanel panel;
    JButton boton;
    JFrame marco;

    public void SenInternas() {
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton(" Pon cor");
        marco.setSize(500, 200);

        panel.add(boton);
        marco.add(panel);
        //    Accion ac = new Accion();
        //EL MÉTODO "addActionListener" RECIBE COMO PARÁMETRO UN "this"
        boton.addActionListener(this);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

    //E IMPLEMENTAMOS EL EVENTO NECESARIO
    @Override
    public void actionPerformed(ActionEvent e) {
        panel.setBackground(Color.red);
        Toolkit.getDefaultToolkit().beep();
    }
}
/*  public class Accion implements ActionListener{
   
    @Override
    public void actionPerformed(ActionEvent e) {
      
      panel.setBackground(Color.red);
        
    }    
}*/
