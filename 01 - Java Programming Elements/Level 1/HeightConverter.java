import java.util.Scanner; 
public class HeightConverter { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        float cm = scanner.nextFloat(); 
        double inch = cm * 0.393701; 
        double foot = inch * 0.0833333; 
        System.out.println("Your Height in cm is " + cm + " while in feet is " + foot + " and inches is " + inch); 
    } 
} 
