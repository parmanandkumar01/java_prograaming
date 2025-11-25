package practice.ch_22.p2;

//Creating Byte class objects and comparing them
import java.io.*;

public class ByteDemo {
    public static void main(String args[]) throws IOException {
        // to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // accept a byte number as string s1
        System.out.print("Enter a byte no: ");
        String s1 = br.readLine();

        // create Byte object b1 using s1
        Byte b1 = new Byte(s1);

        // accept another byte number as string s2
        System.out.print("Enter a byte no: ");
        String s2 = br.readLine();

        // create Byte object b2 using s2
        Byte b2 = new Byte(s2);

        // compare both the Byte objects contents
        int n = b1.compareTo(b2);

        if (n == 0)
            System.out.println("Both bytes are same");
        else if (n < 0)
            System.out.println(b1 + " is less");
        else
            System.out.println(b2 + " is less");
    }
}
