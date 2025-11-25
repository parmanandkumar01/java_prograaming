package practice.ch_16.p4;
//Calculate electricity bill for commercial and domestic users

public class ElectricityBill{
    
    public static void main(String args[])
    {
        //call calculateBill() using the Commercial object
        Commercial c = new Commercial();
        c.setName("Raj Kumar");
        c.calculateBill(100);

        //call calculateBill() using the Domestic object
        Domestic d = new Domestic();
        d.setName("Vijaya Laxmi");
        d.calculateBill(100);
    }
}
//Electricity bill for commercial connection
class Commercial
{
    //take customer name
    private String name;

    //store customer name into name
    void setName(String name)
    {
        this.name = name;
    }

    //retrieve the name
    String getName()
    {
        return name;
    }

    //to calculate bill taking Rs. 5.00 per unit
    void calculateBill(int units)
    {
        System.out.println("Customer: " + getName());
        System.out.println("Bill amount= " + units*5.00);
    }
}

//Electricity bill for domestic connection
class Domestic extends Commercial
{
    //override the calculateBill() of Commercial class, to calculate
    //bill at Rs. 2.50 per unit
    void calculateBill(int units)
    {
        System.out.println("Customer: " + getName());
        System.out.println("Bill amount= " + units*2.50);
    }
}

