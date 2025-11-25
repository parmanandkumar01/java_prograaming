package practice.ch_12.p4;
// write a program to initilize the inistance variables directly within the Person class
class Person {
    // instance variables are initilied here 
    private String name = "Raju";
    private int age = 33 ;
    

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

        // create another Person class object : Sita
        Person Sita = new Person();
        // call the talk() method
        Sita.talk();

    }
}