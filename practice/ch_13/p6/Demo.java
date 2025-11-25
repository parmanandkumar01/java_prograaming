package practice.ch_13.p6;
/* 
write a program to test whether a static method can access the instance variable or not
 */

// Static method trying to acccess instance variable

class Test {
    // instance var
    static int x=55;

    // parameterized constructor
    Test(int x) {
        this.x = x;
    }

    // static method accessing x value
    static void access() {
        System.out.println("x = " + x);

    }

}

public class Demo {
    public static void main(String[] args) {

        Test obj = new Test(55);
        Test.access();

    }

}
