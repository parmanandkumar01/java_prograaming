package practice.ch_28.p16;
//Listbox demo
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class JListDemo extends JFrame implements ListSelectionListener
{
    //vars
    JList lst;
    JLabel lb1;
    Object arr[];
    String msg;

    JListDemo()
    {
        //create content pane
        Container c = getContentPane();

        //do not set any layout to c
        c.setLayout(null);

        //create an array with items list
        String items[] = {"India", "America", "Germany", "Japan",
                          "France"};

        //create a Jlist box with the items
        lst = new JList(items);

        //set the location of list box
        lst.setBounds(100,50,100,100);

        //add list to the container
        c.add(lst);

        //create an empty label
        lb1 = new JLabel();

        //set the location of label
        lb1.setBounds(50,200,400,40);

        //add the label to content pane
        c.add(lb1);

        //attach item listener to list box
        lst.addListSelectionListener(this);

        //close the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void valueChanged(ListSelectionEvent le)
    {
        //know which items are selected
        arr = lst.getSelectedValues();

        //retrieve selected items and add to string msg
        for(int i=0; i<arr.length; i++)
            msg = ""+arr[i];

        //display the selected items in the label
        lb1.setText("You selected :"+msg);
    }

    public static void main(String args[])
    {
        //create the frame
        JListDemo demo = new JListDemo();
        demo.setTitle("My acomb box");
        demo.setSize(400,400);
        demo.setVisible(true);
    }
}
