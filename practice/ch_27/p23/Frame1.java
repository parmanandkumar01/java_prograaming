package practice.ch_27.p23;// This is Frame1
import java.awt.*;
import java.awt.event.*;

class Frame1 extends Frame implements ActionListener
{
    // variables
    Button b1, b2;

    Frame1()
    {
        setLayout(null);

        // create two buttons
        b1 = new Button("Next");
        b2 = new Button("Close");

        // set the location of buttons
        b1.setBounds(100, 100, 70, 40);
        b2.setBounds(200, 100, 70, 40);

        // add them to frame
        add(b1);
        add(b2);

        // add action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);

        // window close support
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae)
    {
        // if Next button is clicked, display Frame2
        if (ae.getSource() == b1)
        {
            Frame2 f2 = new Frame2();
            f2.setSize(400, 400);
            f2.setVisible(true);
        }
        else
        {
            // if Close button is clicked, exit
            System.exit(0);
        }
    }

    public static void main(String args[])
    {
        Frame1 f1 = new Frame1();
        f1.setSize(500, 500);
        f1.setTitle("First Frame");
        f1.setVisible(true);
    }
}


// ---------- Frame2 Class (Missing in Book Code) ----------
class Frame2 extends Frame
{
    Frame2()
    {
        setLayout(new FlowLayout());
        add(new Label("This is Frame 2"));

        // window close support
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();  // close only this window
            }
        });
    }
}
