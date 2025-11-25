package practice.ch_28.p6;
/* Understanding the borders */
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;

public class BorderDemo extends JFrame
{
    //vars
    JButton b1, b2, b3, b4, b5, b6, b7, b8;

    BorderDemo()
    {
        //create content pane
        Container c = getContentPane();

        //set a layout for content pane
        c.setLayout(new FlowLayout());

        //create new buttons
        b1 = new JButton("Raised Bevel Border");
        b2 = new JButton("Lowered Bevel Border");
        b3 = new JButton("Raised Etched Border");
        b4 = new JButton("Lowered Etched Border");
        b5 = new JButton("Line Border");
        b6 = new JButton("Matte Border");
        b7 = new JButton("Compound Border");
        b8 = new JButton("Empty Border");

        //set raised bevel border for b1 with high light color and shadow color
        b1.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED,
                Color.red, Color.green));

        //set lowered bevel border for b2 with its current background highlight and shadow
        b2.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        //set raised etched border for b3 with high light color red and shadow color red
        b3.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED,
                Color.red, Color.red));

        //set lowered etched border for b4 with its current background highlight and shadow
        b4.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        //set line border for b5 with red color and width 5 px
        b5.setBorder(BorderFactory.createLineBorder(Color.red, 5));

        //set matte border for b6 with top, left, bottom, right widths as 5 px and color red
        b6.setBorder(BorderFactory.createMatteBorder(5, 10, 15, 20, Color.red));

        //set compound border for b7 without any borders inside or outside
        b7.setBorder(BorderFactory.createCompoundBorder());

        //set empty border for b8 without any space for border
        b8.setBorder(BorderFactory.createEmptyBorder());

        //add buttons to the container
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
        c.add(b6);
        c.add(b7);
        c.add(b8);

        //close the frame upon clicking
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
        //create a frame
        BorderDemo obj = new BorderDemo();

        //set a title for frame
        obj.setTitle("Borders Frame");

        //set the size to 300 by 300 px
        obj.setSize(300, 300);

        //display the frame
        obj.setVisible(true);
    }
}
