package practice.ch_9;

import java.io.IOException;
import java.util.Scanner;

// Searching  for a stringg - linear search
public class Search1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // ask how many strings
        System.out.println("How many strings?");
        int n = sc.nextInt();

        // create a string type array with size n
        String str[] = new String[n];

        // store strings into str[]
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a string: ");
            str[i] = sc.next();
        }
        // accept the string to search
        System.out.println(" Enter string to search: ");
        String search = sc.next();
        // take a boolean var
        boolean found = false;
        // search for the string in str[]
        for (int i = 0; i < n; i++) {
            if (search.equalsIgnoreCase(str[i])) {
                System.out.println("found at position " + (i + 1));
                found = true; // string found
            }
        }
        // if not found , display message
        if (!found)
            System.out.println("Not found in the group ");
    }

}
