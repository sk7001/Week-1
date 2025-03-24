import java.util.Scanner;
public class UnitConverterLength {
    public static double convertKmToMiles(double km){
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles){
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMetersToFeet(double meters){
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double convertFeetToMeters(double feet){
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter kilometers to convert to miles");
        double km = scanner.nextDouble();
        double resultkm2miles = convertKmToMiles(km);
        System.out.println(km + " kilometers converted to miles is " + resultkm2miles);
        System.out.println("Please enter miles to convert to kilometers");
        double miles = scanner.nextDouble();
        double resultmiles2km = convertMilesToKm(miles);
        System.out.println(miles + " miles converted to kilometers is " + resultmiles2km);
        System.out.println("Please enter meters to convert to feet");
        double meters = scanner.nextDouble();
        double resultmeters2feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters converted to feet is " + resultmeters2feet);
        System.out.println("Please enter feet to convert to meters");
        double feet = scanner.nextDouble();
        double resultfeet2meters = convertFeetToMeters(feet);
        System.out.println(feet + " feet converted to meters is " + resultfeet2meters);
        scanner.close();
    }
}
