import java.util.Scanner;
public class LargestOfThreeChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int largestNumber, number1= scanner.nextInt(), number2 = scanner.nextInt(), number3 = scanner.nextInt();
        if(number1 > number2 && number1 > number3){
            largestNumber = number1;
            System.out.println("Is the first number the largest? \nYes");
            System.out.println("Is the second number the largest? \nNo");
            System.out.println("Is the third number the largest? \nNo");
        }
        else if (number2 > number3){
            largestNumber = number2;
            System.out.println("Is the first number the largest? \nNo");
            System.out.println("Is the second number the largest? \nYes");
            System.out.println("Is the third number the largest? \nNo");
        }
        else{
            largestNumber = number3;
            System.out.println("Is the first number the largest? \nNo");
            System.out.println("Is the second number the largest? \nNo");
            System.out.println("Is the third number the largest? \nYes");
        }
        System.out.println("Largest number is " + largestNumber);
        scanner.close();
    }
}
