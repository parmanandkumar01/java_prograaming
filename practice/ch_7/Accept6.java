package practice.ch_7;

// emplyee detail
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Accept6 {

    public static void main(String[] args) throws IOException {
        // create BufferedReader object to accept data
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // accept the employee details
        System.out.println("Enter id : ");
        int id = Integer.parseInt(br.readLine());
        /*
         * One solution is to use readLine () method to accept the single character
         * while accepting the
         * sex of employee.
         * System.out.println("Enter Sex (M/F ) ");
         * char sex = (char) br.readLine().charAt(0);
         * 
         * another method
         * Clearing the \n code from BuffeTedReader object, so that the character is not
         * carried into next
         * readLine().
         * 
         * char sex = (char) br.read();
         * br.skip(2);
         * 
         */
        System.out.println("Enter Sex (M/F ) ");
        char sex = (char) br.read();
        br.skip(2);
        System.out.println("Enter Name : ");
        String name = br.readLine();

        // display the employee details
        System.out.println("id " + id);
        System.out.println(" sex " + sex);
        System.out.println("name " + name);

    }
}
