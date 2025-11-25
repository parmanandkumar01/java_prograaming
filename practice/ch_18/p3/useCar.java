package practice.ch_18.p3;

//Using cars
class UseCar
{
    public static void main(String args[ ])
    {
        //create sub class objects
        Maruti m = new Maruti(1001);   //1001 is regno.
        Santro s = new Santro(5005);   //5005 is regno.

        //create a reference to super class: Car
        Car ref;

        //to use the Maruti car
        ref = m;    //to use Santro car: ref=s;

        //use the features of the car
        ref.openTank();
        ref.steering(1, 90);
        ref.braking(500);
    }
}
