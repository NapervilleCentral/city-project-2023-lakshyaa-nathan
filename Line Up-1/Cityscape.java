import javax.swing.JFrame;
import java.awt.*;


public class Cityscape 
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 180;

    public static void main(String [] args)throws InterruptedException{
        JFrame frame = new JFrame();
        
        frame.setSize(500 /* x */, 500 /* y */);
        frame.setTitle("Cityscape");
        frame.setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent();
        
        
        LineUp row = new LineUp();
        //frame.add(component);
        frame.add(row);
        
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            row.nextFrame();
            Thread.sleep(100);
        }
        
    }
}
