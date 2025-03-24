import java.util.Scanner;
public class SumUntilZeroOrNegativeCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double number, addedNumber=0;
        while(true){
            number = scanner.nextDouble();
            if(number<=0){
                break;
            }
            else{
                addedNumber += number;
            }
        }
        System.out.println("Number added till the input is zero or negative is " + addedNumber);
        scanner.close();
    }
}
