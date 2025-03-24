import java.util.Scanner;
public class SubstringOccurrencesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainStr = scanner.nextLine();
        System.out.print("Enter the substring to count: ");
        String subStr = scanner.nextLine();
        scanner.close();
        int count = 0;
        int index = mainStr.indexOf(subStr);
        while (index != -1) {
            count++;
            index = mainStr.indexOf(subStr, index + subStr.length());
        }
        System.out.println("Occurrences of \"" + subStr + "\": " + count);
    }
}
