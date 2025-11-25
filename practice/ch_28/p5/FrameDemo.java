package practice.ch_28.p5;

//A simple frame with background color and text
import javax.swing.*;
import java.awt.*; //Container class

public class FrameDemo extends JFrame {
    // vars
    JLabel lbl;

    FrameDemo() {
        // create content pane
        Container c = this.getContentPane();

        // set the layout manager to c
        c.setLayout(new FlowLayout());

        // set background color for content pane c
        c.setBackground(Color.green);

        // create a label with some text
        lbl = new JLabel("Hello Learners!");

        // set Font for label
        lbl.setFont(new Font("Helvetica", Font.BOLD, 34));

        // set red color for label
        lbl.setForeground(Color.red);

        // add the label to content pane
        c.add(lbl);
    }

    public static void main(String args[]) {
        // create the frame
        FrameDemo obj = new FrameDemo();

        // set a title for the frame
        obj.setTitle("My swing frame");

        // set the size to 300 by 300 px
        obj.setSize(300, 300);

        // display the frame
        obj.setVisible(true);

        // close the application upon clicking on close button of frame
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
