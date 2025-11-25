package practice.ch_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// accepting int from the keyboard
public class Accept3 {
    public static void main(String[] args) throws IOException {
        // creating BufferedReader object to accept data from the keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ask for integer and read it
        System.out.println("Enter an int value");
        int num = Integer.parseInt(br.readLine());
        // display the int
        System.out.println(" you entered : " + num);
    }
}
