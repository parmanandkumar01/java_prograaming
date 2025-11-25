package practice.ch_6;
// to test if a number is positive or negative

public class Demo {

    public static void main(String[] args) {
        int num = -5; // declare and initialize num to -5
        if (num == 0) {
            System.out.println("It is zero");

        } else if (num > 0) {
            System.out.println(num + " is positive");
        } else {
            System.out.println(num + " number is negative");
        }
    }
}
