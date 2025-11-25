package practice.ch_10;

// To compose full name of a person
import java.io.*;
import java.util.Scanner;

public class Full {
    public static void main(String[] args) throws IOException {
        // create empty string buffere object
        StringBuffer sb = new StringBuffer();
        // to accept data from keyboard
        Scanner sc = new Scanner(System.in);
        // accept surname
        System.out.println("Enter surname : ");
        String sur = sc.next();
        // accept middlename
        System.out.println("Enter midname ");
        String mid = sc.next();
        // accept lastnmae
        System.out.println("Enter lastName");
        String last = sc.next();

        // append sur to sb
        sb.append(sur);
        // append last to sb
        sb.append(last);

        // display the name till now
        System.out.println("Name " + sb);

        // insert mid after sur name in sb
        int n = sur.length(); // n represent no of chars in sur name
        sb.insert(n, mid); // insert mid name after nth character
        // display full name
        System.out.println("Full Name = " + sb);
        // reverse and display the name
        System.out.println("In reverse = " + sb.reverse());

    }

}
