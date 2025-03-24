import java.util.Scanner;
public class ArmstrongNumberChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(), sum=0, originalNumber = number;
        int temp = originalNumber;
        while(temp!=0) {
            sum+=Math.pow(temp%10, 3);
            temp/=10;
        }
        if(number == sum){
            System.out.println(number + " is an armstrong number.");
        }else{
            System.out.println(number + " is not an armstrong number.");
        }
        scanner.close();
    }
}
