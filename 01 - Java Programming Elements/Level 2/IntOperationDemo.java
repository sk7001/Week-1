import java.util.Scanner; 
public class IntOperationDemo { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt(); 
        float operation1 = a + b * c, operation2 = a * b + c, operation3 = c + (float)a / b, operation4 = a % b + c; 
        System.out.println("The results of Int Operations are " + operation1 + "," + operation2 + "," + operation3 + ",and " + operation4 ); 
    } 
} 
