import java.util.Scanner; 
public class DoubleOperationDemo { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble(); 
        double operation1 = a + b * c, operation2 = a * b + c, operation3 = c + a / b, operation4 = a % b + c; 
        System.out.println("The results of Int Operations are " + operation1 + "," + operation2 + "," + operation3 + ",and " + operation4 ); 
    } 
} 
