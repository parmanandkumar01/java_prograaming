package practice.ch_21.p6;

// Handling multiple exception using try cat and finally blocks
public class Ex {
    public static void main(String args[]) {
        try {
            // open the files
            System.out.println("Open files");

            // do some processing
            int n = args.length;
            System.out.println("n= " + n);
            int a = 45 / n;
            System.out.println("a= " + a);

            int b[] = { 10, 20, 30 };
            b[50] = 100;
        } catch (ArithmeticException ae) {
            // display the exception details
            System.out.println(ae);

            // display any message to the user
            System.out.println("Please pass data while running this program");
        } catch (ArrayIndexOutOfBoundsException aie) {
            // display exception details
            aie.printStackTrace();

            // display a message to user
            System.out.println("Please see that the array index is within the range");
        } finally {
            // close the files
            System.out.println("Close files");
        }
    }

}