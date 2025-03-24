import java.util.Scanner;
public class SumNaturalNumbersForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>0){
            int forOutput = 0, formulaeOutput = number * ( number + 1) / 2;
            System.out.println("The output with formulae is " + formulaeOutput );
            for(int i = number; i!=0; i--){
                forOutput+=i;
            }
            System.out.println("The output with for loop is " + forOutput);
            if(forOutput == formulaeOutput){
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
