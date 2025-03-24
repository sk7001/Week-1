import java.time.LocalDate;
import java.util.Scanner;

public class DateComparisonChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first date (yyyy-MM-dd): ");
        String first = scanner.nextLine();
        System.out.print("Enter second date (yyyy-MM-dd): ");
        String second = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(first);
        LocalDate date2 = LocalDate.parse(second);
        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
    }
}
