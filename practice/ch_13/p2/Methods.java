package practice.ch_13.p2;
/*
 * Write a program for a method without "pararileters but with return type.

 */

// understanding the methods

class Sample {
    // instance variables
    private double num1, num2;
    // parameterized contructor

    Sample(double x, double y) {
        num1 = x;
        num2 = y;
    }

    // methods to calculata sum of num1 num2
    // this methods does not accept any values and
    // return return result

    double sum() {
        double res = num1 + num2;
        return res; // return result

    }
}

public class Methods {
    public static void main(String[] args) {
        // create the object and pass values 10 and 22.5 to the constructor
        Sample s = new Sample(10, 22.5);
        // call the method and store the result in x
        double x = s.sum();
        System.out.println("sum " + x);

    }

}
