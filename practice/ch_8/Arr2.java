package practice.ch_8;

import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {
        // to accept data from keyboard
        Scanner sc = new Scanner(System.in);
        // ask how many subjects
        System.out.println(" how many subjects ?");
        int n = sc.nextInt();
        // create 1D array with size n
        int[] marks = new int[n];
        // store the elements into the array
        for (int i = 0; i < n; i++) {
            System.out.println("enter marks: ");
            marks[i] = sc.nextInt();
        }

        // find total marks
        int tot = 0;
        for (int i = 0; i < n; i++) {
            tot = tot + marks[i];
        }
        // display total marks
        System.out.println("total marks = " + tot);
        // find the percentage
        float percentage = (float) tot / n;
        System.out.println(" percentage = " + percentage);
    }
}
