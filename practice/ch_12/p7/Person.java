package practice.ch_12.p7;
/* to accept a person's name and age and display if he is 
 * young, middle aged or old
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Person {
    // instance variables
    private String name;
    private int age;

    // parameterized constructor
    Person(String s , int i )
    {
        name = s;
        age = i;
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
        // creat  BuggerReader object
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        
        // accept person name and age from ccommand line argument
        // name and age are stored in arg[o] and arg[1] as strings
        String s = args[0];
        int i = Integer.parseInt(args[1]);
        // create person class object and pass name and age to the constructor
        Person p = new Person(s, i);
;
        // check tha age
        p.check();
    }
}