package practice.ch_28.p20;
//JToggleButton
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ProgressDemo extends JFrame implements ActionListener
{
    //vars
    JButton b;
    JProgressBar bar;

    ProgressDemo()
    {
        //create content pane with flow layout
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //create a button
        b = new JButton("Click repeatedly");

        //create a progress bar
        bar = new JProgressBar();

        //set gray as foreground color
        bar.setForeground(Color.gray);

        //display the percentage string
        bar.setStringPainted(true);

        //add button and progress bar to c
        c.add(b);
        c.add(bar);

        //add action listener to button
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        //every time the button is clicked,
        //increment the progress bar value by 5
        bar.setValue(bar.getValue() + 5);
    }

    public static void main(String args[])
    {
        //create the frame
        ProgressDemo d = new ProgressDemo();
        d.setSize(400,400);
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
