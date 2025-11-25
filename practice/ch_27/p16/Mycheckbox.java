package practice.ch_27.p16;
//Checkbox demo
import java.awt.*;
import java.awt.event.*;
public class Mycheckbox extends Frame implements ItemListener
{
    //Vars
    String msg="";

    Checkbox c1,c2,c3;

    Mycheckbox()
    {
        //set flow layout manager
        setLayout(new FlowLayout());

        //display 3 checkboxes
        c1 = new Checkbox("Bold", true);
        c2 = new Checkbox("Italic");
        c3 = new Checkbox("Underline");

        //add the check boxes to the frame
        add(c1);
        add(c2);
        add(c3);

        //add item listener to the check boxes
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        //close the frame
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    } //end of constructor

    //this method is called the user clicks on a check box
    public void itemStateChanged(ItemEvent ie)
    {
        repaint(); //call paint() method
    }

    //display current state of checkboxes
    public void paint(Graphics g)
    {
        g.drawString("Current state: ", 10,100);
        msg = "Bold: " + c1.getState();
        g.drawString(msg, 10,120);

        msg = "Italic: " + c2.getState();
        g.drawString(msg, 10,140);

        msg = "Underline: " + c3.getState();
        g.drawString(msg, 10,160);
    }

    public static void main(String args[])
    {
        //create the frame
        Mycheckbox mc = new Mycheckbox();
        mc.setTitle("My checkbox");
        mc.setSize(400,400);
        mc.setVisible(true);
    }
}
