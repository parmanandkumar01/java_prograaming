package practice.ch_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Employee details 
public class Accept5 {
    public static void main(String[] args) throws IOException {
        // create BufferedReader object to accept data
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // accept the employee details
        System.out.println("Enter id : ");
        int id = Integer.parseInt(br.readLine());
        System.out.println("Enter Sex (M/F ) ");
        char sex = (char) br.read();
        System.out.println("Enter Name : ");
        /*
         * please observe the output of Program 5. After accepting sex of the employee,
         * it is not accepting the
         * name of employee and is displaying blank for name. The reason is that
         * we used read () method to
         * accept sex value and then readLine () is used to accept the name. When
         * we type M for sex and
         * press Enter, then it releases a \n code. So at sex column, we are giving two
         * characters M and \n
         */
        String name = br.readLine();
        // display the employee details
        System.out.println("id " + id);
        System.out.println(" sex " + sex);
        System.out.println("name " + name);

    }

}
