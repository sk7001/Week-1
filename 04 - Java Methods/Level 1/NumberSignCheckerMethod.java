import java.util.Scanner;
public class NumberSignCheckerMethod {
    public static int checkNumber(int number){
        if(number>0){
            return 1;
        }else if(number<0){
            return -1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int number = scanner.nextInt();
        int checkNumber = checkNumber(number);
        System.out.println(checkNumber);
        scanner.close();
    }
}
