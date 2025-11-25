package practice.ch_27.p24;

// This is Frame2
import java.awt.*;
import java.awt.event.*;

class Frame2 extends Frame implements ActionListener
{
    // create a button
    Button b;

    Frame2()
    {
        // set layout to flow layout
        setLayout(new FlowLayout());

        // create the button
        b = new Button("Back");

        // add it to the frame
        add(b);

        // add action listener to button
        b.addActionListener(this);

        // window closing behavior
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae)
    {
        // remove this frame from memory and close it
        this.dispose();
    }
}

