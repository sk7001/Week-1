import java.util.Scanner;
public class DigitCounter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(), count = 0;
        int temp = number;
        if(temp==0) count = 1;
        while(temp!=0){
            temp/=10;
            count++;
        }
        System.out.println(count);
        scanner.close();
    }
}
