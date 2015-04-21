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
            
      drawCircle(new Point(0, 0), 90, 3, Color.RED, Color.BLACK);
      drawCircle(new Point(120, 10), 90, 3, Color.RED, Color.BLACK);
      drawCircle(new Point(250, 50), 80, 5, Color.RED, Color.BLACK);
      
      drawBox(new Point(350, 20), 120, 120, Color.LIGHT_GRAY, Color.RED);
      drawBox(new Point(230, 160), 200, 200, Color.LIGHT_GRAY, Color.RED);
      drawBox(new Point(10, 120), 200, 200, Color.LIGHT_GRAY, Color.RED);
      
      fourCircle();
   }
   
   public static void drawCircle(Point anchor, int diameter, int concentricCount, Color fillColor, Color lineColor)
   {  
      g.setColor(fillColor);
      
      g.fillOval(anchor.x, anchor.y, diameter, diameter);         
      
      g.setColor(lineColor);      
      
      for (int i = 0; i <= concentricCount - 1; i++)
      {         
         g.drawOval(
            diameter / (2 * concentricCount) * i + anchor.x,
            diameter / (2 * concentricCount) * i + anchor.y,
            diameter / concentricCount * (concentricCount - i) ,
            diameter / concentricCount * (concentricCount - i)
            );                        
      }   
   }
   
   public static void drawBox(Point anchor, int h, int w, Color fillColor, Color lineColor)
   {
      g.setColor(fillColor);
      
      g.fillRect(anchor.x, anchor.y, h, w);
            
      g.setColor(lineColor);
      
      g.drawRect(anchor.x, anchor.y, h, w);
   
   }
   
   public static void fourCircle()   
   {      
      drawCircle(new Point(10, 120), 100, 10, Color.RED, Color.BLACK);
      
      drawCircle(new Point(110, 120), 100, 10, Color.RED, Color.BLACK);
      
      drawCircle(new Point(10, 220), 100, 10, Color.RED, Color.BLACK);
      
      drawCircle(new Point(110, 220), 100, 10, Color.RED, Color.BLACK);
      
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