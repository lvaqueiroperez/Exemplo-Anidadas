
package aplicacionanidadas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Accion implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
       NoutraClase ob = new NoutraClase();
       ob.panel.setBackground(Color.red);
    }
    
    
}
