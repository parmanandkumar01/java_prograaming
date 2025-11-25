package practice.ch_27.p19;
//Choice box demo
import java.awt.*;
import java.awt.event.*;
public class Mychoice extends Frame implements ItemListener
{
    //Vars
    String msg;
    Choice ch;

    Mychoice()
    {
        //set flow layout to frame
        setLayout(new FlowLayout());

        //create an empty choice menu
        ch = new Choice();

        //add some items to choice menu
        ch.add("English");
        ch.add("Hindi");
        ch.add("Telugu");
        ch.add("Sanskrit");
        ch.add("French");

        //add the choice menu to frame
        add(ch);

        //add item listener to choice menu
        ch.addItemListener(this);

        //close the frame
        addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent we)
                {
                    System.exit(0);
                }
            });
    }

    //this method is called when any item is clicked
    public void itemStateChanged(ItemEvent ie)
    {
        //call paint() method
        repaint();
    }

    //display selected item from the choice menu
    public void paint(Graphics g)
    {
        g.drawString("Selected language: ", 10, 100);
        msg = ch.getSelectedItem();
        g.drawString(msg, 10, 120);
    }

    public static void main(String args[])
    {
        //create a frame
        Mychoice mc = new Mychoice();
        mc.setTitle("My choice box");
        mc.setSize(400, 300);
        mc.setVisible(true);
    }
}
