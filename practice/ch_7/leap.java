package practice.ch_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// leap year or not 
public class leap {
    public static void main(String[] args) throws IOException {
        // accept year
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Enter Year no : ");
        int year = Integer.parseInt(br.readLine());

        // if it is centuary year and divisible by 400
        if (year % 100 == 0 && year % 400 == 0)
            System.out.println(" it is leap year ");
        // if it is not a centuary year and divisible by 4
        else if (year % 100 != 0 && year % 4 == 0)
            System.out.println(" it is leap year ");
        else
            System.out.println(" it is no leap year");
    }
}
