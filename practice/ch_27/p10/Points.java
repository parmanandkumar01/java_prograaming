package practice.ch_27.p10;
//Displaying a group of dots on black screen
import java.awt.*;
import java.awt.event.*;
public class Points extends Frame
{
    public void paint(Graphics g)
    {
        //set white color for dots
        g.setColor(Color.white);

        for(;;) //display dots forever
        {
            //generate x, y coordinates randomly. Maximum 800 and 600 px
            int x = (int) (Math.random() * 800);
            int y = (int) (Math.random() * 600);

            //Use drawLine() to display a dot
            g.drawLine(x, y, x, y);
            try{
                //make a time delay of 20 milliseconds
                Thread.sleep(20);
            }catch(InterruptedException ie){}
        }
    }

    public static void main(String args[])
    {
        //create frame
        Points obj = new Points();
        //set black background color for frame
        obj.setBackground(Color.black);
        //set the size and title for frame
        obj.setSize(500,400);
        obj.setTitle("Random dots");
        //display the frame
        obj.setVisible(true);
    }
}
