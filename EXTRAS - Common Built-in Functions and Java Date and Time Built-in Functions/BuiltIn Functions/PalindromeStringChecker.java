import java.util.Scanner;
public class PalindromeStringChecker {
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }
    public static boolean isPalindrome(String text) {
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversed);
    }
    public static void displayResult(String text, boolean result) {
        if (result) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}
