import java.util.Scanner; 
public class JourneyAverageSpeedCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter your name"); 
        String name = scanner.nextLine(); 
        System.out.println("Enter from city"); 
        String fromCity = scanner.nextLine(); 
        System.out.println("Enter via city"); 
        String viaCity = scanner.nextLine(); 
        System.out.println("Enter to city"); 
        String toCity = scanner.nextLine(); 
        System.out.println("Enter distance from " + fromCity + " to " + viaCity ); 
        float fromToVia = scanner.nextFloat(); 
        System.out.println("Enter distance from " + viaCity + " to " + toCity); 
        float viaToFinalCity = scanner.nextFloat(); 
        System.out.println("Enter the total time from " + fromCity + " to " + toCity ); 
        int totalTime = scanner.nextInt(); 
        float totalDistance = fromToVia + viaToFinalCity; 
        float averageSpeed = totalDistance/totalTime; 
        System.out.println("Traveller : " + name); 
        System.out.println("Route : " + fromCity + "--(" + fromToVia +")-->" + viaCity + "--(" + viaToFinalCity +")-->" + toCity); 
        System.out.println("Total Distance : " + totalDistance); 
        System.out.println("Total Time : " + totalTime); 
        System.out.println("Average Speed : " + averageSpeed); 
    } 
} 
