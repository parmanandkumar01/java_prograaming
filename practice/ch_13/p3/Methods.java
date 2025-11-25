package practice.ch_13.p3;
/*

Program -3: Wrika program for a meth04 with two parameters and return type
 */

// understanding the methods

class Sample {
    // method to calculate sum of num1 and num2
    // this method accepts two double values
    // and also returns the double type result

    double sum( double num1 , double num2)
    {
        double res = num1 + num2;
        return  res; // return result
    }
}

public class Methods {
    public static void main(String[] args) {
        // create the object and pass values 10 and 22.5 to the constructor
        Sample s = new Sample();
        // call the method and pas two values to 
        // the method. store the return result in x 
        double x = s.sum(10,22.5);
        System.out.println("sum " + x);

    }

}
