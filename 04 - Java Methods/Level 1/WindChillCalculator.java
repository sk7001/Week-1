import java.util.Scanner;
public class WindChillCalculator {
    public static double calculateWindChill(double temperature, double windSpeed){
        double calculateWindChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return calculateWindChill;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give the temperature");
        double temperature = scanner.nextDouble();
        System.out.println("Please give the wind speed");
        double windSpeed = scanner.nextDouble();
        double calculateWindChill = calculateWindChill(temperature, windSpeed);
        System.out.println("The wind chill temperature is " + calculateWindChill);
        scanner.close();
    }
}
