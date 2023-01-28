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
   Color myColor;
   clouds cloud;
   Street street;
   sunsetskytrial SKY;
   windows window;
   
   
   
   private Building building1, building2, building3, building4, building5;
   private windows window1, window2, window3, window4, window5;
   private Sky sky;
   
   private int running = 0;

   
   
   //-----------------------------------------------------------------
   //  Creates several stick figures with varying characteristics.
   //-----------------------------------------------------------------
    public Line_up () //init in applet is like constructor; runs only once
   {                   //Different than start.
      
      sky = new Sky(0, 0);
      SKY = new sunsetskytrial();
        // x, y, width, height, color
        
        
      Color mygray = new Color(119,136,153);
      building1 = new Building (150, 200,200, 600,  Color.black);
     
    
      building2 = new Building(400, 250,200, 600,  mygray);
      building3 = new Building(650, 225,200 , 500, Color.black);
      building4 = new Building(950, 125, 200, 650, Color.black);
      building5 = new Building(1200, 300, 200, 700, mygray);
      
      window2 = new windows(building2.getBuildingX());
      window1 = new windows(building1.getBuildingX());
      
      window3 = new windows(building3.getBuildingX());
      window4 = new windows(building4.getBuildingX());
      window5 = new windows(building5.getBuildingX());
      
      
      
      
      cloud = new clouds(60);
      
      street = new Street(0, 650,1500 , 250);
      
      
      
      Thread t2 = new Thread(window1);
      t2.start();
      Thread t3 = new Thread(window2);
      t3.start();
      
      Thread t4 = new Thread(window3);
      t4.start();

      Thread t5 = new Thread(window4);
      t5.start();
      
      
      
      Thread t6 = new Thread(cloud);
      t6.start();
      
      Thread t1 = new Thread(window5);
      t1.start();
      
     

      


   }

   //-----------------------------------------------------------------
   //  Paints the figures on the applet.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics g)
    {
        Graphics2D page = (Graphics2D) g;
       
     
      sky.draw(page);
      SKY.draw(page);
      cloud.draw(page);
      building1.draw (page);
      building2.draw (page);
      building3.draw (page);
      building4.draw (page);
      building5.draw(page);
      window1.draw(page);
      window2.draw(page);
      window3.draw(page);
      window4.draw(page);
      window5.draw(page);
      street.draw(page);
      
      

      
      try{
          //pause program for quarter-sec (in miliseconds)
          Thread.sleep(250);
        }
      catch(InterruptedException e){}

      

      repaint(); 
   }

   public void nextFrame()
   {
      

       repaint();

   }

   public void run()
   {
       int running = 0;
       while(true){
           
          
       
    }
    
  }

    }
