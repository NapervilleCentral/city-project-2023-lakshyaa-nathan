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
public class windows extends JComponent implements Runnable
{
    // instance variables 
    private int windowplace;
    private Color yellowwindows;

    /**
     * Constructor for objects of class Street
     */
    public windows(int buildingX)
    {
        windowplace = buildingX;
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
        // update the objects in the cityscape so they are animated
        // ...
        
        if (running % 2 == 0)
            yellowwindows = new Color(51,51,0);
        else
            yellowwindows = new Color(255,255,153);
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }
    
       //-----------------------------------------------------------------
       //  Draws the windows
       //-----------------------------------------------------------------
       public void draw (Graphics2D page)
       {
          
          yellowwindows = new Color (255,255,153);
          page.setColor(yellowwindows);
          
          
          //       point  start  -> go this far, add to x, y 
          //            10,10       50,50    -> goes to 60,60 from 10,10  
          //page.fillRect(x, y,       w, h); //.drawRect
          
          page.fillRect(windowplace+10,500,20,20);
          
          page.fillRect(windowplace+40,600,20,20);
          
          page.fillRect(windowplace+70,400,20,20);
          
          page.fillRect(windowplace+100,450,20,20);
          
          page.fillRect(windowplace+130,350,20,20);
          
          page.fillRect(windowplace+160,700,20,20);
          
          page.fillRect(windowplace+60,300,20,20);
       }
       
    public void run()
    {
        int running  = 0;
    while(true){
        
        
        
        
        
        if(running % 2 == 0)
            yellowwindows = new Color(51,51,0);
        else
            yellowwindows = new Color(255,255,153);
        running ++;
            
        
        repaint();
    }
  
    }
}