package practice.ch_6;

public class Demo12 {
    public static void main(String[] args) {
        int i = 1, j;
        lb1: while (i <= 3) {
            System.out.println(i); // i values changes from 1 to 3
            lb2: for ( j = 0; j <= 5; j++) {
                System.out.println("\t " + j);// j2 values from 1 to 5 for every i values
                if (j==3) { // j values change up to 3 only
                    i++;
                    continue lb1;
                }
            }
            i++;
            System.out.println("--------------------------------------------");
        }
    }
}
