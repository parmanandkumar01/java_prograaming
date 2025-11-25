package practice.ch_21.p9;

public class ThrowDemo {

    public static void main(String args[]) {
        Sample.demo();
    }
}

// using throw
class Sample {
    static void demo() {
        try {
            System.out.println("Inside demo()");
            throw new NullPointerException("Exception data");
        } catch (NullPointerException ne) {
            System.out.println(ne);
        }
    }
}
