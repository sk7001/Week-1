import java.util.Scanner;
public class DivisibleByFiveChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Is the number " + number + " divisible by 5?");
        if(number%5==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        scanner.close();
    }
}
