package practice.ch_22.p3;

//Convert int into binary, hexadecimal, and octal format
import java.io.*;
public class Convert
{
    public static void main(String args[ ]) 
    throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an integer: ");
        String str = br.readLine();

        //convert string into int
        int i = Integer.parseInt(str);
        System.out.println("In decimal: " + i);

        //convert int into other systems
        str = Integer.toBinaryString(i);
        System.out.println("In binary: " + str);

        str = Integer.toHexString(i);
        System.out.println("In hexadecimal: " + str);

        str = Integer.toOctalString(i);
        System.out.println("In octal: " + str);
    }
}
