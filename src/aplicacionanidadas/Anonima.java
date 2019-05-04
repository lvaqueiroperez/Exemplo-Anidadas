package aplicacionanidadas;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Anonima {

    JPanel panel; // = new JPanel();
    JButton boton;
    JFrame marco;

    public Anonima() {
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton(" Pon cor");
        marco.setSize(500, 200);

        panel.add(boton);
        marco.add(panel);
        //    Accion ac = new Accion();
        //***CREAR EVENTO CON CLASE ANÓNIMA***
        //CREAMOS LA CLASE ANÓNIMA EN LA MISMA LÍNEA DONDE CREAMOS
        //EL OBJETO QUE LLEVA COMO PARÁMETRO EL MÉTODO "addActionListener"
        boton.addActionListener(new ActionListener() {
            //AL HACER LA CLASE ANÓNIMA DESPUÉS DE ESE OBJETO, YA NOS DEJA
            //IMPLEMENTAR LOS MÉTODOS NECESARIOS
            @Override
            public void actionPerformed(ActionEvent ae) {
                panel.setBackground(Color.yellow);
            }

        });

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

}
