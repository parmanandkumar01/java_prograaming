package practice.ch_8;

import java.util.Scanner;

// Transpose of a matrix
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // accept the row and columns of a matrix
        System.out.println("Enter rows,columns?");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        // accept a matrix from keyboard
        System.out.println("Enter elemts of matrix ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(" The transpose matrix : ");

        // take columns as rows and vice versa and display
        for (int i = 0; i < c; i++) { // rows
            for (int j = 0; j < r; j++) {// column
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }
    }

}
