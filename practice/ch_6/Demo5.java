package practice.ch_6;

public class Demo5 {
    public static void main(String[] args) {
        int x = 1;
        for (;;) {
            System.out.println(x);
            x++;
            if (x > 10) {
                break; // if x value exceeds 10 , then come out of the loop
            }
        }
    }

}
