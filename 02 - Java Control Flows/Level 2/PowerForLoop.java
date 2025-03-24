import java.util.Scanner;
public class PowerForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner.nextInt();
        System.out.println("Please enter the power:");
        int power = scanner.nextInt();
        int powerNumber=1;
        if(number>=0){
            for (int i = 1; i <= power; i++){
                powerNumber *= number;
            }
        }
        System.out.println(powerNumber);
        scanner.close();
    }
}
