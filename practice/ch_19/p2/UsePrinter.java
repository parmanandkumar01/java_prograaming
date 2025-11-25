package practice.ch_19.p2;

import java.io.*;

// An interface Printer to send text to any printer
public class UsePrinter {
    public static void main(String args[]) throws Exception {

        FileReader fr = new FileReader("config.txt");
        LineNumberReader lnr = new LineNumberReader(fr);

        String printername = lnr.readLine();
        System.out.println("Loading the driver for: " + printername);

        Class c = Class.forName(printername);
        Printer ref = (Printer) c.newInstance();

        ref.printit("Hello, This is printed on the printer");

        ref.disconnect();
    }
}

interface Printer {
    void printit(String text);

    void disconnect();
}

class IBMPrinter implements Printer {
    public void printit(String text) {
        System.out.println(text);
    }

    public void disconnect() {
        System.out.println("Printing completed");
        System.out.println("Disconnected from IBM Printer");
    }
}

class EpsonPrinter implements Printer {
    public void printit(String text) {
        System.out.println(text);
    }

    public void disconnect() {
        System.out.println("Printing completed");
        System.out.println("Disconnected from Epson printer");
    }
}
