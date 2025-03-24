import java.util.Scanner;
public class ToggleCaseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        StringBuilder toggledStr = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggledStr.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggledStr.append(Character.toUpperCase(ch));
            } else {
                toggledStr.append(ch);
            }
        }
        System.out.println("Toggled case string: " + toggledStr);
    }
}
