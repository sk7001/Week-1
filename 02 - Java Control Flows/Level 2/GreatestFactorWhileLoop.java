import java.util.Scanner;
public class GreatestFactorWhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= scanner.nextInt(), greatestFactor = 1, counter = number-1;
        while(counter>=1){
            if(number%counter==0){
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println(greatestFactor + " is the greatest factor of " + number);
        scanner.close();
    }
}
