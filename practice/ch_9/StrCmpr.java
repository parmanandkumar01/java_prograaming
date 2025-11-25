package practice.ch_9;

// string comparision using ==
public class StrCmpr {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        if (s1 == s2)
            System.out.println("Both are same");
        else
            System.out.println("Not same");
    }
}
