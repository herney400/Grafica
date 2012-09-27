/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tallercirculo;

import java.awt.Point;
import java.util.Vector;
import javax.swing.JPanel;

/**
 *
 * @author palacioscuacialpud
 */
public class Circulo extends JPanel{
     Vector vectorcartesian=new Vector();
     Vector vectorcordenadasjava=new Vector();
      
      public Circulo(){}
//      
     public Vector getCordenadasX(){
        return vectorcartesian;
     }  
   
     public Vector getCordenadasjava(){
        return vectorcordenadasjava;
     }
     
     public void crearCirculo( int radio, int radioy){
        
     int x,y;
     double yr,yj,yjava,yseva,ylista = radioy,yenviar;
      x = 0;
      y = radio;
      yr = radio ;
      yj=radio;
      
     while (x < yr){
        x = x + 1;
        yr = Math.sqrt(radio*radio-x*x);
        yj=Math.sqrt(radio*radio-x*x);
        yjava=(long)yj;
        yseva=yj-(double)yjava;
        
        y = (int)Math.round(yr);
       yenviar= Math.rint((ylista=ylista+yseva)*10)/10;
        vectorcartesian.add(new Point(x, y));
        
       vectorcordenadasjava.add(new Point.Double(x, yenviar) );
                
     }  
    
     
     }
     
     
     
   
}
