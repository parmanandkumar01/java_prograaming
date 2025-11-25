package practice.ch_28.p8;
//Button which displays image when clicked
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class ButtonDemo1 extends JFrame implements ActionListener
{
    JButton b;
    JLabel lbl;

    ButtonDemo1()
    {
        //create container
        Container c = getContentPane();

        //set a Layout for container
        c.setLayout(new FlowLayout());

        //store the image into ImageIcon object
        ImageIcon i1 = new ImageIcon("car2.gif");

        //create the button with the image
        b = new JButton("Click Me", i1);

        //set background and foreground colors for button
        b.setBackground(Color.yellow);
        b.setForeground(Color.red);

        //set font for the label of button
        b.setFont(new Font("Arial", Font.BOLD, 30));

        //set bevel border for button
        Border bd = BorderFactory.createBevelBorder(BevelBorder.RAISED);
        b.setBorder(bd);

        //set tool tip text for button
        b.setToolTipText("This is a button");

        //set a short cut key for button. Alt+C will invoke the button
        b.setMnemonic('C');

        //add the button to the container
        c.add(b);

        //add action listener to button
        b.addActionListener(this);

        //create an empty label and add to the content pane
        lbl = new JLabel();
        c.add(lbl);

        //close the frame upon clicking
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
        //set some image to the label. This image is displayed when the
        //button is clicked
        ImageIcon i1 = new ImageIcon("car2.gif");
        lbl.setIcon(i1);
    }

    public static void main(String args[])
    {
        //create a frame
        ButtonDemo1 obj = new ButtonDemo1();
        obj.setTitle("My Button");
        obj.setSize(500, 400);
        obj.setVisible(true);
    }
}
