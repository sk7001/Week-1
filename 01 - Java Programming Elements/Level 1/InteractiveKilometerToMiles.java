import java.util.Scanner; 
public class InteractiveKilometerToMiles { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int kilometers = scanner.nextInt(); 
        double miles = kilometers * 0.6213711922; 
        System.out.println("The total miles is " + miles + " mile for the given " + kilometers + " km"); 
    } 
} 
