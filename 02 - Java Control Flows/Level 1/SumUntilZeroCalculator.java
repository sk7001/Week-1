import java.util.Scanner;
public class SumUntilZeroCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double number, addedNumber=0;
        number = scanner.nextDouble();
        while (number != 0){
            number = scanner.nextDouble();
            addedNumber+=number;
        }
        System.out.println("Number added till the input is zero " + addedNumber);
        scanner.close();
    }
}
