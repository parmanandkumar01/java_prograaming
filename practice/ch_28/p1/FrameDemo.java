package practice.ch_28.p1;

//A simple frame
import javax.swing.*;

public class FrameDemo {
        public static void main(String args[]) {
                // create the frame with title
                JFrame obj = new JFrame("My frame");

                // set the size to 200 by 200 px
                obj.setSize(500, 500);

                // display the frame
                obj.setVisible(true);
        }
}
