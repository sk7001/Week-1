import java.util.Scanner;
public class ReverseNumberArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long originalNumber = number;
        int count = 0;
        while(number!=0) {
            number/=10;
            count++;
        }
        int[] reverseDigits = new int[count];
        for(int i = 0; i<count; i++){
            reverseDigits[i] = (int) (originalNumber%10);
            originalNumber/=10;
        }
        for(int i = 0; i<count; i++){
            System.out.print(reverseDigits[i]);
        }
        scanner.close();
    }
}
