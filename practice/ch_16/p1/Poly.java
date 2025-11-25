package practice.ch_16.p1;
// Dynamic polymorphism
public class Poly{
    
        public static void main(String args[ ])
    {
        //create Sample class object
        Sample s = new Sample();

        //call add() and pass two values
        s.add(10,15);   //This call is bound with first method

        //call add() and pass three values
        s.add(10,15,20); //This call is bound with second method
    }
}
//Dynamic polymorphism
class Sample
{
    //method to add two values
    void add(int a, int b)
    {
        System.out.println("Sum of two= " + (a+b));
    }

    //method to add three values
    void add(int a, int b, int c)
    {
        System.out.println("Sum of three= " + (a+b+c));
    }
}




