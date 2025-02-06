public class Method {

    public static int divide(int n1, int n2) {
        try {
            return n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return 0;
    }

    public static int divideHundred(int n1) {
        try {
            return 100 / n1;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        return 0;
    }

    public static void checkNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("The number is negative: " + number);
        } else {
            System.out.println("The number is non-negative: " + number);
        }
    }

    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative: " + number);
        }
        return Math.sqrt(number);
    }

}
