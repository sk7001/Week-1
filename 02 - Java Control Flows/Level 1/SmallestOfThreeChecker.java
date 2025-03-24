import java.util.Scanner;
public class SmallestOfThreeChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int smallestNumber, number1= scanner.nextInt(), number2 = scanner.nextInt(), number3 = scanner.nextInt();
        if(number1 < number2 && number1 < number3){
            smallestNumber = number1;
            System.out.println("Is the first number the smallest? \nYes");
        }
        else if (number2 < number3){
            smallestNumber = number2;
            System.out.println("Is the first number the smallest? \nNo");
        }
        else{
            smallestNumber = number3;
            System.out.println("Is the first number the smallest? \nNo");
        }
        System.out.println("Smallest number is " + smallestNumber);
        scanner.close();
    }
}
