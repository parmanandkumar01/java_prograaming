package practice.ch_27.p17;
//Radio buttons demo
import java.awt.*;
import java.awt.event.*;
public class Mynadio extends Frame implements ItemListener
{
        //vars
        String msg="";
        CheckboxGroup cbg;
        Checkbox y,n;

        Mynadio()
        {
                //set the layout to flow layout
                setLayout(new FlowLayout());

                //create CheckboxGroup object
                cbg = new CheckboxGroup();

                //create 2 radio buttons
                y = new Checkbox("Yes", cbg,true);
                n = new Checkbox("No",  cbg, false);

                //add the radio buttons to frame
                add(y);
                add(n);

                //add item listener to the radio buttons
                y.addItemListener(this);
                n.addItemListener(this);

                //close the frame
                addWindowListener(new WindowAdapter()
                {
                        public void windowClosing(WindowEvent we)
                        {
                                System.exit(0);
                        }
                });
        } //end of constructor

        //this method is called when a radio button is clicked
        public void itemStateChanged(ItemEvent ie)
        {
                repaint(); //call paint()
        }

        //display the selected radio label
        public void paint(Graphics g)
        {
                msg= "Current selection: ";
                msg+= cbg.getSelectedCheckbox().getLabel();
                g.drawString(msg,10,100);
        }

        public static void main(String args[])
        {
                //create frame
                Mynadio mr = new Mynadio();
                mr.setTitle("My radio buttons");
                mr.setSize(400,400);
                mr.setVisible(true);
        }
}
