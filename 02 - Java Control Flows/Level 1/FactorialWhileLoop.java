import java.util.Scanner;
public class FactorialWhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>0){
            int whileOutput = 1;
            while(number!=0){
                whileOutput*=number;
                --number;
            }
            System.out.println("The output with while loop is " + whileOutput );
        }
        else{
            System.out.println("The input number is not a natural number.");
        }
        scanner.close();
    }
}
