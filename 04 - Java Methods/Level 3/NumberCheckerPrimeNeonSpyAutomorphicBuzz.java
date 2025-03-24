import java.util.Scanner;
public class NumberCheckerPrimeNeonSpyAutomorphicBuzz {
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
    public static boolean checkPrime(long number){
        if(number <= 1) return false;
        for(int i = 2; i<=Math.sqrt(number); i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean checkNeon(long number){
        long square = (long)Math.pow(number, 2);
        int count = countOfNumber(square);
        int[] digits = digits(square, count);
        int sumOfSquare = 0;
        for(int i = 0; i< count; i++){
            sumOfSquare+=digits[i];
        }
        return sumOfSquare==number;
    }
    public static boolean checkSpy(long number){
        int count = countOfNumber(number);
        int[] digits = digits(number, count);
        int sum = 0, product = 1;
        for(int i = 0; i<count; i++){
            sum+=digits[i];
            product*=digits[i];
        }
        return sum==product;
    }
    public static boolean checkAutomorphic(long number){
        long square = (long)Math.pow(number, 2);
        int countOfSquare = countOfNumber(square);
        int[] digitsOfSquare = digits(square, countOfSquare);
        int count = countOfNumber(number);
        int[] digits = digits(number, count);
        boolean check = true;
        for(int i = 0; i<count; i++){
            if(digits[count-1-i]!=digitsOfSquare[countOfSquare-1-i]){
                check = false;
                break;
            }
        }
        return check;
    }
    public static boolean checkBuzz(long number){
        return (number%10==7 || number%7==0);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        System.out.println("Is that a prime number ?" + checkPrime(number));
        System.out.println("Is that a neon number ?" + checkNeon(number));
        System.out.println("Is that a spy number ?" + checkSpy(number));
        System.out.println("Is that an automorphic number ?" + checkAutomorphic(number));
        System.out.println("Is that a buzz number ?" + checkBuzz(number));
        scanner.close();
    }
}
