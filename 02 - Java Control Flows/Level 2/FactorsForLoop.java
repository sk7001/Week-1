import java.util.Scanner;
public class FactorsForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number= scanner.nextInt();
        for(int i = 1; i<number; i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
