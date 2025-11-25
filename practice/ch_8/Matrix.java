package practice.ch_8;

//Write a program to take a 2D array and display its elements in the forin of a matrix. 
public class Matrix {
    public static void main(String[] args) {
        // take a 2D array
        int x[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // read and display the array elements
        System.out.println("in matrix form ");
        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) {// column
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
