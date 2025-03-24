import java.util.Scanner;
public class FactorsArrayAnalysis {
    public static int[] factors(int number){
        int count = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                count++;
            }
        }
        int[] factors = new int[count];
        int j = 0;
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                factors[j] = i;
                j++;
            }
        }
        return factors;
    }
    public static int sum(int[] factors){
        int sum = 0;
        for(int i = 0; i < factors.length; i++){
            sum += factors[i];
        }
        return sum;
    }
    public static int product(int[] factors){
        int product = 1;
        for(int i = 0; i < factors.length; i++){
            product *= factors[i];
        }
        return product;
    }
    public static int sumOfSquares(int[] factors){
        int sumOfSquares = 0;
        for(int i = 0; i < factors.length; i++){
            sumOfSquares += Math.pow(factors[i], 2);
        }
        return sumOfSquares;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scanner.nextInt();
        int[] results = factors(number);
        System.out.println("The factors are of " + number + " are: ");
        for(int i = 0; i < results.length; i++){
            System.out.println(results[i] + " ");
        }
        int sum = sum(results);
        System.out.println("The sum of factors is " + sum);
        int product = product(results);
        System.out.println("The product of factors is " + product);
        int sumOfSquares = sumOfSquares(results);
        System.out.println("The sum of squares of factors is " + sumOfSquares);
        scanner.close();
    }
}
