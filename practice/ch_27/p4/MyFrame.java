package practice.ch_27.p4;
//Creating a frame and closing it.
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{

    public static void main(String args[])
    {
        //create a frame with title
        MyFrame f = new MyFrame();

        //set a title for the frame
        f.setTitle("My AWT frame");

        //set the size of the frame
        f.setSize(300,250);

        //display the frame
        f.setVisible(true);

        //close the frame
        f.addWindowListener(new Myclass());
    }
}

class Myclass extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}
