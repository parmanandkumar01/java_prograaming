package practice.ch_15.p6;

// calling super class parameterized constructor from sub class
public class Supper {
    public static void main(String[] args) {
        // create sub class object
        Two t = new Two(11, 22);
        // call sub class method
        t.show();
    }

}

class One {
    // super class var
    int i;

    One() {

    }

    // super class para constructor
    One(int i) {
        this.i = i;
    }
}

class Two extends One {
    // sub class var
    int i;

    // sub class para construtor
    Two() {
    }

    Two(int a, int b) {
        super(a); // call super class construcotr and pass a
        i = b; // initialize sub class var
    }

    // show class method
    void show() {
        System.out.println("sub class i = " + i);
        System.out.println("super class var i " + super.i);
    }
}