package practice.ch_27.p5;

//Creating a frame and closing it.
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame {

    public static void main(String args[]) {
        // create a frame with title
        MyFrame f = new MyFrame();

        // set a title for the frame
        f.setTitle("My AWT frame");

        // set the size of the frame
        f.setSize(300, 250);

        // display the frame
        f.setVisible(true);

        // close the frame. here myclass name is not mentioned but its object is passed to the method
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}


