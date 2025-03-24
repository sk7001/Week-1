import java.util.Scanner;
public class NumberCheckerDuckArmstrongExtremes {
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
    public static boolean checkDuckNumber(int[] digits){
        for(int i = 0; i < digits.length-1; i++){
            if(digits[i] == 0 ){
                return true;
            }
        }
        return false;
    }
    public static boolean checkArmstrong(long number, int[] digits){
        long armstrongNumber = 0;
        for(int i = 0; i<digits.length; i++){
            armstrongNumber+=Math.pow(digits[i], digits.length);
        }
        return number == armstrongNumber;
    }
    public static int[] largestAndSecondLargest(int[] digits){
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        for(int i = 0; i<digits.length;i++){
            if(max<digits[i]){
                secMax = max;
                max=digits[i];
            }
            if(digits[i]<max && secMax<digits[i]){
                secMax = digits[i];
            }
        }
        int[] maxAndSecMax = {max,secMax};
        return maxAndSecMax;
    }
    public static int[] smallestAndSecondSmallest(int[] digits){
        int min = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE;
        for(int i = 0; i<digits.length;i++){
            if(min>digits[i]){
                secMin = min;
                min=digits[i];
            }
            if(digits[i]>min && secMin>digits[i]){
                secMin = digits[i];
            }
        }
        int[] minAndSecMin = {min, secMin};
        return minAndSecMin;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        long number = scanner.nextLong();
        int count = countOfNumber(number);
        int[] digits = digits(number, count);
        int[] minAndSecMin = smallestAndSecondSmallest(digits);
        int[] maxAndSecMax = largestAndSecondLargest(digits);
        System.out.println("Count of digits is : " + count);
        for(int i = 0; i<count; i++){
            System.out.println(digits[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Is a duck number ? : " + checkDuckNumber(digits));
        System.out.println("Is a armstrong number ? : " + checkArmstrong(number, digits));
        System.out.println("Minimum and Second minimum values are : ");
        for(int i = 0; i<minAndSecMin.length; i++){
            System.out.println(minAndSecMin[i] + " " );
        }
        System.out.println("Maximum and Second maximum values are : ");
        for(int i = 0; i<maxAndSecMax.length; i++){
            System.out.println(maxAndSecMax[i] + " " );
        }
        scanner.close();
    }
}
