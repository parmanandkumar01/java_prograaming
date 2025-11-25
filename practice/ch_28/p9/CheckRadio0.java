package practice.ch_28.p9;

/*Check boxes. radio buttons and Text area */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckRadio0 extends JFrame implements ActionListener {
        // Vars
        JCheckBox cb1, cb2;
        JRadioButton rb1, rb2;
        JTextArea ta;
        ButtonGroup bg;
        String msg0;

        CheckRadio0() {
                // create the content pane
                Container c = getContentPane();

                // set Flow layout to content pane
                c.setLayout(new FlowLayout());

                // create a text area with 10 rows and 20 chars per row
                ta = new JTextArea(10, 20);

                // create two check boxes
                cb1 = new JCheckBox("Java", true);
                cb2 = new JCheckBox("J2EE");

                // create two radio buttons
                rb1 = new JRadioButton("Male", true);
                rb2 = new JRadioButton("Female");

                // create a button group and add the radio buttons to it
                bg = new ButtonGroup();
                bg.add(rb1);
                bg.add(rb2);

                // add the checkboxes, radio buttons, textarea to the container
                c.add(cb1);
                c.add(cb2);
                c.add(rb1);
                c.add(rb2);
                c.add(ta);

                // add action listeners. we need not add listener to text area
                // since the user clicks on the checkboxes or radio buttons only
                rb2.addActionListener(this);
                cb2.addActionListener(this);
                cb1.addActionListener(this);
                rb1.addActionListener(this);

                // close the frame upon clicking
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public void actionPerformed(ActionEvent ae) {
                // know which components are selected by user
                if (cb1.getModel().isSelected())
                        msg0 = "\nJava";
                if (cb2.getModel().isSelected())
                        msg0 = "\nJ2EE";
                if (rb1.getModel().isSelected())
                        msg0 = "\nMale";
                else
                        msg0 = "\nFemale";

                // display the selected message in text area
                ta.setText(msg0);

                // reset the message to empty string
                msg0 = "";
        }

        public static void main(String args[]) {
                // create a frame
                CheckRadio0 cr = new CheckRadio0();
                cr.setTitle("My checkboxes and Radio buttons");
                cr.setSize(500, 400);
                cr.setVisible(true);
        }
}
