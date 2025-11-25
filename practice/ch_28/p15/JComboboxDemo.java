package practice.ch_28.p15;
//Combobox demo
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JComboboxDemo extends JFrame implements ItemListener
{
        //Vars
        JComboBox box;
        JLabel lb1;

        JComboboxDemo()
        {
                //create content pane
                Container c = getContentPane();

                //do not set any layout to c
                c.setLayout(null);

                //create an empty combobox
                box = new JComboBox();

                //add items to it
                box.addItem("India");
                box.addItem("America");
                box.addItem("Germany");
                box.addItem("Japan");
                box.addItem("France");

                //set the location of combo box
                box.setBounds(100,50,100,40);

                //add combo box to the container
                c.add(box);

                //create an empty label
                lb1 = new JLabel();

                //set the loacation of label
                lb1.setBounds(100,200,200,40);

                //add the label to content pane
                c.add(lb1);

                //attach item listener to combo box
                box.addItemListener(this);

                //close the frame
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public void itemStateChanged(ItemEvent ie)
        {
                //know which item is selected
                String str = (String)box.getSelectedItem();

                //display the selected item in the label
                lb1.setText("You selected: "+str);
        }

        public static void main(String args[])
        {
                //create the frame
                JComboboxDemo demo = new JComboboxDemo();
                demo.setTitle("My Combo box");
                demo.setSize(500,400);
                demo.setVisible(true);
        }
}
