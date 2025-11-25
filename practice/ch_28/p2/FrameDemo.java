package practice.ch_28.p2;

//A simple frame
import javax.swing.*;

public class FrameDemo extends JFrame {
        public static void main(String args[]) {
                // create the frame
                FrameDemo obj = new FrameDemo();

                // set a title for the frame
                obj.setTitle("My swing frame");

                // set the size to 200 by 200 px
                obj.setSize(200, 200);

                // display the frame
                obj.setVisible(true);

                // Close the application upon click
                obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
