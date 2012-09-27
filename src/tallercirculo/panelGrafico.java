/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tallercirculo;

import java.awt.*;
import javax.swing.JPanel;

/**
 *
 * @author palacioscuacialpud
 */
public class panelGrafico extends JPanel{
   Circulo circulo=new Circulo();
    public panelGrafico() {
    }
    
    
    protected void paincomponente(Graphics g){
    
    super.paintComponent(g);
     Graphics2D g2D = (Graphics2D) g;
     for(int i = 0;i<=circulo.getCordenadasX().capacity();i++){
     
     g2D.fillOval((int)circulo.getCordenadasX().elementAt(i), (int)circulo.getCordenadasjava().elementAt(i), 10, 10);
     g2D.setColor(Color.BLUE);
     
     
     } 
    }
}
