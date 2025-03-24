import java.util.Scanner;
public class UnitConverterTemperatureWeightVolume {
    public static double convertFarhenheitToCelsius(double farhenheit){
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }
    public static double convertCelsiusToFarhenheit(double celsius){
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }
    public static double convertPoundsToKilograms(double pounds){
        double pounds2kilograms = 0.453592 * pounds;
        return pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms){
        double kilograms2pounds = 2.20462 * kilograms;
        return kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons){
        double gallons2liters = 3.78541 * gallons;
        return gallons2liters;
    }
    public static double convertLitersToGallons(double liters){
        double liters2gallons = 0.264172 * liters;
        return liters2gallons;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter farhenheit to convert to celsius");
        double farhenheit = scanner.nextDouble();
        double resultfarhenheit2celsius = convertFarhenheitToCelsius(farhenheit);
        System.out.println(farhenheit + " farhenheit converted to celsius is " + resultfarhenheit2celsius);
        System.out.println("Please enter celsius to convert to farhenheit");
        double celsius = scanner.nextDouble();
        double resultcelsius2farhenheit = convertCelsiusToFarhenheit(celsius);
        System.out.println(celsius + " celsius converted to farhenheit is " + resultcelsius2farhenheit);
        System.out.println("Please enter pounds to convert to kilograms");
        double pounds = scanner.nextDouble();
        double resultpounds2kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds converted to kilograms is " + resultpounds2kilograms);
        System.out.println("Please enter kilograms to convert to pounds");
        double kilograms = scanner.nextDouble();
        double resultkilograms2pounds = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms converted to pounds is " + resultkilograms2pounds);
        System.out.println("Please enter gallons to convert to liters");
        double gallons = scanner.nextDouble();
        double resultgallons2liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons converted to liters is " + resultgallons2liters);
        System.out.println("Please enter liters to convert to gallons");
        double liters = scanner.nextDouble();
        double resultliters2gallons = convertLitersToGallons(liters);
        System.out.println(liters + " liters converted to gallons is " + resultliters2gallons);
        scanner.close();
    }
}
