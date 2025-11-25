package practice.ch_5;

// Using bitwise operators
public class Bits {
    public static void main(String[] args) {
        byte x, y;
        x = -10;//00001010
        y = 11;//00001011
        System.out.println("~x=" + (~x));
        System.out.println("x&y = " + (x & y));
        System.out.println("x|y = " + (x | y));
        System.out.println(("x^y=" + (x ^ y)));
        System.out.println("x<<2=" + (x << 2));
        System.out.println("x>>2=" + (x >> 2));
        System.out.println("x>>>2=" + (x >>> 2));
        System.out.println("now all result in binary format");
        System.out.println("x     = " + toBinary(x));
        System.out.println("y     = " + toBinary(y));
        System.out.println("~x    = " + toBinary(~x));
        System.out.println("x & y = " + toBinary(x & y));
        System.out.println("x | y = " + toBinary(x | y));
        System.out.println("x ^ y = " + toBinary(x ^ y));
        System.out.println("x << 2 = " + toBinary(x << 2));
        System.out.println("x >> 2 = " + toBinary(x >> 2));
        System.out.println("x >>> 2 = " + toBinary(x >>> 2));

    }

    // Helper method: convert to 8-bit binary string
    private static String toBinary(int n) {
        // "& 0xFF" ensures we only keep the lower 8 bits
        return String.format("%8s", Integer.toBinaryString(n & 0xFF)).replace(' ', '0');
    }
}
