package practice.ch_7;

import java.util.Scanner;

// Scanner to scan the input from keyboard
/*
 * We can use Scanner class of java. util package to read input from the keyboard or a text file.
o next () - to read a string
o nextByte () - to read byte value
o nextlnt () - to read an integer value
o nextFloat () - to read float value
o nextLong ()- to read long value.
o nextDouble () -to read double value
 * 
 */
public class scanner {
    public static void main(String[] args) {
        System.out.println(" enter id name sal : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        float sal = sc.nextFloat();
        System.out.println("id " + id);
        System.out.println("name " + name);
        System.out.println("sal " + sal);
    }

}
