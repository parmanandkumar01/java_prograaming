package practice.ch_13.p5;
/* 
write a program to test whether a static method can access the instance variable or not
 */

// Static method trying to acccess instance variable

class Test {
    // instance var
    int x;

    // parameterized constructor
    Test(int x) {
        this.x = x;
    }

    // static method accessing x value
    static void access() {
        // System.out.println("x = " + x); // x is not accessible

    }

}

public class Demo {
    public static void main(String[] args) {

        Test obj = new Test(55);
        Test.access();

    }

}
