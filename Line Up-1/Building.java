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
       private int W;     // center of figure
       
       private Color color;   // color of stick figure
       private int H;    // height of stick figure
       //Random generator = new Random();

       //-----------------------------------------------------------------
       //  Sets up the stick figure's primary attributes.
       //-----------------------------------------------------------------
       public Building (int width, int height, Color shade)
       {
          W = width;
          
          color = shade;
          H = height;
       }

       /**
        * setHeight method
        */
       /*
       public void setHeight(int size){
           //for (int i = 0; i<10000;i++)
           //{
           height = size;
           System.out.println(color);
          //}
       }
*/
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

   
       //-----------------------------------------------------------------
       //  Draws this figure relative to baseX, baseY, and height.
       //-----------------------------------------------------------------
       public void draw (Graphics2D page)
       {
          //int top = baseY - height;  // top of head
                                     //y needs to move, not height.

          page.setColor (color);
          
          //                 x     y    h  w
          
             
          

       }

       
       public void run()
        {
        while(true){
            //int newHeight = 100 + generator.nextInt(45);
            //H = newHeight;
            try{
                Thread.sleep(17);
            }catch (Exception e){}

            System.out.print(H);
        }

        }
        
    }
