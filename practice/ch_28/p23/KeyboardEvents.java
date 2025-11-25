package practice.ch_28.p23;//To catch some of the keys of the keyboard

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyboardEvents extends JFrame implements KeyListener {
    // Vars
    Container c;
    JTextArea ta;
    String str = "";

    KeyboardEvents() {
        // create content pane
        c = getContentPane();

        // create a text area and set some font to it
        ta = new JTextArea("Press a key");
        ta.setFont(new Font("Arial", Font.BOLD, 30));

        // add text area to content pane
        c.add(ta);

        // add key listener to text area
        ta.addKeyListener(this);
    }

    public void keyPressed(KeyEvent ke) {
        // get the key code of the key pressed on keyboard
        int keycode = ke.getKeyCode();

        // find which key is pressed
        if (keycode == KeyEvent.VK_F1)
            str = "F1 key";
        if (keycode == KeyEvent.VK_F2)
            str = "F2 key";
        if (keycode == KeyEvent.VK_F3)
            str = "F3 key";
        if (keycode == KeyEvent.VK_PAGE_UP)
            str = "Page Up";
        if (keycode == KeyEvent.VK_PAGE_DOWN)
            str = "Page Down";
        if (keycode == KeyEvent.VK_ALT)
            str = "Alter";
        if (keycode == KeyEvent.VK_HOME)
            str = "Home";
        if (keycode == KeyEvent.VK_END)
            str = "End";

        ta.setText(str);
        str = "";
    }

    public void keyReleased(KeyEvent ke) {
    }

    public void keyTyped(KeyEvent ke) {
    }

    public static void main(String args[]) {
        // create the frame
        KeyboardEvents kbe = new KeyboardEvents();
        kbe.setSize(400, 400);
        kbe.setVisible(true);
        kbe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
