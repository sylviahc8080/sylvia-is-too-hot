// Hsin-Ting Chen #1366957
// CSE142 Section BL Spring 2015
// HW3: Doddle April 21th
// This program prints out a 


import java.awt.*;

public class Illusion 
{
   static DrawingPanel panel = new DrawingPanel(500, 400);
   
   static Graphics g;

   public static void main(String[] args) 
   {
      g = panel.getGraphics();
      
      panel.setBackground(Color.GRAY);
      firstShape(0, 0, 90, 3);
      firstShape(120, 10, 90, 3);
      firstShape(250, 50, 80, 5);
      
      rect(350, 20, 120, 120);
      rect(230, 160, 200, 200);
      rect(10, 120, 200, 200);
      
      fourCircle();
   }
   
   public static void firstShape(int x, int y, int s, int t)
   {  
      g.setColor(Color.RED);
      g.fillOval(x, y, s, s);
         
      
      g.setColor(Color.BLACK);
      
      
      for (int i = 0; i <= t - 1; i++)
      {         
         g.drawOval( s / (2 * t) * i + x, s / (2 * t) * i + y, s / t * (t - i) , s / t * (t - i));
                        
      }  
      
   }
   
   public static void rect(int x, int y, int h, int w)
   {
      g.setColor(Color.LIGHT_GRAY);
      g.fillRect( x, y, h, w);
            
      g.setColor(Color.RED);
      g.drawRect( x, y, h, w);
   
   }
   
   public static void fourCircle()   
   {      
      firstShape(10, 120, 100, 10);
      firstShape(110, 120, 100, 10);
      firstShape(10, 220, 100, 10);
      firstShape(110, 220, 100, 10);
      
   }

/*    int a = (x, y + s / 2);
      
      int b = (x + s / 2, y);
      
      int c = (x + s, y + s / 2);
      
      int d = (x + s / 2, y + s);
       
      g.drawLine(a, b);
      
      g.drawLine(b, c);
      
      g.drawLine(c, d);
      
      g.drawLine(d, a);
      
      */

}