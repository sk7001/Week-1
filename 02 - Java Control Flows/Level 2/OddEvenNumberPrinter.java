import java.util.Scanner;
public class OddEvenNumberPrinter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number > 0){
            for(int i = 1 ; i <= number ; i++){
                if(i%2==0){
                    System.out.println( i + " is even number");
                }
                else{
                    System.out.println( i + " is odd number");
                }
            }
        }
        else{
            System.out.println(number + " is not a natural number" );
        }
        scanner.close();
    }
}
