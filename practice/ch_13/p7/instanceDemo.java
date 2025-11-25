

// let us make a probram by taking an instance variable x in 
// in the Test class.

// instance variables 

class Test {
    // instance var
    int x = 10; 
    // display the variable 
    void display()
    {
        System.out.println(x);
    }

    
}
class instanceDemo{
public static void main(String[] args) {
    // create two references 
    Test obj1, obj2;
    // clreate two objects
    obj1 = new Test();
    obj2 = new Test();

    // increment x in obj1

    ++obj1.x;
    System.out.println("x in obj1 : ");
    obj1.display();;

    // display x in obj2
    System.out.println("x in obj 2 ");
    obj2.display();
}
    
}