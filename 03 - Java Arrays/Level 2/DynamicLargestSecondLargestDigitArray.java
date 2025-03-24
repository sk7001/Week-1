import java.util.Scanner;
public class DynamicLargestSecondLargestDigitArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int maxDigit = 10, index = 0;
        int[] digits = new int[maxDigit];
        while(number!=0) {
            if(index==maxDigit){
                maxDigit+=10;
                int[] temp = new int[maxDigit];
                for(int j=0; j<index; j++){
                    temp[j] = digits[j];
                }
                digits = temp;
            }
            digits[index] = (int)(number%10);
            number/=10;
            index++;
        }
        int largest = -1, secondLargest = -1;
        for(int i =0; i<index;i++){
            if(largest<digits[i]){
                secondLargest = largest;
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
