package practice.ch_17.p1;
//Widening using referenced data types
class Cast
{
    public static void main(String args[ ])
    {
        One o;   //o is super class reference
        o = (One)new Two(); //o is referring to sub class object
        //the above is widening
        o.show1();
        // o.show2(); // give error 
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



