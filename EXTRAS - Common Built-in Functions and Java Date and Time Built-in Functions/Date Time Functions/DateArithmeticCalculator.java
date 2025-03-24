import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = scanner.nextLine();
        try {
            LocalDate inputDate = LocalDate.parse(date, formatter);
            LocalDate result = inputDate.plusDays(7).plusMonths(1).plusYears(2);
            LocalDate finalResult = result.minusWeeks(3);
            System.out.println("Original Date: " + inputDate);
            System.out.println("After adding 7 days, 1 month, 2 years: " + result);
            System.out.println("After subtracting 3 weeks: " + finalResult);
        } catch (Exception e) {
            System.out.println("Invalid date format");
        }
    }
}
