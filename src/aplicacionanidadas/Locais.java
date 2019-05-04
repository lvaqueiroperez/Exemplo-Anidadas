package aplicacionanidadas;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Locais {

    JPanel panel; // = new JPanel();
    JButton boton;
    JFrame marco;

    public Locais() {
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton(" Pon cor");
        marco.setSize(500, 200);

        panel.add(boton);
        marco.add(panel);
        //    Accion ac = new Accion();
        //    boton.addActionListener(new Accion());

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

    //***CREAR EVENTOS CON CLASES INTERNAS LOCALES***
    public void activar() {
        //CLASE LOCAL DENTRO DEL MÉTODO "activar" QUE IMPLEMENTA LA INTERFAZ NECESARIA
        //Y SUS MÉTODOS
        class Accion implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.GREEN);
                Toolkit.getDefaultToolkit().beep();
            }
        }
        //PARA AÑADIR EL EVENTO AL COMPONENTE, PONEMOS COMO PARÁMETROS DEL MÉTODO
        //"addActionListener" UN OBJETO DE LA CLASE LOCAL
        boton.addActionListener(new Accion());

    }

}
