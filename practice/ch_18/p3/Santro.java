package practice.ch_18.p3;

//This is a concrete class derived from class Car
class Santro extends Car
{
    //store regno at super class
    Santro(int regno)
    {
        super(regno);
    }

    //Santro uses power steering
    void steering(int direction, int angle)
    {
        System.out.println("Take a turn");
        System.out.println("This car uses power steering");
    }

    //Santro uses gas breaks
    void braking(int force)
    {
        System.out.println("Brakes applied");
        System.out.println("This cars uses gas brakes");
    }
}
