import java.util.Scanner;
public class NumberCheckerSumSquaresHarshadFrequency {
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
    public static int sum(int[] digits){
        int sum = 0;
        for(int i = 0; i<digits.length; i++){
            sum+=digits[i];
        }
        return sum;
    }
    public static int sumOfSquares(int[] digits){
        int sumOfSquares = 0;
        for(int i = 0; i<digits.length; i++){
            sumOfSquares+=Math.pow(digits[i],2);
        }
        return sumOfSquares;
    }
    public static boolean checkHarshadNumber(long number, int sum){
        return number%(long)sum==0;
    }
    public static int[][] frequency(int[] digits){
        int[][] frequency = new int[10][2];
        for(int i = 0; i<10; i++){
            frequency[i][0] = i;
            for(int k = 0; k<digits.length; k++){
                if(i==digits[k]){
                    frequency[i][1]++;
                }
            }
        }
        return frequency;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int count = countOfNumber(number);
        System.out.println("Count of digits is : " + count);
        int[] digits = digits(number, count);
        for(int i = 0; i<count; i++){
            System.out.println(digits[i]);
        }
        int sum = sum(digits);
        System.out.println("Sum of all the digits is " + sum);
        int sumOfSquares = sumOfSquares(digits);
        System.out.println("Sum of squares of all the digits is " + sumOfSquares);
        if(checkHarshadNumber(number, sum)){
            System.out.println(number + " is a harshad number");
        }else{
            System.out.println(number + " is not a harshad number");
        }
        int[][] frequency = frequency(digits);
        System.out.println("Frequency of Digits are");
        for(int i = 0; i<10; i++){
            for(int j = 0; j<2; j++){
                System.out.print(frequency[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
