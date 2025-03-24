import java.util.Scanner;
public class SpringSeasonChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the date");
        int date = scanner.nextInt();
        System.out.println("Please enter the month");
        int month = scanner.nextInt();
        if ((month == 3 && date > 20) || (month == 6 && date < 20) || (month>3 && month<6)){
            System.out.println("Its a Spring Season");
        }
        else{
            System.out.println("Not a Spring Season");
        }
        scanner.close();
    }
}
