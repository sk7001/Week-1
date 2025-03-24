import java.util.Scanner;
public class IllegalArgumentExceptionDemo {
    public static void generateException(String input) {
        System.out.println("Generating exception...");
        if (5 > 2) {
            throw new IllegalArgumentException("Start index cannot be greater than end index.");
        }
        System.out.println(input.substring(5, 2));
    }
    public static void handleException(String input) {
        try {
            System.out.println("Handling exception...");
            if (5 > 2) {
                throw new IllegalArgumentException("Start index cannot be greater than end index.");
            }
            System.out.println(input.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: An unexpected error occurred.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        scanner.close();
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        handleException(userInput);
    }
}
