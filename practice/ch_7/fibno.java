package practice.ch_7;

// fibonacci number series
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibno {
    public static void main(String[] args) throws IOException {

        // accept how may fibnaccis needed
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("how many fibonaccis ?");
        int n = Integer.parseInt(br.readLine());
        // take first two fibonaccis as 0 and 1
        long f1 = 0, f2 = 1;
        System.out.println(f1);
        System.out.println(f2);
        // fing next fibonacci no
        long f = f1 + f2;
        System.out.println(f);
        // already 3 fibonaccis are displayed. so cout will start at 3
        int count = 3;
        while (count < n) {
            f1 = f2;
            f2 = f;
            f = f1 + f2;
            System.out.println(f);
            count++;

        }
    }
}
