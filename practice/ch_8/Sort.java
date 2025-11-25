package practice.ch_8;
// write a program which performs sorting of group of integer values using bubble sort technique

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {

        // to accept data from keyboard
        Scanner sc = new Scanner(System.in);
        // create an int type array
        System.out.println(" how many elements ? ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // accept integer elements into the array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter int: ");
            arr[i] = sc.nextInt();
        }
        // use bubble sort technique to sort the integers
        int limit = n - 1; // element from 0 to n-1
        boolean flag = false;// if it is true swapping done
        int temp; // temporary variable
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit - i; j++) {
                // if first element is bigger than secon one , then swap
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true; // true -> swapping done

                }
            }
            if (flag == false)
                break; // no swapping, so come out
            else
                flag = false;// assign initial value

        }
        // display the sorting array
        System.out.println("The sorted array is ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
