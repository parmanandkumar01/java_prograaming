package practice.ch_7;
// acception the string from the keyboard
import java.io.*;
// accepting the string from the keyboard
public class Accept2 {
    public static void main(String[] args) throws IOException {
        //create a Buffered object to accept data from kayboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ask for string and read it
        System.out.println("Enter your name : ");
        String name = br.readLine();
        // display the string
        System.out.println("you entered " + name );
    }
    
}
