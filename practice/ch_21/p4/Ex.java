package practice.ch_21.p4;

// An exception example
public class Ex {

    public static void main(String args[]) {
        // open the files
        System.out.println("Open files");

        // do some processing
        int n = args.length;
        System.out.println("n= " + n);
        int a = 45 / n;
        System.out.println("a= " + a);

        // close the files
        System.out.println("close files");
    }
}