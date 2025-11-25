package practice.ch_13.p15;
/*
 * let us try to interchange teo integer 10 and 20 by passing them to swap() method
 */
// Primitive data types are passed to methods by value

class check
{
    // to interchange num1 and num2 values
    void swap ( int num1 , int num2)
    {
        int temp; // take a temporry variablwe 
        temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
public class PassPrimitive {
    public static void main(String[] args) {
        // take two primitve data types
        int num1 = 10, num2 = 20;

        // create check class object 
        check obj = new check();
        // display data before calling
        System.out.println("Num " +num2);
    }
    
}
