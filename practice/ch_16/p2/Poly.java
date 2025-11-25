package practice.ch_16.p2;

public class Poly {
    
    public static void main(String args[ ])
    {
        //create sub class object t
        Two t = new Two();

        //call calculate() method using t
        t.calculate(25);
    }
}
//Dynamic polymorphism
class One
{
    //method to calculate square value
    void calculate(double x)
    {
        System.out.println("Square value= " + (x*x));
    }
}

class Two extends One
{
    //method to calculate square root value
    void calculate(double x)
    {
        System.out.println("Square root= " + Math.sqrt(x));
    }
}


