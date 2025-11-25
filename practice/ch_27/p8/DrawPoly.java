package practice.ch_27.p8;
//Drawing a smilie in a frame
import java.awt.*;
import java.awt.event.*;
public class DrawPoly extends Frame
{
    DrawPoly()
    {
        //close the frame
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        //set red color
        g.setColor(Color.red);

        //display a filled rounded rectangle
        g.fillRoundRect(30,30,250,250,30,30);

        //set green color
        g.setColor(Color.green);

        //take x and y coordinates in arrays
        int x[] = {40,200,40,100};
        int y[] = {40,40,200,200};

        //there are 4 pairs of x,y coordinates
        int num = 4;

        //create filled polygon connecting the coordinates
        g.fillPolygon(x, y, num);
    }

    public static void main(String args[])
    {
        //create the frame
        DrawPoly d = new DrawPoly();

        //set the size and title
        d.setSize(400,400);
        d.setTitle("My Polygon");

        //display the frame
        d.setVisible(true);
    }
}
