import java.util.Scanner;
public class PowerWhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number= scanner.nextInt(), counter = 0, result = 1;
        System.out.println("Please enter the power");
        int power= scanner.nextInt();
        while(counter!=power){
            result *= number;
            counter++;
        }
        System.out.println(result);
        scanner.close();
    }
}
