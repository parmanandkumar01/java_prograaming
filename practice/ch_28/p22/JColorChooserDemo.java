package practice.ch_28.p22;
//JColorChooser demo
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JColorChooserDemo extends JFrame implements ActionListener
{
    //vars
    JButton b;
    Container c;

    JColorChooserDemo()
    {
        //create the content pane
        c = getContentPane();
        c.setLayout(new FlowLayout());

        //create a push button
        b = new JButton("Select a Color");

        //add button to content pane
        c.add(b);

        //add action listener to button
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        //take the initial color as null
        Color selectedColor = null;

        //create the color chooser with dialog box to select a color
        Color color = JColorChooser.showDialog(this, "Select a Color",
                                               selectedColor);

        //if color is not null then some color is selected
        if(color != null)
        {
            //get the selected color
            selectedColor = color;

            //show background color of frame with the selected color
            c.setBackground(color);
        }
    }

    public static void main(String args[])
    {
        //create the frame
        JColorChooserDemo demo = new JColorChooserDemo();
        demo.setSize(400,400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
