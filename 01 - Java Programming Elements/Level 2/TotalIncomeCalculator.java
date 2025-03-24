import java.util.Scanner; 
public class TotalIncomeCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int salary = scanner.nextInt(), bonus = scanner.nextInt(); 
        int totalIncome = salary + bonus; 
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome); 
    } 
} 
