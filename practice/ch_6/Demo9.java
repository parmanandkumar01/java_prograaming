package practice.ch_6;

// To display a color name depending on color value
public class Demo9 {

    public static void main(String[] args) {
        char color = 'g'; // color is set to 'g'
        switch (color) {
            case 'r':
                System.out.println("Red");
                break;
            case 'g':
                System.out.println("Green");
                break;
            case 'b':
                System.out.println("Blue");
                break;
            case 'w':
                System.out.println("White");
                break;
            default:
                System.out.println("No color");
                break;
        }
    }
}
