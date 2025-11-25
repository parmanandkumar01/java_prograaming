package practice.ch_21.p7;

import java.io.*;

// Not handling the exception
public class Ex {
    public static void main(String args[]) {
        Sample s = new Sample();
        s.accept();
        s.display();
    }

}

class Sample {
    // instance variable
    private String name;

    // method to accept name
    void accept() {
        // to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter name: ");
        // name = br.readLine();
    }

    // method to display name
    void display() {
        System.out.println("Name: " + name);
    }
}
