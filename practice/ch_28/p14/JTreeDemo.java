package practice.ch_28.p14;
//Tree demo
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;  //TreeSelectionListener
import javax.swing.tree.*;   //TreePath

public class JTreeDemo extends JFrame implements TreeSelectionListener
{
    //vars
    DefaultMutableTreeNode root,dir1,dir2,file1,file2,file3;
    JTree tree;
    Container c;
    String msg="";
    JTextArea ta;

    JTreeDemo()
    {
        //create content pane c
        c = getContentPane();

        //set border layout to c
        c.setLayout(new BorderLayout());

        //create root node
        root = new DefaultMutableTreeNode("C:\\");

        //create other nodes
        dir1 = new DefaultMutableTreeNode("JavaPrograms");
        dir2 = new DefaultMutableTreeNode("Other Programs");
        file1 = new DefaultMutableTreeNode("IntroductionToJava.java");
        file2 = new DefaultMutableTreeNode("CheckBoxDemo.java");
        file3 = new DefaultMutableTreeNode("xyz.c");

        //add dir1 to root node
        root.add(dir1);

        //add other nodes to dir1
        dir1.add(file1);
        dir1.add(file2);
        dir1.add(file3);

        //add file3 as a node in dir2
        dir2.add(file3);

        //create the tree from root node
        tree = new JTree(root);

        //add the tree to container
        c.add("North", tree);

        //create 3 empty labels and add to container
        ta = new JTextArea();
        c.add("South", ta);

        //add tree selection listener to the tree
        tree.addTreeSelectionListener(this);

        //close the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //this method belongs to tree selection listener
    public void valueChanged(TreeSelectionEvent tse)
    {
        //let us find out the newly selected item path
        TreePath tp = tse.getNewLeadSelectionPath();
        msg = "Path of selected component = ";
        msg += tp.getPathComponent(0);
        msg += "\nComponent selected = ";
        msg += tp.getPathComponent(1);
        msg += "\nLevel of component = ";
        msg += tp.getPathCount();

        //Send the user selection to the label
        ta.setText(msg);
    }

    public static void main(String args[])
    {
        //create the frame
        JTreeDemo td = new JTreeDemo();
        td.setSize(400,300);
        td.setTitle("Java JTree");
        td.setVisible(true);
    }
}
