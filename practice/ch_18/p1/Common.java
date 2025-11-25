//All the objects sharing the same method
package practice.ch_18.p1;
class Common
{
    public static void main(String args[ ])
    {
        //create 3 objects
        Myclass obj1 = new Myclass();
        Myclass obj2 = new Myclass();
        Myclass obj3 = new Myclass();

        //call calculate() method from the objects
        obj1.calculate(3);
        obj2.calculate(4);
        obj3.calculate(5);
    }
}
class Myclass
{
    //method to calculate square value
    void calculate(double x)
    {
        System.out.println("Square= " + (x * x));
    }
}


