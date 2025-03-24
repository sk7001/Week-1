import java.util.Scanner; 
public class PoundsToKilogramsConverter { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Please enter the weight in pounds"); 
        float weightInPounds = scanner.nextInt(); 
        float weightInKgs = weightInPounds * (float)2.2; 
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKgs); 
    } 
} 
