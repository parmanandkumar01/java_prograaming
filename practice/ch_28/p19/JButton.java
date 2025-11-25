package practice.ch_28.p19;

//A toggle button with start and stop images
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButton extends JFrame implements ActionListener {
    // vars
    JToggleButton but;
    ImageIcon img1;

    JButton() {
        // create content pane with flow layout
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // image with start signal
        img1 = new ImageIcon("start.gif");

        // create toggle button with start image
        but = new JToggleButton("Start/Stop", img1);

        // add button to content pane
        c.add(but);

        // add action listener to button
        but.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        // image with stop signal
        ImageIcon img2 = new ImageIcon("stop.gif");

        // if toggle button is selected display stop signal image
        // else display start signal image
        if (but.isSelected())
            but.setIcon(img2);
        else
            but.setIcon(img1);
    }

    public static void main(String args[]) {
        // create the frame
        JButton demo = new JButton();
        demo.setSize(400, 400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
