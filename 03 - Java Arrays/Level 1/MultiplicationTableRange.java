import java.util.Scanner;
public class MultiplicationTableRange {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 6 to 9:");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[10];
        if(number >= 6 && number <= 9){
            for (int i = 0; i < multiplicationResult.length; i++){
                multiplicationResult[i] = number * (i+1);
            }
            for (int i = 0; i < multiplicationResult.length; i++){
                System.out.println(number + "*" + (i+1) + " = " + multiplicationResult[i]);
            }
        }else{
            System.out.println("You have entered the number not between 6 and 9.");
        }
        scanner.close();
    }
}
