package practice.ch_13.p4;
/* 
 * Program 4: -Write ~ program for a static method that accepts data and returns the resUlt-

 */

// understanding the methods

class Sample {
    // static method should be declared as static
    static double sum(double num1, double num2) {
        double res = num1 + num2;
        return res; // return result

    }
}

public class Methods {
    public static void main(String[] args) {
        // call the static method using classname.methods()
        double x = Sample.sum(10, 22.5);
        System.out.println("Sum " + x);

    }

}
