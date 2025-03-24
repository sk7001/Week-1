import java.util.Scanner;
public class SpringSeasonCheckerMethod {
    public static void checkSpring(int month, int date){
        if(month > 3 && month < 6 || month == 3 && date >= 20 || month == 6 && date <= 20){
            System.out.println("It's a spring season.");
        }else{
            System.out.println("Not a spring season.");
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of month ");
        int month = scanner.nextInt();
        System.out.println("Please enter the number of date ");
        int date = scanner.nextInt();
        checkSpring(month, date);
        scanner.close();
    }
}
