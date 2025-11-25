package practice.ch_12.p2;
/*
 * Rewrite the program 1 and call the talk() method
 */

class Person {
    // properties -variables
    String name;
    int age;

    // action -methods
    void talk() {
        System.out.println("Hello I am " + name);
        System.out.println("My age is " + age);

    }

}

class demo {
    public static void main(String[] args) {
        // create Person class object: Raju

        Person Raju = new Person();

        // call the talk() method
        Raju.talk();

    }
}