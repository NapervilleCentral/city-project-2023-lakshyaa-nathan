//********************************************************************
//  LineUp.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of a graphical object.
//********************************************************************

    import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class Line_up extends JComponent //implements Runnable
{
   private final int APPLET_WIDTH = 400;    //Size constants
   private final int APPLET_HEIGHT = 150;
   private final int HEIGHT_MIN = 100;
   private final int VARIANCE = 45;
   private int X=0, Y=0, W = 0, H = 0;
   Color myColor;
   Random generator = new Random();
   Graphics page;

   
   private Building building1, building2, building3, building4;
  
   private Sky sky;
   private int running = 0;

   
   
   //-----------------------------------------------------------------
   //  Creates several buildings with varying characteristics.
   //-----------------------------------------------------------------
   public Line_up () //init in applet is like constructor; runs only once
   {                   //Different than start.
     

      building1 = new Building (51, 200, Color.red);
      //width height color
      building2 = new Building(52, 300, Color.black);
      building3 = new Building(53, 400, Color.black);
      building4 = new Building(54, 500, Color.black);

    
      sky = new Sky(X, Y, W, H);
      
      
      


   }

   //-----------------------------------------------------------------
   //  Paints the stick figures on the applet.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics g)
    {
        Graphics2D page = (Graphics2D) g;
       
      building1.draw(page);
      building2.draw(page);
      building3.draw(page);
      building4.draw(page);
      
      sky.draw(page);
      
   }
 
   }

   
 
