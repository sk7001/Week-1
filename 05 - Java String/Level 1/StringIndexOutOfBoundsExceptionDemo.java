import java.util.Scanner;
public class StringIndexOutOfBoundsExceptionDemo {
    public static void generateException(String input) {
        System.out.println(input.charAt(input.length()));
    }
    public static void handleException(String input) {
        try {
            System.out.println(input.charAt(input.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: Invalid index access");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        scanner.close();
        generateException(userInput);
        handleException(userInput);
    }
}
