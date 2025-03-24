import java.util.Scanner;
public class FactorialRecursion {
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        return scanner.nextInt();
    }
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    public static void displayResult(int n, long factorial) {
        System.out.println("Factorial of " + n + " is: " + factorial);
    }
    public static void main(String[] args) {
        int number = getInput();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = calculateFactorial(number);
            displayResult(number, result);
        }
    }
}
