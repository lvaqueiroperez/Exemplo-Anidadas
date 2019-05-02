
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
    
    public Anonima(){
        marco = new JFrame();
        panel = new JPanel ();
        boton = new JButton(" Pon cor");        
        marco.setSize(500, 200);  
        
        panel.add(boton);
        marco.add(panel);
    //    Accion ac = new Accion();
        boton.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              panel.setBackground(Color.red);
              Toolkit.getDefaultToolkit().beep();
          }
        
        
        });
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }
 
}
