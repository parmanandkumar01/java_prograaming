package practice.ch_9;

// compare the contant of string variable
public class Strcmpt3 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        if (s1.equals(s2))
            System.out.println("Both are same");
        else
            System.out.println("Not same");
    }
}
