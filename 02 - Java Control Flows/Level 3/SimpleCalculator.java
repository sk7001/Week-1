import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble(), second = scanner.nextDouble();
        String op = scanner.next();
        switch(op){
            case "+":
                System.out.println(first+second);
                break;
            case "-":
                System.out.println(first-second);
                break;
            case "*":
                System.out.println(first*second);
                break;
            case "/":
                System.out.println(first/second);
                break;
            default:
                System.out.println("Invalid operator");
        }
        scanner.close();
    }
}
