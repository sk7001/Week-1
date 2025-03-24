import java.util.Scanner;
public class GreatestFactorForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= scanner.nextInt(), greatestFactor = 1;
        for(int i = number-1; i >=1; i--){
            if(number%i==0){
                greatestFactor=i;
                break;
            }
        }
        System.out.println(greatestFactor + " is the greatest factor of " + number);
        scanner.close();
    }
}
