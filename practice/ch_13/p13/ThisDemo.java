package practice.ch_13.p13;

/*
 * write a program to use this to refer the current class parameterized
 * contructor a this(), its method as this.method() and its instance variable as this.variable
 */
// this - refers to all the members of present class
class Sample {
    // x is instance variable
    private int x;

    // default construcotor
    Sample() {
        this(55); // call present class para constructor and send 55
        this.access();// call present class method
    }

    // parameterized contructor
    Sample(int x) {
        this.x = x; // refer present class instancce variable
    }
    // method 
    void access()
    {
        System.out.println("x = " +x);
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Sample s = new Sample();
    }

}
