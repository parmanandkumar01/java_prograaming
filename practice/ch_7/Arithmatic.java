package practice.ch_7;
// performing arithmatic operation

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Arithmatic {
    public static void main(String[] args) throws IOException {
        // to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        // ask for input and seperate by commas
        System.out.println("Enter two nummber ");
        // accept input into a string
        String str = br.readLine();
        // use StringTokenizer to split input at comma
        StringTokenizer st = new StringTokenizer(str, ",");

        // we will have 2 tokens as strings

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        // trim any spaces before and after the tokens
        s1 = s1.trim();
        s2 = s2.trim();

        // convert the s1 and s2 into double type and store in n1 and n2
        double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);

        // perform the arithmatic operation
        System.out.println("result of addition " + (n1 + n2));
        System.out.println("result of subtraction " + (n1 - n2));
        System.out.println("result of multiplication " + (n1 * n2));
        System.out.println("result of division " + (n1 / n2));

    }

}
