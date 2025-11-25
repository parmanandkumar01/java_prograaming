package practice.ch_28.p17;

//Menu demo
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu file, edit, format, font, size;
    JMenuItem i1, i2, i3, i4, i5;
    JCheckBoxMenuItem cb;
    JRadioButtonMenuItem rb1, rb2;

    MenuDemo() {
        // create container
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        // create menubar
        mb = new JMenuBar();
        // add menubar to container
        c.add("North", mb);

        // create two file edit menus
        file = new JMenu("File");
        edit = new JMenu("Edit");

        // add them to menubar
        mb.add(file);
        mb.add(edit);

        // create menu items
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Close");
        i5 = new JMenuItem("Quit");

        // add menu items to file menu
        file.add(i1);
        file.add(i2);
        file.add(i3);
        file.add(i4);
        file.add(i5);

        // make close disabled
        i4.setEnabled(false);

        // create checkbox and add to file menu
        cb = new JCheckBoxMenuItem("Print");
        file.add(cb);

        // add a separator (horizontal line) to file menu
        file.addSeparator();

        // create a font menu and add it to file menu
        font = new JMenu("Font");
        file.add(font);

        // add items to font menu
        JMenuItem f1 = new JMenuItem("Arial");
        JMenuItem f2 = new JMenuItem("Times New Roman");
        JMenuItem f3 = new JMenuItem("Courier");

        font.add(f1);
        font.add(f2);
        font.add(f3);

        // attach action listeners to all menu items
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        cb.addActionListener(this);
        f1.addActionListener(this);
        f2.addActionListener(this);
        f3.addActionListener(this);

        // close frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // this method is executed when a menu item is clicked
    public void actionPerformed(ActionEvent ae) {
        if (i1.getModel().isArmed())
            System.out.println("New is selected");
        if (i2.getModel().isArmed())
            System.out.println("Open is selected");
        if (i3.getModel().isArmed())
            System.out.println("Save is selected");
        if (i4.getModel().isArmed())
            System.out.println("Close is selected");
        if (i5.getModel().isArmed())
            System.out.println("Quit is selected");

        if (cb.getModel().isSelected())
            System.out.println("Printing On...");
        else
            System.out.println("Printing Off...");

        if (ae.getSource() == ae.getSource()) {
        }
    }

    public static void main(String args[]) {
        // create the frame
        MenuDemo md = new MenuDemo();
        md.setSize(400, 300);
        md.setTitle("Menu Demo");
        md.setVisible(true);
    }
}
