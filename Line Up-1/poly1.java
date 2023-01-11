
import java.awt.*;
import java.util.*;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class poly1 extends JComponent implements Runnable
{
    // instance variables - replace the example below with your own
    private int[] xPos = {95, 105, 110, 90};
    private int[] yPos = {45, 45, 70, 70};

    private Color myColor;
    
    
    /**
     * Constructor for objects of class poly1
     */
    public poly1(Color myColor)
    {
         this.myColor = myColor;
         
    }

    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
         
         draw(g2);
        }
    
    public void draw (Graphics2D page)
    {
        page.setColor(myColor);
        page.fillPolygon(xPos, yPos, xPos.length);
    }
    
    public void run(){
    
    }
    
}
