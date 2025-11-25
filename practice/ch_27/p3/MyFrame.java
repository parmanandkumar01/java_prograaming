package practice.ch_24.p3;

// creating a frame version 2
import java.awt.*;
import java.awt.event.*;

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
        // close the frame
        f.addWindowListener(new Myclass());
    }
}

class Myclass implements WindowListener
{
    public void windowActivated(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public void windowDeactivated(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
}
