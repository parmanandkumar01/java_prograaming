package practice.ch_21.p3;

// Logical error
public class Error {
    public static void main(String[] args) {
        double sal = 5000.00;
        sal = sal * 15 / 100; // wrong use : sal +=sal*15/100;
        System.out.println("Incremented salary " + sal);
    }

}