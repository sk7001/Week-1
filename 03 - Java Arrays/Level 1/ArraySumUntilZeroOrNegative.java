import java.util.Scanner;
public class ArraySumUntilZeroOrNegative {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int i = 0;
        while(true) {
            double input = scanner.nextDouble();
            if(input <= 0 || i == numbers.length){
                break;
            }
            numbers[i] = input;
            i++;
        }
        for(int j = 0; j < i; j++){
            total += numbers[j];
        }
        System.out.println(total);
        scanner.close();
    }
}
