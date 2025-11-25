package practice.ch_28.p18;
//Menu creation
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class MyMenu extends JFrame implements ActionListener
{
    //vars
    JMenuBar mb;
    JMenu file, edit, font;
    JMenuItem op, sa, cl, cp, pt, f1, f2;
    JCheckBoxMenuItem pr;

    MyMenu()
    {
        //create container
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        //create a menubar
        mb = new JMenuBar();

        //add menubar to container
        c.add("North", mb);

        //create the File, Edit menus and attach them to menubar
        file = new JMenu("File");
        edit = new JMenu("Edit");
        mb.add(file);
        mb.add(edit);

        //create menu items
        op = new JMenuItem("Open");
        sa = new JMenuItem("Save");
        cl = new JMenuItem("Close");
        cp = new JMenuItem("Copy");
        pt = new JMenuItem("Paste");

        //add open, save, close to file menu
        file.add(op);
        file.add(sa);
        file.add(cl);

        //add copy, paste to edit menu
        edit.add(cp);
        edit.add(pt);

        //make Close disabled
        cl.setEnabled(false);

        //create Print checkbox and add it to file menu
        pr = new JCheckBoxMenuItem("Print");
        file.add(pr);

        //add a separator (horizontal line) to file menu
        file.addSeparator();

        //create a Font submenu and add it to File menu
        font = new JMenu("Font");
        file.add(font);

        //create menu items
        f1 = new JMenuItem("Arial");
        f2 = new JMenuItem("Times New Roman");

        //add menu items to sub menu
        font.add(f1);
        font.add(f2);

        //attach listeners to all menu items
        op.addActionListener(this);
        sa.addActionListener(this);
        cl.addActionListener(this);
        cp.addActionListener(this);
        pt.addActionListener(this);
        pr.addActionListener(this);
        f1.addActionListener(this);
        f2.addActionListener(this);

        //close frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //this method is executed when a menu item is clicked
    public void actionPerformed(ActionEvent ae)
    {
        //know which menu item is clicked
        if(op.isArmed()) this.openFile();
        if(sa.isArmed()) this.saveFile();

        if(cl.isArmed()) System.out.println("Close is selected");
        if(cp.isArmed()) System.out.println("Copy is selected");
        if(pt.isArmed()) System.out.println("Paste is selected");

        if(pr.getModel().isSelected())
            System.out.println("Printing on");
        else
            System.out.println("Printing off");

        if(f1.isArmed()) System.out.println("Arial Font is selected");
        if(f2.isArmed()) System.out.println("Times New Roman is selected");
    }

    //this method is called when File->Open is selected
    void openFile()
    {
        //create an object to JFileChooser class
        JFileChooser fc = new JFileChooser();

        //display file open dialog box
        int i = fc.showOpenDialog(this);

        //if the user selected a file name then
        if(i == JFileChooser.APPROVE_OPTION)
        {
            //get the selected file into File object
            File f = fc.getSelectedFile();

            //the file name is given by f.getName()
            //File name with path is given by f.getPath()
            String fname = f.getPath();

            //open another frame and pass the fname to it
            OpenFrame of = new OpenFrame(fname);

            of.setSize(500,400);
            of.setVisible(true);
        }
    }

    void saveFile()
    {
        JFileChooser fc = new JFileChooser();
        int i = fc.showSaveDialog(this);

        if(i == JFileChooser.APPROVE_OPTION)
        {
            try{
                File f = fc.getSelectedFile();
                FileWriter fw = new FileWriter(f);

                fw.write("Sample file content saved"); // placeholder
                fw.close();

                System.out.println("File saved");
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String args[])
    {
        //create the frame
        MyMenu mm = new MyMenu();
        mm.setTitle("Menu demo");
        mm.setSize(500,400);
        mm.setVisible(true);
    }
}

//this is another class which creates another frame
//to display file contents
class OpenFrame extends JFrame
{
    //catch the file name
    OpenFrame(String fname)
    {
        //create content pane
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //create a text area and add to content pane
        TextArea ta = new TextArea(22,60);
        c.add(ta);

        //vars
        String str = "";
        String str1 = "";

        try{
            //create reader to read from file
            BufferedReader br = new BufferedReader(new FileReader(fname));

            //read string by string and add to str1
            while((str = br.readLine()) != null)
                str1 = str1 + "\n" + str;

            //display the file content in text area
            ta.setText(str1);

            //close the file
            br.close();
        }
        catch(Exception e){}
    }
}
