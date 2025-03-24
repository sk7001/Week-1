import java.util.Scanner;
public class SumOfNaturalNumbersMethod {
    public static void sumOfNaturalNumbers(int number){
        int sum = 0;
        for(int i = 0; i<=number; i++){
            sum += i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        sumOfNaturalNumbers(number);
        scanner.close();
    }
}
