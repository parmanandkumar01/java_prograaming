package practice.ch_27.p15;

//Push buttons
import java.awt.*;
import java.awt.event.*;

public class Mybuttons extends Frame implements ActionListener {
    // Vars
    Button b1, b2, b3;

    Mybuttons() {
        // do not set any layout
        // this.setLayout(null);

        // OR using FlowLayout (from the next cropped page)
        this.setLayout(new FlowLayout());

        // create 3 push buttons
        b1 = new Button("Yellow");
        b2 = new Button("Blue");
        b3 = new Button("Pink");

        // add the buttons to the frame
        this.add(b1);
        this.add(b2);
        this.add(b3);

        // add action listener to the buttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        // close the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // end of constructor

    // this method is called when a button is clicked
    public void actionPerformed(ActionEvent ae) {
        // Know the button clicked by user

        // VERSION FROM THE CROPPED PAGE:
        if (ae.getSource() == b1)
            setBackground(Color.yellow);
        if (ae.getSource() == b2)
            setBackground(Color.blue);
        if (ae.getSource() == b3)
            setBackground(Color.pink);

        // refresh the frame
        repaint();
    }

    public static void main(String args[]) {
        // create the frame
        Mybuttons mb = new Mybuttons();
        mb.setSize(400, 400);
        mb.setTitle("My buttons");
        mb.setVisible(true);
    }
}
