package practice.ch_3;
/* creating api document of the following code  */

/**
 * Represents a simple calculator that performs basic arithmetic operations.
 *
 * <p>
 * This class supports addition, subtraction, multiplication,
 * and division of two double values.
 * </p>
 *
 * @author Jane Developer
 * @version 1.1
 * @since 2023-05
 */

public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of {@code a} and {@code b}
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Divides two numbers.
     *
     * @param a the numerator
     * @param b the denominator
     * @return the result of {@code a / b}
     * @throws ArithmeticException if {@code b} is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    
        public static void main(String[] args) {
            System.out.println("Enter two number : ");
            
        }

}
