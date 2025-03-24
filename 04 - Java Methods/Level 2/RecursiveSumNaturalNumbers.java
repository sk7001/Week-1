import java.util.Scanner;
public class RecursiveSumNaturalNumbers {
    public static int sumOfNaturalNumbersUsingRecursion(int number){
        if(number == 0){
            return 0;
        }
        return number + sumOfNaturalNumbersUsingRecursion(number-1);
    }
    public static int sumOfNaturalNumbersUsingFormulae(int number){
        int sum = number * (number + 1) / 2;
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scanner.nextInt();
        int sumRec = sumOfNaturalNumbersUsingRecursion(number);
        int sumFormula = sumOfNaturalNumbersUsingFormulae(number);
        System.out.println("Sum of natural numbers using recursion method : " + sumRec);
        System.out.println("Sum of natural numbers using formulae : " + sumFormula);
        if(sumFormula == sumRec){
            System.out.println("Both are same");
        }else{
            System.out.println("Both are not same");
        }
        scanner.close();
    }
}
