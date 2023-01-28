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
public class Sky extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private int xlevel, ylevel,radius;

    /**
     * Constructor for objects of class Sky
     */
    public Sky(int xcoord, int ycoord)
    {
        xlevel = xcoord;
        ylevel = ycoord;
        
    }

    @Override
    public void paintComponent(Graphics g)
    {
        // required we are using Graphics2D objects
        
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
    public void setX(int running)
    {
        
        repaint();
    }
    
       //-----------------------------------------------------------------
       //  Draws this figure relative to baseX, baseY, and height.
       //-----------------------------------------------------------------
       public void draw (Graphics2D page)
       {
          Color skyblue = new Color (102,178,255);
          page.setColor(skyblue);
          
          page.fillRect(xlevel, ylevel, 1500, 1500);
       }
       
    public void run()
    {
        int running  = 0;
    while(true){
        
        //repaint();
    }
  
    }
}
