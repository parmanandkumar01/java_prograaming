package practice.ch_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// accepting different inputs in a line
public class Different {
    public static void main(String[] args) throws IOException {
        // to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        // ask for input and seperate by commas
        System.out.println("Enter name , age , salary: ");
        // accept input into a string
        String str = br.readLine();
        // use StringTokenizer to split input at comma
        StringTokenizer st = new StringTokenizer(str, ",");

        // we will have 3 tokens as strings
        // first token represent anem second one is age ,third one salary
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();

        // trim any spaces before and after the tokens
        s1 = s1.trim();
        s2 = s2.trim();
        s3 = s3.trim();

        // convert s1 into string , s2 into an int and s3 into a float
        String name = s1;
        int age = Integer.parseInt(s2);
        float sal = Float.parseFloat(s3);

        // display the entered data

        System.out.println("name : " + name);
        System.out.println("age " + age);
        System.out.println("salary : " + sal);

    }
}
