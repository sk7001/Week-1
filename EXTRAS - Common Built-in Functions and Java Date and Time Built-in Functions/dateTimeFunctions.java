/*
Problem 1
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class dateTimeFunctions {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in GMT: " + gmt.format(formatter));
        System.out.println("Current time in IST: " + ist.format(formatter));
        System.out.println("Current time in PST: " + pst.format(formatter));
    }
}
*/

/*
Problem 2
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class dateTimeFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String date = scanner.nextLine();
        try{
            LocalDate inputDate = LocalDate.parse(date, formatter);
            LocalDate result = inputDate.plusDays(1).plusMonths(1).plusYears(2);
            LocalDate finalResult = result.minusWeeks(3);
            System.out.println("Original Date: " + inputDate);
            System.out.println("After adding 7 days, 1 month, 2 years: " + result);
            System.out.println("After subtracting 3 weeks: " + finalResult);
        }catch(Exception e){
            System.out.println("Invalid date format");
        }
    }
}
 */

/*
Problem 3
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class dateTimeFunctions {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Format 1: " + today.format(format1));
        System.out.println("Format 2: " + today.format(format2));
        System.out.println("Format 3: " + today.format(format3));
    }
}
*/

/*
Problem 4
import java.time.LocalDate;
import java.util.Scanner;
public class dateTimeFunctions {
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
*/