import java.util.Scanner;
public class RemoveCharacterFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char chToRemove = scanner.next().charAt(0);
        scanner.close();
        String result = "";
        for (char ch : str.toCharArray()) {
            if (ch != chToRemove) {
                result += ch;
            }
        }
        System.out.println("Modified String: " + result);
    }
}
