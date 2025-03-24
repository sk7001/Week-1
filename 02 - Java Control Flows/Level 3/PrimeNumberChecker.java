import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean check=false;
        if(number <= 1){
            System.out.println(number + " is not a prime number");
        }else{
            for(int i = 2; i < number; i++){
                if(number%i==0){
                    check=true;
                    break;
                }
            }
            if(check){
                System.out.println(number + " is not a prime number.");
            }else{
                System.out.println(number + " is a prime number.");
            }
        }
        scanner.close();
    }
}
