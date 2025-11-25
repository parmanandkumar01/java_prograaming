package practice.ch_9;

public class StrDemo {
    public static void main(String[] args) {
        // create strings in 3 ways
        String s1 = "A book on java";
        String s2 = new String(" I like it ");
        char arr[] = { 'D', 'r', 'e', 'a', 'm', 't', 'e', 'e', 'c', 'h', ',', 'p', 'r', 'e', 's', 's' };
        String s3 = new String(arr);

        // display all the 3 string
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // find length of first string
        System.out.println("length of s1 " + s1.length());
        // concatenate two strings
        System.out.println("S1 and S2 joined : " + s1.concat(s2));

        // concatenate three strings with +
        System.out.println(s1 + " from " + s3);
        // test if string s1 starts with A
        boolean x = s1.startsWith("A");
        if(x) System.out.println("s1 start with A ");
        else System.out.println("s1 does not start with A");
        // extract substring from s2, starting from 0 th cahr to 6th char
        String p = s2.substring(0,7);

                // extract substring from s2, starting from 0 th char to 8th char
        String q = s2.substring(0,9);
        // concatenate the strings p and q
        System.out.println(p+q);
        // convert s1 into uppercase and lowercase
        System.out.println("Upper S1 = "+s1.toUpperCase());
        System.out.println("Lower S1= "+s1.toLowerCase());


    }
}
