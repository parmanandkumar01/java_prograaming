package practice.ch_6;

// To display a color name depending on color value
public class Demo8 {
    public static void main(String[] args) {
        char color = 'g'; // color is set to 'g'
        switch (color) {
            case 'r':
                System.out.println("Red");

            case 'g':
                System.out.println("Green");
            case 'b':
                System.out.println("Blue");
            case 'w':
                System.out.println("White");

            default:
                System.out.println("No color");

        }
    }
}
