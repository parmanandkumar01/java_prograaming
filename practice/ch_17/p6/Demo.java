package practice.ch_17.p6;

//Using getClass() to know the classname
//Myclass stores an int value
class Demo
{
    public static void main(String args[ ])
    {
        //create Myclass object obj
        Myclass obj = new Myclass(10);

        //know the class name of the object obj by calling printName().
        KnowName.printName(obj);
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

//This class contains method to receive an object and display the classname
class KnowName
{
    static void printName(Object obj)
    {
        //get the class name into an object c of the class Class
        Class c = obj.getClass();
        //get the name of the class using getName()
        String name = c.getName();
        System.out.println("The classname= " + name);
    }
}


