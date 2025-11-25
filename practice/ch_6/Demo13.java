package practice.ch_6;

// calling a method and returning the result from the method
public class Demo13 {
    // this method calculates square value and return it to main()
    static int myMethod(int n)
    
    {
        return n * n; // return square value
    }

    public static void main(String[] args) {

        // call the myMethod() and catch the result into res
        // since myMethod()is static we can call it using classname.methodname()
        int res = Demo13.myMethod(10);
        // display the result now
        System.out.println("Result = " + res);
    }


}
