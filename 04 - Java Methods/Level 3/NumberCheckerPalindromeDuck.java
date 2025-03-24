import java.util.Scanner;
import java.util.Arrays;
public class NumberCheckerPalindromeDuck {
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
        for(int i = count-1; i>=0; i--){
            digits[i] = (int)(number%10);
            number/=10;
        }
        return digits;
    }
    public static int[] reverseDigits(int[] digits){
        int[] reverseDigits = new int[digits.length];
        for(int i = 0; i<digits.length; i++){
            reverseDigits[i] = digits[digits.length-1-i];
        }
        return reverseDigits;
    }
    public static boolean checkReverseEqualsOriginal(int[] digits, int[] reverseDigits){
        return Arrays.equals(digits, reverseDigits);
    }
    public static boolean checkPalindrome(int[] digits, int[] reverseDigits){
        for(int i = 0; i<digits.length; i++){
            if(digits[i] != reverseDigits[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean checkDuckNumber(int[] digits){
        for(int i = 0; i < digits.length-1; i++){
            if(digits[i] == 0 ){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int count = countOfNumber(number);
        System.out.println("Count of digits in number is " + count);
        int[] digits = digits(number, count);
        for(int i = 0; i<count; i++){
            System.out.println(digits[i]);
        }
        int[] reverseDigits = reverseDigits(digits);
        System.out.println("Reversed array is");
        for(int i = 0; i<count; i++){
            System.out.println(reverseDigits[i]);
        }
        if(checkReverseEqualsOriginal(digits, reverseDigits)){
            System.out.println("Both the arrays are equal");
        }else{
            System.out.println("Both the arrays are not equal");
        }
        if(checkPalindrome(digits, reverseDigits)){
            System.out.println("The array is palindrome");
        }else{
            System.out.println("The array is not palindrome");
        }
        if(checkDuckNumber(digits)){
            System.out.println("Its is a duck number");
        }else{
            System.out.println("It is not a duck number");
        }
        scanner.close();
    }
}
