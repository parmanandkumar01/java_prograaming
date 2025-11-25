
package practice.ch_15.p7;
// private and protected 
public class Test {
    public static void main(String[] args) {
        Sub s = new Sub();
    }
}

class Access {
    private int a;
    protected int b;
}

class Sub extends Access {
    public void get() {
        // System.out.println(a);// error - a is private
        System.out.println(b);
    }
}