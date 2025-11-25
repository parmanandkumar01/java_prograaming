package practice.ch_27.p2;

// creating a frame version 2
import java.awt.*;

public class MyFrame extends Frame {
    // call super class constructor to store tile
    MyFrame(String str) {
        super(str);
    }

    public static void main(String[] args) {
        // create a frame with title
        MyFrame f = new MyFrame("My AWT frame");
        // set the size of the frame
        f.setSize(300, 250);
        // display the frame
        f.setVisible(true);
    }
}