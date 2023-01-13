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
   Random generator = new Random();
   //Graphics page;

   //private StickFigure2 figure1 = new StickFigure2(100,150,Color.red,120);
   private Building building1, building2, building3, building4;
   //private Floor ground;
   private int running = 0;

   
   
   //-----------------------------------------------------------------
   //  Creates several stick figures with varying characteristics.
   //-----------------------------------------------------------------
   public Line_up () //init in applet is like constructor; runs only once
   {                   //Different than start.
      int h1,h2,h3,h4;  // heights of buildings 

      
      /**
      h1 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h2 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h3 = HEIGHT_MIN + generator.nextInt(VARIANCE);
      h4 = HEIGHT_MIN + generator.nextInt(VARIANCE);
**/

      building1 = new Building (51, 200, Color.red);
      //width height color
      building2 = new Building(52, 300, Color.black);
      building3 = new Building(53, 400, Color.black);
      building4 = new Building(54, 500, Color.black);

      //ground = new Floor();
      //myImage = new poly1(Color.yellow);
      
      
      //Thread t1 = new Thread(ground);
      //t1.start();
      //Thread t2 = new Thread(figure2);
      //t2.start();
      //Thread t3 = new Thread(figure3);
      //t3.start();
      
      //Thread t4 = new Thread(figure4);
      //t4.start();

      //Thread t5 = new Thread(figure5);
      //t5.start();
      //setBackground (Color.black); //sets the color of background
      //setSize (APPLET_WIDTH, APPLET_HEIGHT); //Sets up applet window

      //figure2.draw(page);


   }

   //-----------------------------------------------------------------
   //  Paints the stick figures on the applet.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics g)
    {
        Graphics2D page = (Graphics2D) g;
       //page = this.page;
      //ground.draw(page);
      building1.draw(page);
      building2.draw(page);
      building3.draw(page);
      building4.draw(page);
      //myImage.draw(page);
      //ground.draw(page);

      //Thread t1 = new Thread(ground);
      //t1.start();

      /*
      int newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure1.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure2.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure3.setHeight(newHeight);
      newHeight = HEIGHT_MIN + generator.nextInt(VARIANCE);
      figure4.setHeight(newHeight);
      */
      //try{
          //pause program for quarter-sec (in miliseconds)
          //Thread.sleep(250);
        //}
      //catch(InterruptedException e){}

      //figure1.draw(page);

      //repaint(); //IMPORTANT LINE
   }

   public void nextFrame()
   {
       //figure1.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //figure2.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //figure3.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //figure4.setHeight(HEIGHT_MIN + generator.nextInt(VARIANCE));
       //running ++;
       //ground.setX(running);
       //Thread t1 = new Thread(ground);
       //t1.start();

       repaint();

   }

   public void run()
   {
       int running = 0;
       while(true){
           if (running%2==0){
               myColor = Color.yellow;
           }
           else
               myColor = Color.red;
               
           running++;
           
           try{ 
               Thread.sleep(500);
       } catch(Exception e){}
       
       System.out.println(myColor);
    }
}
}
