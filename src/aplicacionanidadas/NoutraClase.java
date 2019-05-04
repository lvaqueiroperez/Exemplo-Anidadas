package aplicacionanidadas;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NoutraClase {

    JPanel panel; // = new JPanel();
    JButton boton;
    JFrame marco;

    public NoutraClase() {
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton(" Pon cor");
        marco.setSize(500, 200);

        panel.add(boton);
        marco.add(panel);
        //    Accion ac = new Accion();
        boton.addActionListener(new Accion());

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

    public JPanel getPanel() {
        return panel;
    }
}
