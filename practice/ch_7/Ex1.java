package practice.ch_7;
// printf() in java 
// Display Output with System.out.printf()
/*
 * to format and display the output, printf () method is available in PrintStream class. This method
works similar to printf () function in C
 %s - string
 %c - char
 %d - decimal integer
 %f - float number'
 %o - octal number
 %b, %B - boolean val-ye
 %x, %X - hexadecimal number
 %e, %E - number in scientific notation
 %n - new line charact


 */
public class Ex1 {
    public static void main(String[] args) {
        
        String s1 = " Hello";
        int n = 32;
        float f = 234.344f;
        System.out.printf("string = %s  num = %d hexadeimal = %x float = %f", s1,n,n,f);
    }
    


}
