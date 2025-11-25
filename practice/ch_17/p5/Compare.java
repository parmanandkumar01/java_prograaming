package practice.ch_17.p5;

//equals() method
//take Myclass that stores an int value

class Compare
{
    public static void main(String args[ ])
    {
        //create two Myclass objects with same content.
        //In this case, references of
        //objects will be different.
        Myclass obj1 = new Myclass(15);
        Myclass obj2 = new Myclass(15);

        //create two wrapper class objects and store same content.
        //In this case,
        //references of objects will be different.
        Integer obj3 = new Integer(15);
        Integer obj4 = new Integer(15);

        if(obj1.equals(obj2))
            System.out.println("obj1 and obj2 are same");
        else System.out.println("obj1 and obj2 are not same");

        if(obj3.equals(obj4))
            System.out.println("obj3 and obj4 are same");
        else System.out.println("obj3 and obj4 are not same");
    }
}


class Myclass
{
    int x;

    Myclass(int x)
    {
        this.x = x;
    }
}



