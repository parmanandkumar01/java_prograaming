package practice.ch_12.p8;
/* to accept a person's name and age and display if he is 
 * young, middle aged or old 
 * 
 * using the constructor and command line argument
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Person {
    // instance variables
    private String name;
    private int age;

    // to accept the name and age
    public void accept() throws IOException {
        // to accept data from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        // accept name and age
        System.out.println("Enter name : ");
        name = br.readLine();

        System.out.println("Enter age : ");
        age = Integer.parseInt(br.readLine());

    }

    public void check() {
        if (age <= 30) {
            System.out.println(name + " is young");

        } else if (age <= 50) {
            System.out.println(name + " is middled aged ");
        } else
            System.out.println(name + " is old");
    }
}

class Demo {
    public static void main(String[] args) throws IOException {
        // creat Person class object
        Person p = new Person();

        // accept person data
        p.accept();

        // check tha age
        p.check();
    }
}