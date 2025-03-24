import java.util.Scanner; 
public class TriangleAreaCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        double heightInCm = scanner.nextFloat(), baseInCm = scanner.nextFloat(); 
        double heightInInches = heightInCm * 0.393701, baseIninches = baseInCm * 0.393701; 
        double areaInCm = 1.0 / 2.0 * (baseInCm * heightInCm), areaInInches = 1.0 / 2.0 * (baseIninches * heightInInches); 
        System.out.println("The area of Triangle with base " + baseInCm + " and height " + heightInCm + " is " + areaInCm + " in square cm and " + areaInInches + " in square inches"); 
    } 
} 
