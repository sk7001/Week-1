import java.util.Scanner;
public class OddEvenArraySeparator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] odd = new int[(number/2)+1];
        int[] even = new int[(number/2)+1];
        int j = 0, k = 0;
        if(number >= 1){
            for(int i = 0; i < number ; i++){
                int input = scanner.nextInt();
                if(input % 2 == 0){
                    even[j] = input;
                    j++;
                }else{
                    odd[k] = input;
                    k++;
                }
            }
            System.out.println("Odd numbers are:");
            for(int i = 0; i < k; i++){
                System.out.println(odd[i]);
            }
            System.out.println("Even numbers are:");
            for(int i = 0; i < j; i++){
                System.out.println(even[i]);
            }
        }else{
            System.out.println("Please enter a natural number.");
        }
        scanner.close();
    }
}
