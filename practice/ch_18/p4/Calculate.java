package practice.ch_18.p4;

public class Calculate {

    public static void main(String args[]) {
        // create reference p to abstract class
        Plan p;

        // calculate commercial bill for 250 units
        System.out.println("Commercial connection: ");
        p = new CommercialPlan(); // use reference to refer to sub class object
        p.getRate();
        p.calculateBill(250);

        // calculate domestic bill for 150 units
        System.out.println("Domestic connection: ");
        p = new DomesticPlan(); // use reference to refer to sub class object
        p.getRate();
        p.calculateBill(150);
    }
}

// calculating electricity bill for commercial and domestic plans
abstract class Plan {
    // take rate as protected to access it in sub classes
    protected double rate;

    // accept rate into rate variable. Since rate will change depending on plan, we
    // declare abstract method
    public abstract void getRate();

    // calculate the electricity bill by taking units
    public void calculateBill(int units) {
        System.out.println("Bill amount for " + units + " units: ");
        System.out.println(rate * units);
    }
}

class CommercialPlan extends Plan {
    // store commercial rate as Rs.5.00 per unit
    public void getRate() {
        rate = 5.00;
    }
}

class DomesticPlan extends Plan {
    // store domestic rate as Rs.2.60 per unit
    public void getRate() {
        rate = 2.60;
    }
}
