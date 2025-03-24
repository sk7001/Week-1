import java.util.Scanner;
public class SumNaturalNumbersWhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>0){
            int whileOutput = 0, formulaeOutput = number * ( number + 1 ) / 2;
            System.out.println("The output with formulae is " + formulaeOutput );
            while(number!=0){
                whileOutput+=number;
                number--;
            }
            System.out.println("The output with while loop is " + whileOutput );
            if(whileOutput == formulaeOutput){
                System.out.println("Both the outputs are same.");
            }
            else{
                System.out.println("Both the outputs are not same.");
            }
        }
        else{
            System.out.println("The input number is not a natural number.");
        }
        scanner.close();
    }
}
