import java.util.Scanner; 
public class FahrenheitToCelsiusConverter { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        float farhenheit = scanner.nextFloat(); 
        double celsius = (farhenheit - 32) * 5/9; 
        System.out.println("The " + farhenheit + " farhenheit is " + celsius + " celsius"); 
    } 
} 
