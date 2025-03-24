import java.util.Scanner;
public class EmployeeBonusCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the present salary");
        int salary = scanner.nextInt();
        System.out.println("Please enter the years of service");
        int serviceYears = scanner.nextInt();
        if(serviceYears>5){
            int bonusAmount = salary * 5 / 100;
            System.out.println("Bonus amount is " + bonusAmount);
        }
        else{
            System.out.println("You dont have enough service years to get the bonus amount.");
        }
        scanner.close();
    }
}
