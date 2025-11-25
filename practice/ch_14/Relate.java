package practice.ch_14;

// Realting the objects of three classes

public class Relate {
    public static void main(String[] args) {
        // create class Three's object obj3
        Three obj3 = new Three();
        // create class Two object and pas obj3
        Two obj2 = new Two(obj3);
        // creat class one object and pass class Two object to it
        One obj1 = new One(obj2);
        // call cube() method of class One
        double reslut = obj1.cube(5);
        System.out.println("cube of 5 " + reslut);
        // call square() method fo class Two
        double result2 = obj2.square(6);
        System.out.println("Sqare of 6 " + result2);

    }

}

class One {
    // obj2 is class Two's reference
    Two obj2;

    // initialize obj2
    One(Two obj2) {
        this.obj2 = obj2;
    }

    double cube(double x) {
        // call class Two's method using obj2
        double result = x * obj2.square(x);
        // return result to Relate class
        return result;
    }
}

class Two {
    // obj3 is class Three's reference
    Three obj3;

    // initialize obj3
    Two(Three obj3) {
        this.obj3 = obj3;
    }

    double square(double x) {
        // call class Three's method using obj3
        double result = x * obj3.get(x);
        // return reslut to class One
        return result;
    }
}

class Three {

    double get(double x) {
        // just return x value to class Two
        return x;
    }
}