    //********************************************************************
    //  StickFigure.java       Author: Lewis/Loftus/Cocking
    //
    //  Represents a graphical stick figure.
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
       private int height;    // height of building
       Random generator = new Random();

       //-----------------------------------------------------------------
       //  Sets up the stick figure's primary attributes.
       //-----------------------------------------------------------------
       public Building (int center, int bottom, Color shade, int size)
       {
          baseX = center;
          baseY = bottom;
          color = shade;
          height = size;
       }

       /**
        * setHeight method
        */
       public void setHeight(int size){
           //for (int i = 0; i<10000;i++)
           //{
           height = size;
           System.out.println(color);
          //}
       }

       /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     * @param g a reference to the Graphics object used for all drawing operations
     *
     */
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
        // ...
        //height = 100 +generator.nextInt(45);



        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

       //-----------------------------------------------------------------
       //  Draws this figure relative to baseX, baseY, and height.
       //-----------------------------------------------------------------
       public void draw (Graphics2D page)
       {
          //int top = baseY - height;  // top of head
                                     //y needs to move, not height.

          page.setColor (color);
          //                 x     y    h  w
          page.fillRect(baseX,baseY , height, 300);// building 
                // don't use some parameters, make sure parameters are useful
          
        
       }

       
       public void run()
        {
        while(true){
            int newHeight = 100 + generator.nextInt(45);
            height = newHeight;
            try{
                Thread.sleep(17);
            }catch (Exception e){}

            System.out.print(height);
        }

        }
        
    }
