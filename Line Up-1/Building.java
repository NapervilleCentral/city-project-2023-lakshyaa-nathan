    //********************************************************************
    //  StickFigure.java       Author: Lewis/Loftus/Cocking
    //
    //  Represents a graphical building.
    //********************************************************************

    import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

public class Building extends JComponent implements Runnable
    {
       private int baseX;     // center of building
       private int baseY;     // floor (bottom of building)
       private Color color;   // color of building 
       private int height, width;    // height and width of building
       Random generator = new Random();

       //-----------------------------------------------------------------
       //  Sets up the building's primary attributes.
       //-----------------------------------------------------------------
       public Building (int xcoord, int ycoord,int W , int H,Color shade)
       {
          baseX = xcoord;
          baseY = ycoord;
          color = shade;
          height = H;
          width = W;
       }

       
       
       public int getBuildingX(){
           return this.baseX;
       }
       
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        // invoke the draw method
        // ...
        draw(g2);


    }

    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        


        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

       //-----------------------------------------------------------------
       //  Draws this figure relative to baseX, baseY, height, and width.
       //-----------------------------------------------------------------
       public void draw (Graphics2D page)
       {
          

          page.setColor (color);
          //                 x     y    h  w
          page.fillRect(baseX,baseY , width, height);// building 
               
          
        
       }

       
       public void run()
        {
        while(true){
            
            
        }

        }
        
    }
