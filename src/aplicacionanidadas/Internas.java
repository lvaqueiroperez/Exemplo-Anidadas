package aplicacionanidadas;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Internas {

    JPanel panel;
    JButton boton;
    JFrame marco;

    public void Internas() {
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton(" Pon cor");
        marco.setSize(500, 200);

        panel.add(boton);
        marco.add(panel);
        //    Accion ac = new Accion();
        //***CREAR EVENTOS USANDO CLASES INTERNAS***
        //PARA AÑADIR EL EVENTO, PONEMOS COMO PARÁMETROS DEL MÉTODO
        //"addActionListener" UN OBJETO DE LA CLASE INTERNA
        boton.addActionListener(new Accion());

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

    //CLASE INTERNA PRIVADA QUE SOLO SE USA PARA LOS EVENTOS
    //IMPLEMENTA EL LISTENER NECESARIO(Interfaz) Y LOS MÉTODOS
    private class Accion implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.red);
            Toolkit.getDefaultToolkit().beep();
        }

    }

}
