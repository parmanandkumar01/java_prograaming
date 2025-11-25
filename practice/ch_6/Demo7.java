package practice.ch_6;

// To diplay stars in triangular form-nested for loop
public class Demo7 {
    public static void main(String[] args) {
        int r = 5; // we want 5 rows
        for (int i = 1; i <= r; i++) { // i represent the row
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
