package practice.ch_17.p2;
//Widening in referenced data types
class Cast
{
        public static void main(String args[ ])
    {
        Two o;   //o is super class reference
        o = new Two(); //o is referring to sub class object
        o.show1();
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
    void show1()   //override the super class method
    {
        System.out.println("Sub class method");
    }
}



