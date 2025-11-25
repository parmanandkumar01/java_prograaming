package practice.ch_22.p4;

//Generating random nos. between 0 and 10
public class Random
{
    public static void main(String args[ ]) 
    throws Exception
    {
        System.out.println("Random no.s between 0 and 10: ");

        while(true)
        {
            /*random() returns double type between 0 and 1. But we 
            the no. as integer and between 0 and 10. So multiply it
            by 10 and convert into int. */

            double d = 10*Math.random();
            int i = (int)d;
            System.out.println(i);

            //Let the execution wait till 2000 milli seconds = 2 sec
            Thread.sleep(2000);
21 
            if(i==0) System.exit(0); //come out
        } //end of while
    }
}
