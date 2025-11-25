package practice.ch_7;
// acceptin a float value from the keyboard
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Accept4 {
    
    public static void main(String[] args) throws IOException {
        // creating BufferedReader object to accept data from the keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // ask for float and read it
        System.out.println("Enter an int value");
        float num = Float.parseFloat(br.readLine());
        // display the float
        System.out.println(" you entered : " + num);
    }
}
