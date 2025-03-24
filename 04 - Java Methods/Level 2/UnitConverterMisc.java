import java.util.Scanner;
public class UnitConverterMisc {
    public static double convertYardsToFeet(double yards){
        double yards2feet = 3;
        return yards * yards2feet;
    }
    public static double convertFeetToYards(double feet){
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    public static double convertMetersToInches(double meters){
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    public static double convertInchesToMeters(double inches){
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    public static double convertInchesToCentimeters(double inches){
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter yards to convert to feet");
        double yards = scanner.nextDouble();
        double resultyards2feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards converted to feet is " + resultyards2feet);
        System.out.println("Please enter feet to convert to yards");
        double feet = scanner.nextDouble();
        double resultfeet2yards = convertFeetToYards(feet);
        System.out.println(feet + " feet converted to yards is " + resultfeet2yards);
        System.out.println("Please enter meters to convert to inches");
        double meters = scanner.nextDouble();
        double resultmeters2inches = convertMetersToInches(meters);
        System.out.println(meters + " meters converted to inches is " + resultmeters2inches);
        System.out.println("Please enter inches to convert to meters");
        double inches = scanner.nextDouble();
        double resultinches2meters = convertInchesToMeters(inches);
        System.out.println(inches + " inches converted to meters is " + resultinches2meters);
        System.out.println("Please enter inches to convert to centimeters");
        double inches2 = scanner.nextDouble();
        double resultinches2cm = convertInchesToCentimeters(inches2);
        System.out.println(inches2 + " inches converted to centimeters is " + resultinches2cm);
        scanner.close();
    }
}
