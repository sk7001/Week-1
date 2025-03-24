import java.util.Scanner;
public class HarshadNumberChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(), sum = 0, originalNumber = number;
        while(originalNumber!=0) {
            sum+=originalNumber%10;
            originalNumber/=10;
        }
        if(number%sum==0){
            System.out.println(number + " is a Harshad Number.");
        }else{
            System.out.println(number + " is not a Harshad Number.");
        }
        scanner.close();
    }
}
