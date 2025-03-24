import java.util.Scanner;
public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        String result = "";
        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println("String after removing duplicates: " + result);
    }
}
