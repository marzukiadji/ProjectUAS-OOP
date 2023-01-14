package SMD1;

import javax.swing.JFrame;
import java.awt.*;

public class Gui extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 800;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;

    private void changeBg(){
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.CYAN);
    }

    public Gui(){
        //set the frame default properties
        setTitle("PRIMAYA HOSPITAL");
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);

        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        changeBg();
    }
    
}