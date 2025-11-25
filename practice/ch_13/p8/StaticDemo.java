package practice.ch_13.p8;

/* 
 * let us make a program by taking a static variable x in the Test class
 * 
 */
// class variables
class Test {
    // class var
    static int x = 10;

    // display the variable
    static void display() {
        System.out.println(x);

    }
}

public class StaticDemo {

    public static void main(String[] args) {
        // create two references
        Test obj1, obj2;
        // create two objects
        obj1 = new Test();
        obj2 = new Test();

        // increment x in obj1

        ++obj1.x;
        System.out.println("x in obj1 ");
        obj1.display();
        // diplay x in obj2
        System.out.println("x in obj2 ");
        obj2.display();
    }
}