import java.util.Scanner;
public class NumberFormatExceptionDemo {
    public static void generateException(String input) {
        System.out.println(Integer.parseInt(input));
    }
    public static void handleException(String input) {
        try {
            System.out.println(Integer.parseInt(input));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Input is not a valid integer");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: An unexpected error occurred");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String userInput = scanner.next();
        scanner.close();
        generateException(userInput);
        handleException(userInput);
    }
}
