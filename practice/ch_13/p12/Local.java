package practice.ch_13.p12;

/* 
 * let us make a program to access an instance variable x and 
 * a local variable a from the method access()
 */
class Sample {

    // x is instance variable
    private int x;

    // a is local variable
    void modify(int a) {
        x = a;
    }

    // we can access x , but no a.
    void access() {
        System.out.println("x = " + x);
        // System.out.println(" a = " + a);
    }
}

public class Local {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.modify(10);
        s.access();
    }

}
