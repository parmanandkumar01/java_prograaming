package practice.ch_17.p4;

//Narrowing using sub class object
class Cast
{
    public static void main(String args[ ])
    {
        One o;
        o = new Two(); //super class reference to refer to sub class object
        Two t = (Two)o; //this is narrowing - convert class One's reference
        //type as class Two's type
        t.show1();
        t.show2();
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


