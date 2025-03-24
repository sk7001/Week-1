import java.util.Scanner;
public class DigitFrequencyArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong(), originalNumber = number;
        int count = 0;
        while(number!=0){
            count++;
            number/=10;
        }
        int[] digits = new int[count];
        int[] frequency = new int[10];
        number = originalNumber;
        for(int i = 0; i<count ; i++){
            digits[i] = (int)(number%10);
            number/=10;
        }
        for(int i= 0; i<10; i++){
            for(int j=0; j<count; j++){
                if(i==digits[j]){
                    frequency[i]++;
                }
            }
        }
        for(int i = 0; i<10; i++){
            System.out.println(i + " : " + frequency[i]);
        }
        scanner.close();
    }
}
