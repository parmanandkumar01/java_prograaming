package practice.ch_8;

// calling main() of a class 1 from another class ; class 2
class Class1 {
    public static void main(String[] args) {
        // args contins name, display them
        for (String s : args) // we are using for-each loop here
            System.out.println(s);
    }
}

class class2 {
    public static void main(String[] args) {
        // take a string type array
        String names[] = { "Gopi", "Kamal", "Vinay", "Neeta jain" };
        // call main() of class 1 and pass the names array
        Class1.main(names);
    }

}
