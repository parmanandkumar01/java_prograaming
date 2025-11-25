package practice.ch_28.p4;
//A simple frame with background color and text
import javax.swing.*;
import java.awt.*; //Container class
class MyPanel extends JPanel
{
    MyPanel()
    {
        this.setBackground(Color.green);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.setFont(new Font("Helvetica", Font.BOLD, 34));
        g.drawString("Hello Learners!", 50, 100);
    }
}

public class FrameDemo extends JFrame
{
    FrameDemo()
    {
        //Create content pane
        Container c = this.getContentPane();

        //Create MyPanel object and add it to c
        MyPanel mp = new MyPanel();
        c.add(mp);
    }

    public static void main(String args[])
    {
        //create the frame
        FrameDemo obj = new FrameDemo();

        //set a title for the frame
        obj.setTitle("My swing frame");

        //set the size to 300 by 300 px
        obj.setSize(300,300);

        //display the frame
        obj.setVisible(true);

        //Close the application upon clicking on close button of frame
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
