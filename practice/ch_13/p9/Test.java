package practice.ch_13.p9;
/* write a program to test which one is executed first by jvm
 * the static block or the static method
 */
// static block or static method ?
public class Test {
    static{
        System.out.println("Static block ");
    }
    public static void main(String[] args) {
        System.out.println(" Static method ");
    }
}
