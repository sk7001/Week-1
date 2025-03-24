import java.util.Scanner;
public class LeapYearChecker {
    public static boolean checkLeapYear(int year){
        if(year >= 1582 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(checkLeapYear(year)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
        scanner.close();
    }
}
