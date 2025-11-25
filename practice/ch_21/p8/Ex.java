package practice.ch_21.p8;

//Not handling the exception - using throws clause
import java.io.*;

public class Ex {
    public static void main(String args[]) throws IOException {
        Sample s = new Sample();
        s.accept();
        s.display();
    }

}

class Sample {
    // instance variable
    private String name;

    // method to accept name
    void accept() throws IOException {
        // to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter name: ");
        name = br.readLine();
    }

    // method to display name
    void display() {
        System.out.println("Name: " + name);
    }
}
