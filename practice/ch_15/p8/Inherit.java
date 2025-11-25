package practice.ch_15.p8;



public class Inherit {
    
    public static void main(String args[])
    {
        //display area of square
        Square s = new Square(5.5);
        s.area();

        //display area of rectangle
        Rectangle r = new Rectangle(5.5, 6);
        r.area();
    }
}
//Shape is the super class for Square
//And Square is the super class for Rectangle
class Shape
{
    //take protected type var
    protected double l;

    //parameterized constructor
    Shape(double l)
    {
        this.l = l;
    }
}

class Square extends Shape
{
    //call Shape's constructor and send l value
    Square(double l)
    {
        super(l);
    }

    //calculate area of square
    void area()
    {
        //because of inheritance, 'l' of Shape class is available
        System.out.println("Area of Square = " + (l * l));
    }
}

class Rectangle extends Square
{
    //var
    private double b;

    //call Square's constructor and send x value
    Rectangle(double x, double y)
    {
        super(x);
        b = y;
    }

    //calculate area of rectangle
    void area()
    {
        //because of inheritance, 'l' of Shape class is available
        System.out.println("Area of Rectangle = " + (l * b));
    }
}

