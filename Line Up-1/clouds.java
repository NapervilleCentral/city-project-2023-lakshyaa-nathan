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
public class clouds extends JComponent implements Runnable
{
    // instance variables 
    private int bubble;

    /**
     * Constructor for objects of class Street
     */
    public clouds(int size)
    {
        bubble = size;
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
            bubble +=20;
        else
            bubble -= 20;
        
        
        
       
        repaint();
    }
    
       //-----------------------------------------------------------------
       //  Draws the clouds
       //-----------------------------------------------------------------
       public void draw (Graphics2D page)
       {
          page.setColor(Color.white);
          
          page.fillOval(260,100, bubble+20, bubble);
          page.fillOval(240,120, bubble, bubble+13);
          page.fillOval(210,130, bubble+10, bubble);
          page.fillOval(220,110, bubble, bubble+10);
          page.fillOval(250,120, bubble+15, bubble);
          
          page.fillOval(560,150, bubble+20, bubble);
          page.fillOval(540,170, bubble, bubble+13);
          page.fillOval(510,180, bubble+10, bubble);
          page.fillOval(520,160, bubble, bubble+10);
          page.fillOval(550,170, bubble+15, bubble);
          
          
          page.fillOval(710,200, bubble+20, bubble);
          page.fillOval(690,220, bubble, bubble+13);
          page.fillOval(660,230, bubble+10, bubble);
          page.fillOval(670,210, bubble, bubble+10);
          page.fillOval(700,220, bubble+15, bubble);
          
          
          
          page.fillOval(860,250, bubble+20, bubble);
          page.fillOval(840,270, bubble, bubble+13);
          page.fillOval(810,280, bubble+10, bubble);
          page.fillOval(820,260, bubble, bubble+10);
          page.fillOval(850,270, bubble+15, bubble);
          
          
          
          page.fillOval(360,150, bubble+20, bubble);
          page.fillOval(340,170, bubble, bubble+13);
          page.fillOval(310,180, bubble+10, bubble);
          page.fillOval(320,160, bubble, bubble+10);
          page.fillOval(350,170, bubble+15, bubble);
          
          
          
          
          
    }
    
    
    public void run()
    {
        int running  = 0;
    while(true){
        // change the x value to move back and forth 
        
        
        
        
        if(running % 2 == 0)
            bubble +=20;
        else
            bubble -= 20;
        running ++;
        
        
        
        repaint();
    }
  
    }
}