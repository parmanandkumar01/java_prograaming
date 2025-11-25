package practice.ch_28.p3;
//A simple frame with background color
import javax.swing.*;
import java.awt.*;   // container class
public class FrameDemo extends JFrame
{
    public static void main(String args[])
    {
        //create the frame
        FrameDemo obj = new FrameDemo();

        //create content pane. It is nothing 
        Container c = obj.getContentPane();

        //set green background color to c
        c.setBackground(Color.green);

        //set a title for the frame
        obj.setTitle("My swing frame");

        //set the size to 200 by 200 px
        obj.setSize(200,200);

        //display the frame
        obj.setVisible(true);

        //close the application upon clicking on close button of frame
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
