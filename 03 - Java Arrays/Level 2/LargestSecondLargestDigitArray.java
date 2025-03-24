import java.util.Scanner;
public class LargestSecondLargestDigitArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(), maxDigit = 10, index = 0;
        int[] digits = new int[maxDigit];
        while(number!=0) {
            digits[index] = number%10;
            index++;
            if(index==maxDigit){
                break;
            }
            number/=10;
        }
        int largest = 0, secondLargest = 0;
        for(int i = 0; i<maxDigit;i++){
            if(largest<digits[i]){
                largest = digits[i];
            }
            if(secondLargest<digits[i] && digits[i]<largest){
                secondLargest = digits[i];
            }
        }
        System.out.println(largest + " is the largest digit from the given number");
        System.out.println(secondLargest + " is the second largest digit from the given number");
        scanner.close();
    }
}
