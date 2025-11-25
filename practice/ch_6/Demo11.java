package practice.ch_6;

// Numbers in descending order wile using continue
public class Demo11 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            if (i > 5) {
                continue; // go back in the loop
            }
            System.out.print(i + " ");
        }
    }
}
