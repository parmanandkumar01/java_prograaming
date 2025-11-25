package practice.ch_15.p5;

// calling super class default constructor from sub class
public class Super {
    public static void main(String[] args) {
        // create sub class object
        Two t = new Two();
      
    }
}

class One {
    // super class default constror
    One() {
        System.out.println("This is super class constructor ");
    }
}

class Two extends One {
    // sub class default constructor
    Two() {
        System.out.println("this is base class constot");
    }
}