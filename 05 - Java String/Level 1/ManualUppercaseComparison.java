import java.util.Scanner;
public class ManualUppercaseComparison {
    public static String convertToUpperCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String userInput = scanner.nextLine();
        scanner.close();
        String manualUppercase = convertToUpperCase(userInput);
        String builtInUppercase = userInput.toUpperCase();
        boolean isEqual = compareStrings(manualUppercase, builtInUppercase);
        System.out.println("Converted Text: " + manualUppercase);
        System.out.println("Built-in Converted Text: " + builtInUppercase);
        System.out.println("Are both results same? " + isEqual);
    }
}
