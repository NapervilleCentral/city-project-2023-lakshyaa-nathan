import java.awt.*;
    import java.util.*;
    
    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
/**
 * Write a description of class Floor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Street extends JComponent implements Runnable
{
    // instance variables 
    private int x,y,w,h;

    /**
     * Constructor for objects of class Street
     */
    public Street(int xcoord, int ycoord, int width, int height)
    {
        x = xcoord;
        y = ycoord;
        w = width;
        h = height;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        // required we are using Graphics2D objects
        
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method 
        
        draw(g2);
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void setX(int running)
    {
        // update the objects in the cityscape so they are animated
        
        
        
        
        repaint();
    }
    
       //-----------------------------------------------------------------
       //  Draws the street + curb
       //-----------------------------------------------------------------
       public void draw (Graphics2D page)
       {
          //page.setColor(Color.gray);
          Color graystreet = new Color (105,105,105);
          page.setColor(graystreet);
          
          
          //       point  start  -> go this far, add to x, y 
          //            10,10       50,50    -> goes to 60,60 from 10,10  
          page.fillRect(x, y,       w, h); //.drawRect
          
          
          Color lightercurb = new Color(224, 224, 224);
          page.setColor(lightercurb);
          page.fillRect(0,650,1500, 20); //like a curb
          
          int rect = 20;
          int rectspace = 10;
          while(rect>0){
              page.setColor(Color.white);
              page.fillRect(rectspace,725,30,15);
              rect-=1;
              rectspace+=100;
          }
       }
       
    public void run()
    {
        int running  = 0;
    while(true){
        
        
        
        
        repaint();
    }
  
    }
}
