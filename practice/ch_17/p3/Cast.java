package practice.ch_17.p3;
//Narrowing using super class object

class Cast
{
    public static void main(String args[ ])
    {
        Two t;  //t is sub class reference
        t = (Two)new One();  //t is referring to super class object
        //the above is narrowing
        t.show1();
    }
}

class One
{
    void show1()
    {
        System.out.println("Super class method");
    }
}

class Two extends One
{
    void show2()
    {
        System.out.println("Sub class method");
    }
}


