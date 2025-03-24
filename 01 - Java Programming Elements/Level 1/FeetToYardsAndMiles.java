import java.util.Scanner; 
public class FeetToYardsAndMiles { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        int feets = scanner.nextInt(); 
        double yards = feets * 0.333333; 
        double miles = yards * 0.000568182; 
        System.out.println("The distance in feets is " + feets + " while the distance in yards is " + yards + " and miles is " + miles); 
    } 
} 
