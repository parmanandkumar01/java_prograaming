package practice.ch_14;

public class Relate1 {
    
}

class One {
    // instance variables
    int x;
    Two t; // class Two's reference

    One(Two t) {
        this.t = t;
        x = 10;
    }

    // method to display class One and class Two var
    void display() {
        System.out.println("One's x = " + x);
        // call class Two's method
        t.display();
        // access class Two's var
        System.out.println("Two's var = " + t.y);
    }
}

class Two {
    // instance variable
    int y;

    // initialize y
    Two(int y) {
        this.y = y;
    }

    // method to display y
    void display() {
        System.out.println("Two's y = " + y);
    }
}