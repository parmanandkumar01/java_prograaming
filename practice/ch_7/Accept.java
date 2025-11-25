package practice.ch_7;

// Acception a single character from the keyboard
import java.io.*;;

public class Accept {
    public static void main(String[] args) throws IOException {
        // create BufferedReader object to accept data from keyboard
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);
        // above two line in singal line : BufferedReader br = new BufferedReader(new
        // InputStreamReader(System.in));

        // ask for char and read it
        System.out.println("Enter a character  ");
        char ch = (char) br.read();
        // display the character
        System.out.println(" you entered : " + ch);

    }
}
