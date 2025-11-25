package practice.ch_15.p1;

public class use {
    public static void main(String[] args) {
        // create an object to student class
        Student s1 = new Student();
        // Student2 s1 = new Student2();// it is inherited class from teacher class 
        // but both s1 and s1 works as same
        
        // store data into object for this use setter methods
        s1.setId(1001);
        s1.setName("Chandra Sekhar");
        s1.setAddress("patna , Bihar ");
        s1.setMarks(950);

        // retrieve data using getter methods and display
        System.out.println("Id " + s1.getId());
        System.out.println("Name " + s1.getName());
        System.out.println("Address " + s1.address);
        System.out.println("Marks " + s1.getMarks());
    }
}
