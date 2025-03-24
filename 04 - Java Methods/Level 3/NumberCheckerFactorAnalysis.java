import java.util.Scanner;
public class NumberCheckerFactorAnalysis {
    public static int countOfNumber(long number){
        int count = 0;
        while(number!=0){
            number/=10;
            count++;
        }
        return count;
    }
    public static int[] digits(long number, int count){
        int[] digits = new int[count];
        for(int i = 0; i<count; i++){
            digits[i] = (int)(number%10);
            number/=10;
        }
        return digits;
    }
    public static int[] factors(long number){
        int countOfFactors = 0;
        for(int i = 1; i<number; i++){
            if(number%i==0){
                countOfFactors++;
            }
        }
        int[] factors = new int[countOfFactors];
        int j = 0;
        for(int i = 1; i<number; i++){
            if(number%i==0){
                factors[j]=i;
                j++;
            }
        }
        return factors;
    }
    public static int greatestFactor(int[] factors){
        int greatestFactor = factors[0];
        for(int i = 0; i<factors.length; i++){
            greatestFactor = Math.max(greatestFactor, factors[i]);
        }
        return greatestFactor;
    }
    public static int sumOfFactors(int[] factors){
        int sum = 0;
        for(int i = 0; i<factors.length; i++){
            sum+=factors[i];
        }
        return sum;
    }
    public static int productOfFactors(int[] factors){
        int product = 1;
        for(int i = 0; i<factors.length; i++){
            product*=factors[i];
        }
        return product;
    }
    public static int productOFCubeOfFactors(int[] factors){
        int productOfCube = 1;
        for(int i = 0; i<factors.length; i++){
            productOfCube *= Math.pow(factors[i], 3);
        }
        return productOfCube;
    }
    public static boolean checkPerfectNumber(int sumOfFactors, long number){
        return (long)sumOfFactors == number;
    }
    public static boolean checkAbundant(int sumOfFactors, long number){
        return (long)sumOfFactors>number;
    }
    public static boolean checkDeficient(int sumOfFactors, long number){
        return (long)sumOfFactors<number;
    }
    public static boolean checkStrong(long number){
        int count = countOfNumber(number);
        int[] digits = digits(number, count);
        int sumOfFactorialOfDigits = 0;
        for(int i = 0; i<count; i++){
            int factorial = 1;
            for(int j = digits[i]; j>=1; j--){
                factorial*=j;
            }
            sumOfFactorialOfDigits+=factorial;
        }
        return sumOfFactorialOfDigits==number;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int[] factors = factors(number);
        System.out.println("Factors of " + number + " are: ");
        for(int i = 0; i<factors.length; i++){
            System.out.println(factors[i]);
        }
        int greatestFactor = greatestFactor(factors);
        System.out.println("Greatest factor among all the factors is " + greatestFactor);
        int sumOfFactors = sumOfFactors(factors);
        System.out.println("Sum of actors is " + sumOfFactors);
        int productOfFactors = productOfFactors(factors);
        System.out.println("Product of factors is " + productOfFactors);
        int productOFCubeOfFactors = productOFCubeOfFactors(factors);
        System.out.println("Product of cube of all the factors is " + productOFCubeOfFactors);
        System.out.println("Is this a perfect number ?" + checkPerfectNumber(sumOfFactors, number));
        System.out.println("Is this a abdundant number ?" + checkAbundant(sumOfFactors, number));
        System.out.println("Is this a deficient number ?" + checkDeficient(sumOfFactors, number));
        System.out.println("Is this a strong number ?" + checkStrong(number));
        scanner.close();
    }
}
