package practice.ch_15.p4;
// super - to access the super class method and variable

public class Super{

    public static void main(String[] args) {
        // create sub class object
        Two t = new Two();
        // this will call sub class method only
        t.show();
    }
    
}
class One {
    // supper class var
    int i = 10;

    // supper class method
    void show() {
        System.out.println("Supper class method : i = " + i);
    }

}

class Two extends One {
    // sub class var
    int i = 20;

    // sub class method
    void show() {
        System.out.println("sub class method : i " + i);
        // using super to call super class method 
        super.show();
        // using supper to access super class var
        System.out.println(" super i " + super.i);
    }
}