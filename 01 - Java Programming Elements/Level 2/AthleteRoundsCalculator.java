import java.util.Scanner; 
public class AthleteRoundsCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Please enter the length of sides of the triangular park:"); 
        float side1 = scanner.nextFloat(), side2 = scanner.nextFloat(), side3 = scanner.nextFloat(); 
        float numberOfRounds = 5/(side1 + side2 + side3); 
        System.out.println("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km"); 
    } 
} 
