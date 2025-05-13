import java.util.function.BiFunction;

public class EXP6 {
    public static void main(String[] args) {
        // Lambda expression for addition
        BiFunction<Integer, Integer, Integer> addition = (a, b) -> a + b;

        // Lambda expression for subtraction
        BiFunction<Integer, Integer, Integer> subtraction = (a, b) -> a - b;

        // Lambda expression for multiplication
        BiFunction<Integer, Integer, Integer> multiplication = (a, b) -> a * b;

        // Lambda expression for division
        BiFunction<Integer, Integer, Double> division = (a, b) -> {
            if (b == 0) {
                System.out.println("Error: Cannot divide by zero.");
                return Double.NaN; // Not-a-Number
            }
            return (double) a / b;
        };

        int num1 = 10;
        int num2 = 5;

        System.out.println("Performing arithmetic operations:");
        System.out.println(num1 + " + " + num2 + " = " + operate(num1, num2, addition));
        System.out.println(num1 + " - " + num2 + " = " + operate(num1, num2, subtraction));
        System.out.println(num1 + " * " + num2 + " = " + operate(num1, num2, multiplication));
        System.out.println(num1 + " / " + num2 + " = " + operate(num1, num2, division));

        int num3 = 8;
        int num4 = 0;
        System.out.println(num3 + " / " + num4 + " = " + operate(num3, num4, division));
    }

    // A generic method to perform an operation using a BiFunction
    public static <T, U, R> R operate(T operand1, U operand2, BiFunction<T, U, R> operation) {
        return operation.apply(operand1, operand2);
    }
}
