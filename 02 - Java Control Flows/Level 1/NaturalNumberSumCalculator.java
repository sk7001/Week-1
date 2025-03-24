import java.util.Scanner;
public class NaturalNumberSumCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number >= 0){
            int sumOfNaturalNumbers = number * (number + 1)/2;
            System.out.println("The sum of " + number + " natural numbers is " + sumOfNaturalNumbers );
        }
        else{
            System.out.println("The number " + number + " is not a natural number");
        }
        scanner.close();
    }
}
