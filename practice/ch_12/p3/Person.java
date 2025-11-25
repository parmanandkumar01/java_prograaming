package practice.ch_12.p3;
// initilization of instance variables

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
        // initilze the instance variables using the reference
        Raju.name = "Raju";
        Raju.age = 22;
        // call the talk() method
        Raju.talk();

    }
}