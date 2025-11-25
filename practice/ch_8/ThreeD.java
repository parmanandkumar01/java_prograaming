package practice.ch_8;

// thre dimension array
public class ThreeD {
    public static void main(String[] args) {
        // take a 3D array
        int x[][][] = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
                { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
                { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } } };
        // display the array elements
        System.out.println("in matrix form ");
        for (int i = 0; i < 3; i++) { // rows
            for (int j = 0; j < 3; j++) {// column
                for (int k = 0; k < 3; k++) {

                    System.out.print(x[i][j][k] + "\t");
                }
            }
            System.out.println();
        }
    }
}
