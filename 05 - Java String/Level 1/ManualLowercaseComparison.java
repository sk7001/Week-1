import java.util.Scanner;
public class ManualLowercaseComparison {
    public static String convertToLowerCase(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
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
        String manualLowercase = convertToLowerCase(userInput);
        String builtInLowercase = userInput.toLowerCase();
        boolean isEqual = compareStrings(manualLowercase, builtInLowercase);
        System.out.println("Converted Text: " + manualLowercase);
        System.out.println("Built-in Converted Text: " + builtInLowercase);
        System.out.println("Are both results same? " + isEqual);
    }
}
