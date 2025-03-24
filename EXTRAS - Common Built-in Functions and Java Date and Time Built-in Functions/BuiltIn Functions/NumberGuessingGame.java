import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int generatedNumber = random.nextInt(100);
        System.out.println("Please enter a number of your choice:");
        int userNumber = scanner.nextInt();
        while(generatedNumber!=userNumber){
            if(generatedNumber>userNumber){
                System.out.println("The input is lower than generated number.");
                userNumber=scanner.nextInt();
            }else {
                System.out.println("The input is higher than generated number.");
                userNumber = scanner.nextInt();
            }
        }
        System.out.println("Correct answer.");
    }
}
