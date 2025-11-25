package practice.ch_12.p1;
/* 
  write a program to create Person class and an object Raju to Person class
  Let the hash code number of the object, using 
  hashCode()
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

        Person raju = new Person();

        // find the hash code of object
        System.out.println("Hash code = " + raju.hashCode());

    }
}