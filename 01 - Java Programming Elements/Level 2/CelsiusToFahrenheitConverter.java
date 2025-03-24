import java.util.Scanner; 
public class CelsiusToFahrenheitConverter { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        float celsius = scanner.nextFloat(); 
        double farhenheit = (celsius * 9/5)+32; 
        System.out.println("The " + celsius + " celsius is " + farhenheit + " fahrenheit"); 
    } 
} 
