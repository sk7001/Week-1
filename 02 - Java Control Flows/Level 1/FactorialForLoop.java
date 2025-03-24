import java.util.Scanner;
public class FactorialForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>0){
            int forOutput = 1;
            for(int i = number; i!=0; i--){
                forOutput*=i;
            }
            System.out.println("The output with for loop is " + forOutput);
        }
        else{
            System.out.println("The input number is not a natural number.");
        }
        scanner.close();
    }
}
