import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Davaleba 1
        System.out.println("Type Number:");
        int n1 = scanner.nextInt();
        System.out.println("Type Number:");
        int n2 = scanner.nextInt();

        int result = Method.divide(n1, n2);
        System.out.println(result);

        // Davaleba 2
        System.out.println("Type Number:");
        int input = scanner.nextInt();
        int result2 = Method.divideHundred(input);
        System.out.println(result2);

        // Davaleba 3
        System.out.println("Type Number:");
        int n3 = scanner.nextInt();

        try {
            Method.checkNumber(n3);
        } catch (NegativeNumberException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Davaleba 4

        System.out.println("Enter a number to calculate its square root:");
        double sqrtInput = scanner.nextDouble();

        try {
            double sqrtResult = Method.calculateSquareRoot(sqrtInput);
            System.out.println("Square root of " + sqrtInput + " is: " + sqrtResult);
        } catch (IllegalArgumentException e) {
            System.out.println("Error calculating square root: " + e.getMessage());
        }

        scanner.close();
    }
}
