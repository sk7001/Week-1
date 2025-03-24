import java.util.Scanner; 
public class SwapTwoNumbers { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int number1 = scanner.nextInt(), number2 = scanner.nextInt(); 
        System.out.println("The input numbers are " + number1 +" and " + number2); 
        number1 = number1+number2-(number2=number1); 
        System.out.println("The swapped numbers are " + number1 +" and " + number2); 
    } 
} 
